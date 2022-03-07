package day03.DataFormat;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生日期，格式为 yyyy-MM-dd");
        String birthday = new Scanner(System.in).next();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = df.parse(birthday); //变成yyyy-MM-dd日期格式
        long birthdaySecond = birthdayDate.getTime(); //变成m秒

        Date date = new Date();
        long todaySecond = date.getTime(); //将当前时间变成ms

        long second = todaySecond - birthdaySecond;

        if (second < 0) {
            System.out.println("还没出生呢！");
        } else System.out.println(second/1000/60/60/24);

    }
}
