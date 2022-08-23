package co.micol.prj.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // member 관리 컨트롤러
public class MemberController {

	// @RequestMapping("요청명") => post, get 모두 지원
	
	// 보안상 get, post 구분하는걸 권장
	// @GetMapping("요청명") => 전달 인자(파라미터)가 없을때
	// @PostMapping("요청명")
	
	// 리스트
	@GetMapping("memberList.do")
	public String memberList() {
		return "member/memberList";
	}

	// 검색
	@RequestMapping("memberSearch.do")
	public String memberSearch() {
		return "member/memberSearch";
	}

	// 등록
	@RequestMapping("memberInsert.do")
	public String memberInsert() {
		return "member/memberInsert";
	}
}
