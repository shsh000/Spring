package co.hee.prj.notice.service;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeVO {
	private int noticeId;
	private String noticeWriter;
	private String noticeTitle;
	private String noticeSubject;
	// json 객체 date 형식 변환
	// timezone="Asia/Seoul" 안해주면 하루 전 날짜로 나옴
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="Asia/Seoul") 
	private Date noticeDate;
	private int noticeHit;
	private String noticeAttach;
	private String noticeAttachDir;
}
