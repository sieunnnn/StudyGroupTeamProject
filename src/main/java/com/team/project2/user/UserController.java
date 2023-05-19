package com.team.project2.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;

//    // 로그인
//    @GetMapping(value = "/login")
//    public String loginPage() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication instanceof AnonymousAuthenticationToken)
//            return ""; // 로그인 페이지
//        return "redirect:/"; // 로그인 하고 나오는 페이지
//    }
//
    // 회원가입
    @RequestMapping(value = "api/user/signup", method = RequestMethod.POST, consumes="application/json;")
    public void userRegister(@RequestBody UserVO userVO) {

        // 유저 코드 생성
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String id;

        for (int i = 0; i < 4; i++) {
            String randomNum = Integer.toString(random.nextInt(10));
            sb.append(randomNum);
        }

        id = sb.toString();

        userVO.setId(userVO.getNickname() + "#" + id);

        userService.signup(userVO);

        System.out.println(userVO);
    }

//    @PostMapping("/sign-up")
//    public String signup(UserVO userVO) {
//        userService.signup(userVO); // 중복검사 기능 추가하기
//        return "redirect:/"; // 로그인 페이지로 이동
//    }
//
//    // 회원 정보 수정
//    @GetMapping(value = "/update")
//    public String editPage(Model model) {
//        String id = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        UserVO userVO = userService.getUserById(id);
//        model.addAttribute("user", userVO);
//        return ""; // 수정 페이지
//    }
//
//    @PostMapping(value = "/delete")
//    public String withdraw(HttpSession session) {
//        String id = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if (id != null) {
//            userService.withdraw(id);
//        }
//
//        SecurityContextHolder.clearContext();
//        return "redirect:/"; // 회원 탈퇴 후 나오는 화면
//    }

}

