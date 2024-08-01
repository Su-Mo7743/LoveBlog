package org.mzandql.loveblog.controller;


import org.mzandql.loveblog.Entity.User;
import org.mzandql.loveblog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(@ModelAttribute User user, Model model) {
        model.addAttribute("user", userService.getAllUser());

        return "users_list";
    }
}
