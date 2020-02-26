package com.gupao.vip.pay;

/**
 * 微信支付
 */
public class WxPay implements PasswordPayment,SweepCodePayment,FingerprintPayment {

    @Override
    public Integer fingerprintPayment() {
        return null;
    }

    @Override
    public Integer passwordPayment() {
        return null;
    }

    @Override
    public Integer wweepCodePayment() {
        return null;
    }
}
