/**
 *
 */

const form = document.querySelector("#operForm");

// 수정 버튼 클릭 시 operForm 보내기
// /board/modify 전송
document.querySelector(".btn-info").addEventListener("click", () => {
  form.action = "/board/modify";
  form.submit();
});

// 목록 버튼 클릭 시 operForm 보내기
// /board/list 전송
// bno 제거
document.querySelector(".btn-secondary").addEventListener("click", () => {
  form.firstElementChild.remove();
  form.action = "/board/list";
  form.submit();
});

// 댓글 작업 호출 => 댓글 작성 버튼 클릭 시
// submit 중지, reply, replyer 가져오기
document.querySelector("#replyForm").addEventListener("submit", (e) => {
  e.preventDefault();

  const reply = document.querySelector("#reply");
  const replyer = document.querySelector("#replyer");

  replyService.add(
    { bno: bno, reply: reply.value, replyer: replyer.value },
    (result) => {
      alert(result);
    }
  );
});
