package com.richoco.water.brands;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Water 
{
	
    public static void main( String[] args )
    {
    	
    	
//    	Aquafina aquafina = new Aquafina();
//    	aquafina.waterBrand();
    	
    	ApplicationContext ctx = new FileSystemXmlApplicationContext("spring.xml");
    	 Brands brands = (Brands) ctx.getBean("dasani");
    	 brands.waterBrand();
    	
       
    }
}
