package com.wang.my.factory.simple;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0  2018/9/25 14:49  by  王帅（wangshuai@cloud-young.com）创建
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("Mail send.");
    }
}
