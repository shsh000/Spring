package co.hee.prj.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {
	
	// 로그인 폼 호출
	@GetMapping("/memberLoginForm.do")
	public String memberLoginForm() {
		return "noTiles/member/memberLoginForm";
	}
	
	// 회원가입 폼 호출
	@GetMapping("/memberJoinForm.do")
	public String memberJoinForm() {
		return "noTiles/member/memberJoinForm";
	}
	
	
}
