package com.gupao.vip.pay.abstractfactory;

import com.gupao.vip.pay.AliPay;

/**
 * 支付宝支付静态工厂类
 */
public class AliPayFactory {

    private AliPayFactory(){};

    public static AliPayFactory getInstance(){

        return new AliPayFactory();
    }

    /**
     * 创建订单
     * @return
     */
    public AliPay createAliPayOrder(){

        System.out.println("支付宝支付");

        return new AliPay();
    }

}
