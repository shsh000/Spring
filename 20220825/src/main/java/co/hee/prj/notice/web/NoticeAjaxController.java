package co.hee.prj.notice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.hee.prj.notice.service.NoticeService;
import co.hee.prj.notice.service.NoticeVO;

@RestController // 호출한 페이지로 결과 리턴, @Controller + @ResponseBody 
public class NoticeAjaxController {
	@Autowired
	private NoticeService ajaxdao;
	
	@RequestMapping("/ajaxSearch.do")
	public List<NoticeVO> ajaxSearch(@RequestParam String key, @RequestParam String val) {
		return ajaxdao.noticeSearch(key, val);
	}

}
