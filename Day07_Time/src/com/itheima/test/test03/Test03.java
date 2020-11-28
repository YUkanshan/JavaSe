package com.itheima.test.test03;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*某公司想统计下员工截至到当前时间，入职公司的天数。请编写程序实现该需求，
由键盘录入员工的入职日期，格式为：xxxx年xx月xx日。
将员工入职公司的天数打印到控制台。 运行结果（假设当前时间是2018年12月10日）：
请输入您入职的日期,格式为：xxxx年xx月xx日
2018年12月09日
您入职公司已经1天

 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您入职的日期,格式为:xxxx年xx月xx日");
        String starTime = sc.next();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //解析出入职的时间
        LocalDate star = LocalDate.parse(starTime, pattern);
        //设置当前时间
        LocalDate end = LocalDate.now();
        Period period = Period.between(star,end);
        System.out.println("您入职的时长为:"+period.toTotalMonths()+"个月"+ period.getDays()+"天");
    }
}
