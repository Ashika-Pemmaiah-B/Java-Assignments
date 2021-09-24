package com.epsilon.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/project/config.xml");
      
      Publisher pub = (Publisher) ctx.getBean("publisher");
      System.out.println(pub);
      
      Author auth = (Author) ctx.getBean("author");
      System.out.println(auth);
     
      Book book = (Book) ctx.getBean("book");
      System.out.println(book);
      
      Customer cust = (Customer) ctx.getBean("customer");
      System.out.println(cust);
      
      Order ord = (Order) ctx.getBean("order");
      System.out.println(ord);
      ctx.close();
      
    }
}
