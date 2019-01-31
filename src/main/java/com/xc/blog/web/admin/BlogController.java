package com.xc.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/blogs")
    public String list(){
        return "admin/blogs";
    }

    @GetMapping("/blogs/input")
    public String input(){
        return "admin/blogs-input";
    }

}
