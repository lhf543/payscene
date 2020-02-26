package com.gupao.vip.pay.abstractfactory;

/**
 * 境外支付工厂类
 */
public class OffshorePaymentFactory extends  PaymentFactory{

    private OffshorePaymentFactory(){}

    public static OffshorePaymentFactory getInstance(){

        return new  OffshorePaymentFactory();
    }

    @Override
    protected void init() {
        /**
         *
         *  这里对用户信息和支付环境进行检测
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
     * 创建订单
     *
     * 选择支付方式
     *
     * 是否要转化汇率
     *
     *
     */
    public void createPayOrder(String choice){

        if("Apple".equals(choice)){

            //Apple支付方式需要通过手机短信验证码进行支付

            ApplePayFactory.getInstance().createApplePayOrder();
        }

    }

}
