package com.team.project2.notice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.project2.notice.dto.Notice;
import com.team.project2.notice.service.NoticeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/notice")
@CrossOrigin(origins = "http://localhost:8081/")
@RequiredArgsConstructor
public class NoticeController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	private final NoticeService noticeService;

	//post로 바꿔야함 
	@PostMapping("newNotice")
	public void writeNotice(Notice notice) {
		log.info("Controller : noticeWrite");
		noticeService.insertNotice(notice);		
	}
	
	@GetMapping("selectNotice")
	public void readNotice() {
		int noticeIdx=1;
		log.info("Conroller : readNotice");
		Notice notice = noticeService.readNotice(noticeIdx);
		System.out.println(notice);
	}
	
	
	
	
	
	
	
	
	
}
