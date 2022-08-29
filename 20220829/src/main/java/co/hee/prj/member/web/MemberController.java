package co.hee.prj.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.hee.prj.member.service.MemberService;
import co.hee.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService service; // DAO를 통해 repository에서 결과를 가져옴
	
	@GetMapping("/memberList.do")
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
	
	// 로그인 처리
	@PostMapping("/memberLogin.do")
	public String memberLogin(MemberVO vo, HttpSession session, Model model) { // HttpSession 로그인 유지
		vo = service.memberSelect(vo);
		String viewPage = "member/memberMessage"; // 로그인 실패시 가는 페이지
		if (vo == null) {
			model.addAttribute("message", "아이디 또는 패스워드가 일치하지 않습니다.");
		} else {
			session.setAttribute("id", vo.getMemberId());
			session.setAttribute("name", vo.getMemberName());
			session.setAttribute("author", vo.getMemberAuthor());
			viewPage = "home/home"; // == redirect:home.do, 로그인 성공시 가는 페이지
		}
		return viewPage;
	}
	
	// model and view 객체 사용(권장하는 방식 아님)
//	@PostMapping("/memberLogin.do")
//	public ModelAndView memberLogin(MemberVO vo, HttpSession session, ModelAndView mv) {
//		vo = service.memberSelect(vo); // 로그인 처리
//		if (vo == null) {
//			mv.setViewName("member/memberMessage"); // 로그인 실패시 보여줄 페이지 정의
//			mv.addObject("message", "아이디 또는 패스워드가 일치하지 않습니다.");
//		} else {
//			session.setAttribute("id", vo.getMemberId());
//			session.setAttribute("name", vo.getMemberName());
//			session.setAttribute("author", vo.getMemberAuthor());
//			mv.setViewName("home/home"); // 로그인 성공시 보여줄 페이지 정의
//		}
//		return mv;
//	}
	
	// 로그인 폼 호출
	@GetMapping("/memberLoginForm.do")
	public String memberLoginForm() {
		return "memberLoginForm";
	}
}
