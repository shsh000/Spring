package co.hee.prj.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.hee.prj.member.map.MemberMapper;
import co.hee.prj.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired MemberMapper map;
	
	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
		
	}

}
