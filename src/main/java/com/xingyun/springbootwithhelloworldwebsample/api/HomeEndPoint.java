package com.xingyun.springbootwithhelloworldwebsample.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author qingfeng.zhao
 * @date 2022/11/26
 * @apiNote
 */
@RestController
public class HomeEndPoint {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}
