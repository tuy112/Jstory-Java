// 글쓰기 버튼 모달 띄우기
function openModal() {
    document.getElementById('modal').style.display = 'flex';
}
// 글쓰기 버튼 모달 닫기
function closeModal() {
    document.getElementById('modal').style.display = 'none';
}

function submitForm() {
    const form = document.getElementById('projectForm');
    const title = document.getElementById('title').value;
    const period = document.getElementById('period').value;
    const tasks = document.getElementById('tasks').value;
    const language = document.getElementById('language').value;
    const environment = document.getElementById('environment').value;
    const company = document.getElementById('company').value;
    const outcome = document.getElementById('outcome').value;

    // AJAX 요청을 보내서 서버에 새 프로젝트 데이터를 추가합니다.
    fetch('/project/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            name: title,
            period: period,
            tasks: {
                '업무명': tasks,
                '사용 언어': language,
                '개발환경': environment,
                '소속 회사': company,
                '성과': outcome,
                '주요 업무': mainTasks
            }
        })
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            // 데이터가 성공적으로 추가되면 페이지를 새로고침하여 목록을 갱신합니다.
            location.reload();
        } else {
            alert('프로젝트 추가에 실패했습니다.');
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });

    closeModal();
}