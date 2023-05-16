package com.team.project2.noticeTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;

import com.team.project2.notice.dto.Notice;
import com.team.project2.notice.mapper.NoticeMapper;


@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class NoticeTest {	
	
	@Autowired	
	private  NoticeMapper noticeMapper;
	
	@Test
	public void insertNewNoticeTest() throws Exception {
		Notice notice = new Notice();
		notice.setNotice("7번공지");
		notice.setContent("7번내용");
		noticeMapper.insertNotice(notice);
	}
	
	@Test
	public void delectNoticeTest() {
		noticeMapper.deleteNoticeByInx(6);
	}
	
	@Test
	public void updateNoticeByIdxTest() {
		Notice notice = new Notice();
		notice.setNotice("4번공지 수정1");
		notice.setContent("4번 공지 내용 수정1");
		Map<String, Object> command = new HashMap<>();
		command.put("notice", notice);
		command.put("noticeIdx",4);
		int n = noticeMapper.updateNoticeByIdx(command);
		System.out.println(n+"개 수정완료");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
