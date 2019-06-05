package com.gkzy.files.file_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FileController
 * @Description TODO
 * @Auther rww
 * @Date 2019/5/27 8:59
 * @Version 1.0
 **/

@RestController
public class FileController {
    @RequestMapping("/test")
    public String test(){
        return "12341234";
    }
}
