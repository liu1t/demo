package demo2;

import demo1.Student;

public class Student1Demo {
    public static void main(String args[]){
        Student1 se=new Student1();
        se.setAge(45);
        se.setName("刘永涛");
        int age=se.getAge();
        String name=se.getName();
        System.out.println(age+","+name);
        se.show();
    }
}
