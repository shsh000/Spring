package co.hee.prj.member.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String member_id; // memberId (언더바 안 쓰는걸 권장)
	private String member_password;
	private String member_name;
	private String member_author;
}
