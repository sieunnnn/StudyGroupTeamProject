package com.team.project2.user;

import lombok.Data;

@Data
public class UserVO {

    private String id;
    private String password;
    private String email;
    private String nickname;
    private String title;
    private boolean withdraw;
}
