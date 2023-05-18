package com.team.project2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<UserVO> getUserList() {
        return userMapper.getUserList();
    }

    public UserVO getUserById(String id) {
        return userMapper.getUserById(id);
    }

    public UserVO getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    public void signup(UserVO userVO) { // 회원 가입
        if (!userVO.getId().equals("") && !userVO.getEmail().equals("")) {
            // password는 암호화해서 DB에 저장
            userVO.setPassword(passwordEncoder.encode(userVO.getPassword()));
            userMapper.insertUser(userVO);
        }
    }

    public void edit(UserVO userVO) { // 회원 정보 수정
        // password는 암호화해서 DB에 저장
        userVO.setPassword(passwordEncoder.encode(userVO.getPassword()));
        userMapper.updateUser(userVO);
    }

    public void withdraw(String id) { // 회원 탈퇴
        userMapper.deleteUser(id);
    }

    public PasswordEncoder passwordEncoder() {
        return this.passwordEncoder;
    }
}
