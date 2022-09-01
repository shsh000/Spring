package co.hee.prj.member.service;

import java.util.List;

import co.hee.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList();
	
	int memberInsert(MemberVO vo);
}
