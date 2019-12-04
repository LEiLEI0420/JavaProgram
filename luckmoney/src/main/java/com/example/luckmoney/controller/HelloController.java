package com.example.luckmoney.controller;

import com.example.luckmoney.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @RestController  《==》 @ResponsBody + @Controller
 * @Controller  返回模板文件
 * @RestController 返回字符串
 */
//@RestController
@Controller
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${maxMoney}")
//    private BigDecimal maxMoney;
//
//    @Value("${description}")
//    private String description;
        @Autowired
        LimitConfig limitConfig;

    @GetMapping(value = "/hello1")
    public String study (){

//        return "系统学习Springboot"+ description;
//         return "学习Springboot," + limitConfig.getDescription();
      return "hello";
    }
    @ResponseBody
    @GetMapping(value = "/hello2")
    public String study2 (){

//        return "系统学习Springboot"+ description;
        return "学习Springboot," + limitConfig.getDescription();
//        return "hello";
    }

    @ResponseBody
    @GetMapping({"/hello3","/hello4"})
    public String study3 (){

//        return "系统学习Springboot"+ description;
        return "第三、四次学习Springboot," + limitConfig.getDescription();
//        return "hello";
    }

    @ResponseBody
    @GetMapping(value = "/hello5/{id}")
    public String study5 (@PathVariable("id") Integer id){

//        return "系统学习Springboot"+ description;
        return "第" +id+ "次学习Springboot";

    }

    @ResponseBody
    @GetMapping(value = "/hello6")
    //@RequestParam("id") 中的id 要个url中的请求参数名称相等 即 http://localhost:8081/luckymoney/hello6/?id=8
    public String study6 (@RequestParam("id") Integer id){

//        return "系统学习Springboot"+ description;
        return "第" +id+ "次学习Springboot";

    }

    @ResponseBody
    @GetMapping(value = "/hello7")
    //@RequestParam("id") 中的id 要个url中的请求参数名称相等 即 http://localhost:8081/luckymoney/hello6/?id=8
    //请求参数之没有时，默认设置0，请求参数可设置为非必须
    public String study7 (@RequestParam(value = "id", required = false ,defaultValue = "0") Integer id){

//        return "系统学习Springboot"+ description;
        return "第" +id+ "次学习Springboot";

    }


}
