package com.devyk.android_dp_code.flyweiget;

import java.util.Random;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 14:49
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is TrainTicket
 * </pre>
 */
public class TrainTicket implements Ticket {
    public String from;
    public String to;
    public String bunk;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String info) {
        bunk = info;
        price = new Random().nextInt(300);
        System.out.println("购买从" + from + " -> " + to + "的 " + bunk + " 火车票 ，价格：" + price);

    }
}
