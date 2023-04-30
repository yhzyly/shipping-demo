package com.langfeiyes.rest.controller;

import com.langfeiyes.rest.domain.User;
import com.langfeiyes.rest.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController  // @Controller  + @ResponseBody
@RequestMapping("user")
public class UserController {
    @GetMapping
    public List<User> list(){
        List<User> list = Arrays.asList(new User(1L, "dafei", "123"), new User(2L, "xiaofei", "111"));
        return list;
    }
    @GetMapping("/{id}")
    public User detail(@PathVariable Long id){
        return new User(id, "dafei", "123");
    }

    @PostMapping("/save")
    public User save(User user){
        user.setId(1L);
        return user;
    }
    @PutMapping
    public User update(User user){
        user.setName(user.getName() + "_update");
        return user;
    }
    @DeleteMapping
    public JsonResult delete(Long id){
        return JsonResult.success();
    }
}
