package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/register")
    public String add(User user,HttpServletRequest request){
//        String code = request.getParameter("code");
//        HttpSession session = request.getSession();
//        String validationCode = (String) session.getAttribute("validationCode");
//        if(validationCode.equals(code)){
            userService.add(user);
            return "redirect:/login.jsp";
//        }else {
//            return "redirect:/regist.jsp";
//        }
    }
    @RequestMapping("/login")
    public String findItem(User user, HttpServletRequest request){
        User item = userService.findItem(user);
        System.out.println(item);
        if(item!=null&&user.getUsername().length()>0&&user.getPassword().length()>0){
            return "redirect:/index.jsp";
        }else {
            return "redirect:/login.jsp";
        }

    }
}
