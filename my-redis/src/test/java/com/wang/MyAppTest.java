package com.wang;

import org.junit.Test;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0  2018/8/30 18:15  by  王帅（wangshuai@cloud-young.com）创建
 */
public class MyAppTest {
    private RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("127.0.0.1:6379")
                .setPassword("111");
        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }
    @Test
    public void opStr() {
        //set
        RBucket str = redissonClient().getBucket("str");
        str.set("bbb"); //redis 中 str ="\"bbb\""
        //get
        String strVal = redissonClient().getBucket("str").get() + "";//redis 中key str ="\"bbb\""
        System.out.println("str = " + strVal);// out str = bbb

        //set
        RBucket strNum = redissonClient().getBucket("strNum");
        strNum.set(99); //redis 中 strNum = "99"
        //get
        String strNumVal = redissonClient().getBucket("strNum").get() + "";//redis 中key strNum = "99"
        System.out.println("strNum = " + strNumVal);// out strNum = 99

    }
}
