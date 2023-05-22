package com.team.project2.notice.service;

import org.springframework.stereotype.Service;

import com.team.project2.notice.dto.Notice;
import com.team.project2.notice.mapper.NoticeMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService{

    private final NoticeMapper noticeMapper;

    @Override
    public void insertNotice(Notice notice) {
        noticeMapper.insertNotice(notice);
    }

	@Override
	public Notice readNotice(int noticeIdx) {
		Notice notice = noticeMapper.selectNotice(noticeIdx);
		return notice;
		
	}
}
