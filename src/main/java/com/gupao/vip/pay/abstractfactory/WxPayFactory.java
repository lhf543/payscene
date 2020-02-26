package com.gupao.vip.pay.abstractfactory;

import com.gupao.vip.pay.WxPay;

/**
 * 微信支付静态工厂类
 */
public class  WxPayFactory {

    private WxPayFactory(){};

    public static WxPayFactory getInstance(){

        return new WxPayFactory();
    }

    /**
     * 创建订单
     *
     * @return
     */
    public WxPay createWxPayOrder(){
        System.out.println("微信支付");
        return new WxPay();
    }

}
