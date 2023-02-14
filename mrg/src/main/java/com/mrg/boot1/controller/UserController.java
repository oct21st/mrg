package com.mrg.boot1.controller;

import com.mrg.boot1.mapper.UserMapper;
import com.mrg.boot1.pojo.User;
import com.mrg.boot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper usermapper;
    @Autowired
    private UserService userservice;

    @GetMapping
    public List<User> findAll(){
         return usermapper.findAll();
    }

    @PostMapping
    public Integer save(@RequestBody User user){
        return userservice.save(user);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return usermapper.deleteById(id);
    }
    @GetMapping("/page")
    public Map<String,Object> findPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
         pageNum=(pageNum-1)*pageSize;
        List<User> data =usermapper.findPage(pageNum,pageSize);
        Integer total = usermapper.selectTotal();
        Map<String,Object> map=new HashMap<>();
        map.put("data",data);
        map.put("total",total);

        return map;
    }



}
