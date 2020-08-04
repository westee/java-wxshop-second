package com.westee.wxshop.service;

public interface SmsCodeService {
    /**
     * 发送验证码
     * @param code
     * @return
     */
    String sendSmsCode(String code);
}
