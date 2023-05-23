package com.team.project2.notice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.team.project2.notice.dto.Notice;
import com.team.project2.notice.service.NoticeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class NoticeController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	private final NoticeService noticeService;

	@PostMapping("notice/api/notice/newNotice")
	@ResponseBody
	public String writeNotice(@RequestBody Notice notice) {
		log.info("Controller : noticeWrite");
		System.out.println(notice);
		noticeService.insertNotice(notice);		
		return "작성성공";
	}
	
	@GetMapping("selectNotice")
	public void readNotice() {
		int noticeIdx=1;
		log.info("Conroller : readNotice");
		Notice notice = noticeService.readNotice(noticeIdx);
		System.out.println(notice);
	}
	
	@GetMapping("api/notice/AllNotice")
	public List<Notice> AllNotice() {
		log.info("Conroller : AllNotice");
		List<Notice> notices = noticeService.readAllNotice();
		System.out.println(notices);
		return notices;
	}
	
	@GetMapping("notice/api/notice/AllNotice")
	public List<Notice> AllNotice2() {
		log.info("Conroller : AllNotice");
		List<Notice> notices = noticeService.readAllNotice();
		System.out.println(notices);
		return notices;
	}
	
	
	
	
	
	
	
	
	
	
}
