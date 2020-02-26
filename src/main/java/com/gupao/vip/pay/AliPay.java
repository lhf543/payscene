package com.gupao.vip.pay;

/**
 * 支付宝支付
 */
public class AliPay implements BrushPayment,FingerprintPayment,PasswordPayment,SweepCodePayment {
    @Override
    public Integer brushPayment() {
        return null;
    }

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
