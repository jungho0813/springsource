/**
 *  댓글 처리 자바스크립트 모듈
 */

let replyService = (function () {
  //reply : 댓글 작성 자바스크립트 객체
  //callback : function
  function add(reply, callback) {
    console.log("add 함수");

    fetch("/replies/new", {
      method: "post",
      headers: {
        "content-type": "application/json",
      },
      body: JSON.stringify(reply),
    })
      .then((response) => {
        if (!response.ok) {
          throw new Error("입력 오류");
        }
        return response.text();
      })
      .then((data) => {
        if (callback) {
          callback(data);
        }
      })
      .catch((error) => console.log(error));
  }
  return {
    add: add,
  };
})();
