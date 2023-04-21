package com.FYP.shramik1.Controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class NotificationController {
	
	public static final String ACCOUNT_SID = "sid";
    public static final String AUTH_TOKEN = "auth";

    @PostMapping("/send-sms")
    public String sendSms(@RequestParam String toPhoneNumber, @RequestParam String message) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message smsMessage = Message.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber("hbhj"), message).create();

        return "SMS sent successfully: " + smsMessage.getSid();
    }

}
