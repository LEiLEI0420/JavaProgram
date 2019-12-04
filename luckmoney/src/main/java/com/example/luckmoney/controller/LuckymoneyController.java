package com.example.luckmoney.controller;

import com.example.luckmoney.services.LuckymoneyServices;
import com.example.luckmoney.entity.Luckymoney;
import com.example.luckmoney.repository.LuckymoneyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class LuckymoneyController {

    @Autowired
    private LuckymoneyRespository respository;

    @Autowired
    private LuckymoneyServices services;

    //获取红包列表
    @GetMapping(value = "/luckymoneys")
    private List<Luckymoney> list(){
       return  respository.findAll();
    }

//    //创建红包(发红包)
//    @PostMapping(value = "/luckymoney")
//    private Luckymoney create(@RequestParam("producer") String producer
//                                   , @RequestParam("money") BigDecimal money) {
//        Luckymoney luckymoney = new Luckymoney();
//        luckymoney.setConsumer(producer);
//        luckymoney.setMoney(money);
//      return  respository .save(luckymoney);
//    }

    //使用表单验证@valid   创建红包(发红包)
    @PostMapping(value = "/luckymoney")
    private Luckymoney create(@   Luckymoney luckymoney ,BindingResult bresult) {
        if (bresult.hasErrors())
        {
            //获取错误信息
            System.out.println(bresult.getFieldError().getDefaultMessage());
            return null;
        }
         luckymoney.setConsumer(luckymoney.getConsumer());
        luckymoney.setMoney(luckymoney.getMoney());
        return  respository .save(luckymoney);
    }




    //通过id查询红包
    @GetMapping(value = "/luckymoney/{id}")
    private Luckymoney findById(@PathVariable("id") Integer id){
        return   respository.findById(id).orElse(null);

    }
    //收红包(更新红包)
    @PutMapping(value = "/luckymoney/{id}")
    private Luckymoney update(@PathVariable("id") Integer id,@RequestParam("consumer") String consumer){

     Optional<Luckymoney> optional = respository.findById(id);
     if (optional.isPresent()){
         Luckymoney luckymoney = new Luckymoney();
         luckymoney.setConsumer(consumer);
         return respository.save(luckymoney);
     }
     return null ;
    }

    @PutMapping(value = "/luckymoney/two")
    public void createTwo(){
        services.createTwo();

    }
}




