package com.westee.wxshop.service;

import org.springframework.stereotype.Service;

@Service
public class MockSmsCodeService implements SmsCodeService {
    @Override
    public String sendSmsCode(String code) {
        return "000000";
    }
}
