package com.example.websocket.controller;

import com.example.websocket.WsPool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value = "sendAll")
    @ResponseBody
    public String sendAll(){
        System.err.println("发送消息给所有用户");
        WsPool.sendMessageToAll("发送消息给所有用户");
        return "发送消息给所有用户";
    }

}
