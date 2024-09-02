package com.jstory.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:3000")
public class JstoryProjectController {
    
    // 프로젝트
    @GetMapping("/project")
    public List<Map<String, Object>> projectPage() {  
    	
    	List<Map<String, Object>> projectList = new ArrayList<>();
    	
    	// 첫 번째 프로젝트 데이터
    	Map<String, Object> project1 = new HashMap<>();
        project1.put("id", 1);
        project1.put("name", "LGU+ 관리자(Admin) 페이지 현대화 프로젝트");
        project1.put("period", "2024.06 ~ 2024.09");
        project1.put("tasks", Map.of(
            "업무명", "화면 퍼블리싱 및 프론트엔드 개발",
            "사용 언어", "Java, Thymeleaf, BootstrapCSS, Javascript, MongoDB, MySQL",
            "개발환경", "Eclipse(SpringBoot)",
            "소속 회사", "LGU+ (소프트XX)",
            "성과", "7월 한달 간 구현 / 8월 테스트 기간 / 9월 인수인계 단계",
            "주요 업무", List.of(
                "화면 퍼블리싱부터 프론트엔드 개발, 프론트와 백 API 연동",
                "화면 설계서 및 규격서를 보면서 구현 단계 (7월)",
                "구현한 화면에 대해서 직접 테스트 진행 및 수정 (8월 진행 예정)",
                "인수테스트 및 최종 완성 (9월)",
                "각 페이지 리스트 목록 CRUD"
            )
        ));

        // 두 번째 프로젝트 데이터
        Map<String, Object> project2 = new HashMap<>();
        project2.put("id", 2);
        project2.put("name", "LX (한국국토정보공사) 플랫폼 고도화 프로젝트");
        project2.put("period", "2023.11 ~ 2024.01");
        project2.put("tasks", Map.of(
            "업무명", "시스템 개선 및 API 관리",
            "사용 언어", "Java(Spring), PostgreSQL",
            "개발환경", "Eclipse(전자정부 프레임워크), SpringBoot",
            "소속 회사", "온품 (제XXX시스템)",
            "소속 부서", "플랫폼 2D 환경 고도화 팀",
            "주요 업무", List.of(
                "API 사용건 수 요구 분석 (ppt제작)",
                "막대그래프 -> 선형그래프 (차트라이브러리 - chart.js 사용)",
                "영상타일링 레이어 관리 신규 개발",
                "요구 분석 (PPT 정리)",
                "오픈API 데이터 GET",
                "기존에 만들어져 있던 DB TABLE 확인 및 수정작업",
                "미리보기 로직설계"
            )
        ));
        
        // 세 번째 프로젝트 데이터
        Map<String, Object> project3 = new HashMap<>();
        project3.put("id", 3);
        project3.put("name", "신한은행 통합단말 차세대프로젝트");
        project3.put("period", "2022.01 ~ 2022.10");
        project3.put("tasks", Map.of(
            "업무명", "화면로직 개발 및 데이터 매핑",
            "사용 언어", "XML, BootstrapCSS, Javascript, Java(자체함수)",
            "개발환경", "Websquare 5, SVN",
            "소속 회사", "LG CNS (인스XXX)",
            "소속 부서", "전환개발 (화면로직개발)",
            "성과 및 결과", "인수테스트 완료 후 클라이언트에게 인수인계 완료",
            "참고자료", "https://byline.network/2021/01/21-119",
            "주요 업무", List.of(
                "구형통합단말( map과 txt파일 ) → 신형통합단말( xml ) 로 전환 개발",
                "서비스 매핑 확인 및 수정 (DB에서 데이터가 잘 내려오는지 확인)",
                "결함목록 확인 및 수정 (통합테스트, 인수테스트 단계 개발 수행)"
            )
        ));

        // 프로젝트 리스트에 추가
        projectList.add(project1);
        projectList.add(project2);
        projectList.add(project3);
        
        
        return projectList;
    }
}