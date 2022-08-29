package co.hee.prj.member.service;

import java.util.List;

import co.hee.prj.member.vo.MemberVO;

public interface MemberService {
	// 전체 목록
	List<MemberVO> memberSelectList();

	// 한명의 멤버 목록
	MemberVO memberSelect(MemberVO vo);

	// 멤버 등록
	int memberInsert(MemberVO vo);

	// 멤버 수정
	int memberUpdate(MemberVO vo);

	// 멤버 삭제
	int memberDelete(MemberVO vo);
}
