package com.gupao.vip.pay;

/**
 * 指纹支付
 */
public interface FingerprintPayment {

    /**
     * 指纹支付方法
     *
     *  指纹错误五次 转为密码支付
     *
     * @return 1-支付成功   2-余额不足，支付失败    3-网络延迟太久，支付失败   4-指纹错误.......    null-订单创建失败
     */
    Integer fingerprintPayment();

}
