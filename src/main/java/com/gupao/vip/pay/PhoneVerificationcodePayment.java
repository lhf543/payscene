package com.gupao.vip.pay;

/**
 * 手机验证码支付
 */
public interface PhoneVerificationcodePayment {

    /**
     * 手机验证码支付方法
     *
     * @return  1-支付成功   2-余额不足，支付失败    3-网络延迟太久，支付失败   4-验证码错误.......    null-订单创建失败
     */
    Integer phoneVerificationcodePayment();
}
