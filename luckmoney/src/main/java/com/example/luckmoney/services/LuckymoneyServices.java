package com.example.luckmoney.services;

import com.example.luckmoney.entity.Luckymoney;
import com.example.luckmoney.repository.LuckymoneyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyServices {

    @Autowired
    LuckymoneyRespository respository;

    /// 数据库的事务
    @Transactional
    public void createTwo(){
        Luckymoney lu1 = new Luckymoney();
        lu1.setProducer("lei");
        lu1.setMoney(new BigDecimal("555"));
        respository.save(lu1);

        Luckymoney lu2 = new Luckymoney();
        lu2.setProducer("lei");
        lu2.setMoney(new BigDecimal("1111"));
        respository.save(lu2);
    }

}
