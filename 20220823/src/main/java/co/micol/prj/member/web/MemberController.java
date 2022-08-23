package co.micol.prj.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.prj.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService dao;
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) {
		model.addAttribute("members", dao.memberSelectList()); // 멤버 목록 결과를 members에 담는다
		return "member/memberList";
	}
}
