package org.springExample;

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
        ApplicationContext contect=new ClassPathXmlApplicationContext("src/main/java/config.xml");
        studnet student1=(studnet) contect.getBean("student1");
        System.out.println( "Hello World!" );
        System.out.println(student1);
    }
}
