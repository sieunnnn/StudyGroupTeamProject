package com.team.project2.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    // User 테이블 가져오기
    List<UserVO> getUserList();

    // 회원 가입
    void insertUser(UserVO userVo);

    // 회원 정보 가져오기
    UserVO getUserByEmail(String email);
    UserVO getUserById(String id);

    // 회원 정보 수정
    void updateUser(UserVO userVo);

    // 회원 탈퇴
    void deleteUser(String id);
}

