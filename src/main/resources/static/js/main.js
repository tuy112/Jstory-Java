// 1. 카드 클릭시 modal 효과
function showModalAndRedirect(url) {
    // 모달 표시
    const modal = document.getElementById('modal');
	modal.style.display = 'block';

    // 4초 후 페이지로 이동
    setTimeout(function() {
        window.location.href = url;
    }, 4000);
	
	// 원래대로 돌려놓기 (5초뒤)
	setTimeout(function() {
        modal.style.display = 'none';
    }, 5000);
}






// 글쓰기 완료 버튼 (db연결-ajax)
function sendDb(event) {
    sendform = event.target;
    event.preventDefault();

    // 유효성 검사
    if(sendForm.mName.value === ""){
        alert('산 이름을 입력해주세요');
        sendForm.mName.focus();
        return;
    }
    if(sendForm.mDay.value === ""){
        alert('산행 일을 입력해주세요');
        sendForm.mDay.focus();
        return;
    }
    if(sendForm.writeArea.value === ""){
        alert('산행 때 일어난 일을 적어주세요. 최소10자이상..');
        sendForm.writeArea.focus();
        return;
    }
}


