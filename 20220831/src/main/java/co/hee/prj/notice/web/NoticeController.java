package co.hee.prj.notice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import co.hee.prj.notice.service.NoticeService;
import co.hee.prj.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	@Autowired // 컨테이너에 등록된 데이터만 가져옴
	private NoticeService dao;
	
	// Model 인터페이스를 통해 전달
	@RequestMapping("/noticeList.do")
	public String NoticeList(Model model) {
		model.addAttribute("notice", dao.noticeSelectList());
		return "notice/noticeList";
	}
	
	// ModelAndView 객체를 통해 전달
	@RequestMapping("/noticeSelectList.do")
	public ModelAndView noticeSelectList(ModelAndView mv) {
		mv.addObject("notice", dao.noticeSelectList()); // 결과를 담음
		mv.setViewName("notice/noticeList"); // 보여줄 view 선택
		return mv;
	}
	
	// 글쓰기 폼 호출
	@RequestMapping("/noticeForm.do")
	public String noticeForm() {
		return "notice/noticeForm";
	}
	
	// 글 등록
	@PostMapping("/noticeInsert.do")
	public String noticeInsert(NoticeVO vo, MultipartFile mFile) {
		// MultipartFile : 첨부파일 처리하기 위함
		// 여기에 첨부파일 처리해야함
		dao.noticeInsert(vo); // 글 등록처리
		return "redirect:noticeList.do"; // 글 목록으로 돌아가기
		// redirect 키워드가 있으면 view Resolver로 가지않고 handler Mapper로 감
	}
	

}
