package com.team.project2.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
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
    @GetMapping(value = "/sign-up")
    public String signUpPage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof AnonymousAuthenticationToken)
            return ""; // 회원가입 페이지
        return "redirect:/"; // 회원가입 완료하고 나오는 페이지
    }

    @PostMapping("/sign-up")
    public String signup(UserVO userVO) {
        userService.signup(userVO); // 중복검사 기능 추가하기
        return "redirect:/"; // 로그인 페이지로 이동
    }
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

