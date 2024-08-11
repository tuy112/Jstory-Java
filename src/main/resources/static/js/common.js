// 1. header 햄버거 메뉴 기능
function menu() {
	const sideMenu = document.getElementById("side-menu");
	    
    // 메뉴의 상태에 따라 클래스를 추가/제거하여 열고 닫음
    if (sideMenu.classList.contains("open")) {
        sideMenu.classList.remove("open");
    } else {
        sideMenu.classList.add("open");
    }
}
