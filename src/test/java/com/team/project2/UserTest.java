package com.team.project2;

import com.team.project2.user.UserMapper;
import com.team.project2.user.UserVO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.Random;

@MybatisTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @DisplayName("SignUp Test")
    public void signUpTest() throws Exception {

        // 유저 코드 생성
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String id;

        for (int i = 0; i < 4; i++) {
            String randomNum = Integer.toString(random.nextInt(10));
            sb.append(randomNum);
        }

        id = sb.toString();

        UserVO userVO = new UserVO();

        userVO.setId("nickname1#" + id);
        userVO.setPassword("123qwe!@#QWE");
        userVO.setEmail("user1@study.com");
        userVO.setNickname("nickname1");
        userVO.setTitle("lv.1");
        userVO.setWithdraw(false);

        userMapper.insertUser(userVO);

        System.out.println("회원가입이 완료되었습니다.");
    }
}
