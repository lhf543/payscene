package com.gupao.vip.pay;

/**
 * 密码支付
 *
 */
public interface PasswordPayment {

    /**
     * 密码支付方法
     * @return   1-支付成功   2-余额不足，支付失败    3-网络延迟太久，支付失败   4-密码输入错误.......    null-订单创建失败
     */
    Integer passwordPayment();

}
