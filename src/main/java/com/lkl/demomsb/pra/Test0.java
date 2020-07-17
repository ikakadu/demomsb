package com.lkl.demomsb.pra;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.itextpdf.text.log.SysoCounter;
import com.lkl.demomsb.dto.Student;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.openjdk.jol.info.ClassLayout;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: wangruitao
 * @DATE: 2020/3/23
 **/

public class Test0 {
    public static void main(String[] args) {
        /*List<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"zhangsan");
        Student s2 = new Student(2,"lisi");
        Student s3 = new Student(3,"wangwu");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(JSON.toJSONString(list));
        list = list.stream().filter(s -> !s.getName().equals("lisi1")).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(list));*/
//        System.out.println(JSON.toJSONString(list1));


        DateTime time = DateUtil.parse("2020-07-08", DatePattern.NORM_DATE_FORMAT);
        Date d = (Date)time;
        System.out.println(time);
        System.out.println(d);

    }

    public static boolean nasFileSave()   {
        boolean result = true;
       int i =3;
        try  {
           i++;
           throw new RuntimeException();
        } catch (Exception e) {
//            log.error("写入文件到NAS时出错,file name:" + detailsFileName + " file path: " + nasFilePath, e);
            System.out.println("写入文件到NAS时出错"+e);
            result =  false;

            throw e;
//            return false;
        }
//        return result;
    }

    private static void bytecode() {
        Object o = new Object();
        Student s = new Student();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        System.out.println(ClassLayout.parseInstance(s).toPrintable());
        synchronized (s){
            System.out.println(ClassLayout.parseInstance(s).toPrintable());

        }
    }

    private static boolean isNum(String str) {
        try {
            BigDecimal bd = new BigDecimal(str);
            return true;
        }catch (Exception e){
            return false;
        }

    }

}
