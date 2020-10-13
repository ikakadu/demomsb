package com.lkl.demomsb;


import com.lkl.demomsb.dto.Student;
import org.apache.commons.collections4.list.TreeList;

import java.math.BigDecimal;
import java.util.Date;

public class Test {

    @org.junit.jupiter.api.Test
    public void timeTest(){
//        DateTime parse = DateUtil.parse("20200801 12:10", "yyyyMMdd HH:mm:ss");
//        System.out.println(parse);
//        BigDecimal tempAmount = new BigDecimal("15");
//        int i = tempAmount.compareTo(new BigDecimal("12"));
//        System.out.println(i);

        long l = System.currentTimeMillis() - 1420041600000L << 22 | 0 << 17 | 0 << 12 | 0;
        System.out.println(l);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - 1420041600000L);
        System.out.println(System.currentTimeMillis() - 1420041600000L << 22);
        System.out.println(1 << 17);
        System.out.println(System.currentTimeMillis() - 1420041600000L << 22 | 1 << 17);
        System.out.println(1004 | 2L <<  12);
        System.out.println(1);
        System.out.println(Long.MAX_VALUE);
    }
}
