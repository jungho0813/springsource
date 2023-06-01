<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Board Read</h1>
</div>
<div class="row">
	<div class="col">
		<form action="" method="post">
			<div class="form-group">
				<label for="title">Title</label>
				<input type="text" class="form-control" id="title" name="title" readonly value="${dto.title}">
			</div>
			<div class="form-group">
				<label for="content">Content</label>
				<textarea class="form-control" id="content" rows="10" name="content" readonly>${dto.content}</textarea>
			</div>
			<div class="form-group">
				<label for="writer">Writer</label>
				<input type="text" class="form-control" id="writer" name="writer" readonly value="${dto.writer}">
			</div>
			<button type="button" class="btn btn-info">수정</button>
			<button type="button" class="btn btn-secondary">목록</button>
		</form>
	</div>
</div>
<!-- 댓글 작성 폼 -->
<form action="" class="mt-3" id="replyForm">
	<div class="from-row">
		<div class="col-11">
			<textarea name="reply" id="reply" rows="5" class="form-control" ></textarea>
		</div>
		<div class="col my-2">
			<div class="form-row my-2">
				<input type="text" name="replyer" id="replyer" class="form-control" />
			</div>
			<div class="form-row my-2">
				<button class="btn btn-success btn-block">댓글 작성</button>
			</div>
		</div>
	</div>
</form>


<form action="" id="operForm">
	<input type="hidden" name="bno" value="${dto.bno}" />
	<input type="hidden" name="page" value="${cri.page}" />
	<input type="hidden" name="amount" value="${cri.amount}" />
	<input type="hidden" name="type" value="${cri.type}" />
	<input type="hidden" name="keyword" value="${cri.keyword}" />
</form>
<script>
	//게시물 글번호 가져오기
	const bno = ${dto.bno}
</script>
<script src="/resources/js/reply.js"></script>
<script src="/resources/js/read.js"></script>
<%@ include file="../include/footer.jsp"%>









