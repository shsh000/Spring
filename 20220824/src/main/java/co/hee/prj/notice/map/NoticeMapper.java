package co.hee.prj.notice.map;

import java.util.List;

import co.hee.prj.notice.vo.NoticeVO;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();

	NoticeVO noticeSelect(NoticeVO vo);

	int noticeInsert(NoticeVO vo);

	int noticeUpdate(NoticeVO vo);

	int noticeDelete(NoticeVO vo);

}
