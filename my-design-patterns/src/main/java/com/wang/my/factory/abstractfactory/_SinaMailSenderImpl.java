package com.wang.my.factory.abstractfactory;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0  2018/9/25 16:30  by  王帅（wangshuai@cloud-young.com）创建
 */
public class _SinaMailSenderImpl implements MailSender {
    public void send() {
        System.out.println("Sina Mail send.");
    }
}
