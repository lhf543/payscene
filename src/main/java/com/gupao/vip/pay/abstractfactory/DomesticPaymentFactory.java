package com.gupao.vip.pay.abstractfactory;

import com.gupao.vip.pay.AliPay;
import com.gupao.vip.pay.WxPay;

/**
 * 国内支付工厂类
 */
public  class DomesticPaymentFactory extends  PaymentFactory{


    @Override
    protected void init() {

        /**
         *
         *  这里对用户信息和支付环境进行检测
         *
         *
         */
        System.out.println("检测支付用户信息");



    }

    /**
     * 对汇率进行转换 ，没有实体类 所以用Double代替一下
     *
     *  汇率转换可以使用方法工厂进行改造  (这里偷懒一下简单带过)
     *
     * @return
     */
    public Double exchangeRateConversion(){


        return 0D;
    }



    /**
     * 创建支付订单
     *
     * 判断订单是否需要转换汇率  调用exchangeRateConversion()方法可以进行转换
     *
     * 判断用户选择的支付方式
     *
     * @return
     */
    public void createPayOrder(String choice) {

        if("支付宝".equals(choice)){
            AliPayFactory.getInstance().createAliPayOrder();
        }else if("微信".equals(choice)){
            WxPayFactory.getInstance().createWxPayOrder();
        }

        // ........

    }



}
