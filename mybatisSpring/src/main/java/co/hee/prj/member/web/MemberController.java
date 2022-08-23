package co.hee.prj.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.hee.prj.member.service.MemberService;
import co.hee.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService service; // DAO를 통해 repository에서 결과를 가져옴
	
	@RequestMapping("/memberList.do")
	// service 객체를 호출해서 값을 가져옴
	// model = spring framework에서 지원하는 인터페이스
	public String memberList(Model model) {
		model.addAttribute("members", service.memberSelectList());
		return "member/memberList";
	}
	
	@RequestMapping("/memberSelect.do")
	public String memberSelect(MemberVO vo, Model model) {
		model.addAttribute("member", service.memberSelect(vo));
		return "member/memberSelect";
	}
	
	@RequestMapping("/memberInsert.do")
	public String memberInsert(MemberVO vo, Model model) {
		int n = service.memberInsert(vo);
		if (n != 0) {
			model.addAttribute("message", "정상적으로 등록되었습니다.");
		} else {
			model.addAttribute("message", "등록이 실패했습니다.");
		}
		return "member/memberInsert";
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete(MemberVO vo, Model model) {
		int n = service.memberDelete(vo);
		if (n != 0) {
			model.addAttribute("message", "정상적으로 삭제되었습니다.");
		} else {
			model.addAttribute("message", "삭제가 실패했습니다.");
		}
		return "member/memberDelete";
	}
	
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate(MemberVO vo, Model model) {
		int n = service.memberUpdate(vo);
		if (n != 0) {
			model.addAttribute("message", "정상적으로 변경되었습니다.");
		} else {
			model.addAttribute("message", "변경이 실패했습니다.");
		}
		return "member/memberUpdate";
	}
}
