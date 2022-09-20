package com.wonblog.controller;

import com.wonblog.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class PostController {

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT
    // 글 등록
    // POST Method

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params){
      log.info("params={}", params.toString());
        return "Hello World";
    }
}
