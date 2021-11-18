package cn.edu.hdu.controller;

import cn.edu.hdu.model.User;
import cn.edu.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectUsers")
    public List<User> selectAdmins() {
        return this.userService.selectAdmins ();
    }

    //登录(默认用户名密码都是admin)
    @RequestMapping(value = "/login", method = RequestMethod.PUT)
    public List<User> login( User user){
        return this.userService.login ( user );
    }

}
