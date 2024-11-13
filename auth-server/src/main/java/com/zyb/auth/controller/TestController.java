package com.zyb.auth.controller;

import com.zyb.auth.ehtity.result.Result;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author zhaoyb
 * @Date 2024-10-27
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test1")
    public Result<String> test1(){
        return Result.success("test1 请求成功");
    }

    @GetMapping("/test/admin")
    @PreAuthorize("hasAuthority('admin')")
    public Result<String> testAdmin(){
        return Result.success("test  admin 请求成功");
    }

    @GetMapping("/test/auth")
    @PreAuthorize("hasAuthority('system')")
    public Result<String> testAuth(){
        return Result.success("test  system 请求成功");
    }

    @GetMapping("/test/role")
    @PreAuthorize("hasRole('ROLE_admin')")
    public Result<String> testAdminRole(){
        return Result.success("test  admin Role 请求成功");
    }

}
