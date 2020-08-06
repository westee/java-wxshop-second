package com.westee.wxshop.service;

import com.westee.wxshop.generate.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserService userService;
    private final MockSmsCodeService smsCodeService;
    private final SmsCodeCheckService smsCodeCheckService;

    @Autowired
    public AuthService(UserService userService, MockSmsCodeService smsCodeService, SmsCodeCheckService smsCodeCheckService) {
        this.userService = userService;
        this.smsCodeService = smsCodeService;
        this.smsCodeCheckService = smsCodeCheckService;
    }

    public void sendSmsCode(String tel) {
        User user = userService.createUserIfNotExist(tel);
        String correctCode = smsCodeService.sendSmsCode(tel);
        smsCodeCheckService.addCode(tel, correctCode);
    }
}
