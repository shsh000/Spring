package co.hee.prj.member.map;

import java.util.List;

import co.hee.prj.member.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList();

	int memberInsert(MemberVO vo);
}
