package com.lifan.spring.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author by LiFan
 * @date 2019/1/3
 */

@Controller
public class TControl {
    @CrossOrigin
    @ResponseBody
    @RequestMapping("hello")
    public Object getInfoByAsset() {
        return new SimpleDateFormat("MM月dd日 HH:mm").format(new Date());
    }
}