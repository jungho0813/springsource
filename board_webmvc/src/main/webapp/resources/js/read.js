/**
 *
 */
const form = document.querySelector("#operForm");

// 수정 버튼 클릭 시 operForm
// /board/modify 로 전송
document.querySelector(".btn-info").addEventListener("click", () => {
  form.action = "/board/modify";
  form.submit();
});

// 목록 버튼 클릭 시 operForm 보내기
// /board/list 전송
// bno제거
document.querySelector(".btn-secondary").addEventListener("click", () => {
  form.firstElementChild.remove();
  form.action = "/board/list";
  form.submit();
});
