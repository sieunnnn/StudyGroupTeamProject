package com.team.project2.notice.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.team.project2.notice.dto.Notice;

@Mapper
public interface NoticeMapper {
	
	@Insert("insert into notice(notice,content) values(#{notice},#{content}) ")
	void insertNotice(Notice notice);
	
	@Delete("delete from notice where notice_idx = #{noticeIdx}")
	void deleteNoticeByInx(int noticeIdx);

	@Update("update notice "
			+ "set notice = #{notice.notice}, content = #{notice.content}"
			+ " where notice_idx = #{noticeIdx}")
	int updateNoticeByIdx(Map<String, Object> command);

	@Select("select * from notice where notice_idx=#{noticeIdx}")
	Notice selectNotice(int noticeIdx);

}
