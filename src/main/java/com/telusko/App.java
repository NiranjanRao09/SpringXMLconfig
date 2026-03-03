package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        ApplicationContext context=new ClassPathXmlApplicationContext("SpringXML.xml");

        Students student= (Students) context.getBean("std");
        student.gotoThe();
//        student.setName("Niranjan");
//        System.out.println(student.getName());
//        System.out.println(student.getRollNum());

//        Students student1= (Students) context.getBean("std1");
//        System.out.println(student1.getName());
//        System.out.println(student1.getRollNum());

//        Library library= (Library) context.getBean("lib");
//
//
//
//       Classroom classroom= (Classroom) context.getBean("cls");
//


    }

}
