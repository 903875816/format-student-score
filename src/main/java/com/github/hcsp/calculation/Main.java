package com.github.hcsp.calculation;

import java.util.logging.Level;

public class Main {
    /**
     * 输入学生姓名和分数，当： 90<=score<=100分时，返回"学生X的分数是Y，评级是A"；
     *
     * <p>60<=score<=89时，返回"学生X的分数是Y，评级是B"；
     *
     * <p>0<=score<=59时，返回"学生X的分数是Y，评级是C"；
     *
     * <p>score为其他值时，返回"非法输入"。
     *
     * @param student 学生的姓名
     * @param score 学生的分数
     * @return 结果字符串
     */
    public static String formatStudentScore(String student, int score) {
        //String level = null;
        //if(score >= 90 && score <= 100){
        //    level = "A";
        //}else if(score >= 60 && score <= 89){
        //    level="B";
        //}else if (score >= 0 && score <= 59){
        //    level="C";
        //}else {
        //    level = "非法输入";
        //}
        //return "学生" + student + "的分数是" + score + "，评级是" + level;
        return (score >= 90 && score <= 100)?("学生" + student + "的分数是" + score + "，评级是A")
                :((score >= 60 && score <= 89)? "学生" + student + "的分数是" + score + "，评级是B" :
                ((score>=0&&score<=59)?("学生" + student + "的分数是" + score + "，评级是C"):("非法输入")));

    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
