package co.hee.prj.member.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.hee.prj.member.service.MemberService;
import co.hee.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService ms;
	
	// 멤버 목록
	@GetMapping("/memberSelectList.do")
	public String memberSelectList(Model model) {
		model.addAttribute("members", ms.memberSelectList());
		return "member/memberSelectList";
	}
	
	// 멤버 등록 폼 호출
	@GetMapping("/memberInsertForm.do")
	public String memberInsertForm() {
		return "member/memberInsertForm";
	}
	
	// 멤버 등록
	@PostMapping("/memberInsert.do")
	public String memberInsert(MemberVO vo, Model model) {
		int m = ms.memberInsert(vo);
		if (m != 0) {
			model.addAttribute("message", "정상적으로 등록되었습니다.");
		} else {
			model.addAttribute("message", "등록이 실패했습니다.");
		}
		return "redirect:memberSelectList.do";
	}
	
}
