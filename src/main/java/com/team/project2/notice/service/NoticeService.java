package com.team.project2.notice.service;

import com.team.project2.notice.dto.Notice;

public interface NoticeService {

    void insertNotice(Notice notice);

	Notice readNotice(int noticeIdx);
}
