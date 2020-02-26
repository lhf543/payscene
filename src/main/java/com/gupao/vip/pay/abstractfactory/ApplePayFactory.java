package com.gupao.vip.pay.abstractfactory;

import com.gupao.vip.pay.ApplePay;

public class ApplePayFactory {

    private ApplePayFactory(){};

    public static ApplePayFactory getInstance(){
        return new ApplePayFactory();
    }

    /**
     * 创建订单
     */
    public ApplePay createApplePayOrder(){

        System.out.println("Apple支付");
        return new ApplePay();
    }

}
