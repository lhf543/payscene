package com.gupao.vip.pay;

/**
 * 刷脸支付
 *
 */
public interface BrushPayment {

    /**
     * 刷脸支付方法
     *
     * 错误五次转为密码支付
     *
     * @return 1-支付成功   2-余额不足，支付失败    3-网络延迟太久，支付失败   4-刷脸失败.......    null-订单创建失败
     *
     */
   Integer brushPayment();
}
