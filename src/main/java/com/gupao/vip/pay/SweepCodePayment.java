package com.gupao.vip.pay;

/**
 * 扫码支付(条码/二维码)
 *
 */
public interface SweepCodePayment {

    /**
     * 扫码支付方法
     * @return   1-支付成功   2-余额不足，支付失败    3-网络延迟太久，支付失败 .......    null-订单创建失败
     */
    Integer wweepCodePayment();

}
