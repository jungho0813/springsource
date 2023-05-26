package com.spring.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.multipart.MultipartFile;

import com.spring.domain.AttachFileDTO;

import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnails;

@Controller
@Slf4j
public class UploadAjaxController {

	//uploadAjax 컨트롤러 생성
	@GetMapping("/uploadAjax")
	public void uploadAjaxGet() {
		log.info("uploadAjax 폼 요청");
	}
	
	@PostMapping("/uploadAjax")
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		log.info("upload 요청");
		
		List<AttachFileDTO> fileList = new ArrayList<AttachFileDTO>();
		
		String uploadPath = "c:\\upload";
		String uploadFolderPath = getFolder();
		File uploadFullPath = new File(uploadPath,uploadFolderPath);
		
		if(!uploadFullPath.exists()) {
			uploadFullPath.mkdir();
		}
		
		for (MultipartFile multipartFile : uploadFile) {
			log.info("file name "+multipartFile.getOriginalFilename());
			log.info("filesize "+multipartFile.getSize());
			
			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString() + "_" + multipartFile.getOriginalFilename();
			
			File saveFile = new File(uploadPath,fileName);
			// 파일 한 개당 AttachFileDTo 생성
			AttachFileDTO attach = new AttachFileDTO();
			attach.setFileName(multipartFile.getOriginalFilename());
			attach.setUploadPath(uploadFolderPath);
			attach.setUuid(uuid.toString());
			
			try {
				//원본 파일 저장
				multipartFile.transferTo(saveFile);
				
				//업로드된 파일 타입 체크
				if(checkImageType(saveFile)) {
					attach.setFileType(true);
				
				//이미지 파일이라면 썸네일 이미지로 저장
				//원본 이미지 읽어오기
				BufferedImage origin = ImageIO.read(saveFile);
				//썸네일 파일명
				File thumbnail = new File(uploadFullPath,"s_"+fileName);
				
				double ratio = 10;
				int width = (int) (origin.getWidth() / ratio);
				int height = (int) (origin.getHeight() / ratio);
				
				Thumbnails.of(origin).size(width, height).toFile(thumbnail);
			}
			
					
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fileList.add(attach);
		}
		
		
		return new ResponseEntity<>(fileList, HttpStatus.OK);
	}
	
	//파일 요청시 파일 보내주기
	@GetMapping("/display")
	public ResponseEntity<byte[]> getFile(String fileName){
		log.info("파일 요청 "+ fileName);
		
		File file = new File("c:\\upload\\"+fileName);
		
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<byte[]> result = null;
		try {
			headers.add("content-type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(file),HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@GetMapping(value="/download",produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<Resource> downloadFile(String fileName,@RequestHeader("User-Agent") String userAgent){
		log.info("파일 다운로드 요청 "+fileName);
		
		Resource resource = new FileSystemResource("c:\\upload\\"+fileName);
		
		if(!resource.exists()) {
			return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
		}
		HttpHeaders headers = new HttpHeaders();
		
		String downloadName = null;
		try {
			if(userAgent.contains("Trident") || userAgent.contains("Edge")) {
				downloadName = URLEncoder.encode(resource.getFilename(),"utf-8").replaceAll("\\+", " ");
			}else {
				downloadName = new String(resource.getFilename().getBytes("utf-8"), "ISO-8859-1");
			}
			headers.add("Content-Disposition", "attachment;filename="+downloadName);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Resource>(resource,headers,HttpStatus.OK);
	}
	
	
	private boolean checkImageType(File file) {
		String contentType;
		try {
			contentType = Files.probeContentType(file.toPath());
			return contentType.startsWith("image");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}
}
