package com.example.luckmoney.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
public class Luckymoney
{
    @Id
    @GeneratedValue
    private Integer id;

    public Luckymoney() {
    }

    @Min(value=1,message = "红包太小了")
    private BigDecimal money;
    /**
     * 发送方
     */
    private String producer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    /**
     * 接受方
     */
    private String consumer;
}
