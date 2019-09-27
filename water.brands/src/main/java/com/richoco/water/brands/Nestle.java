package com.richoco.water.brands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Nestle implements Brands{
	@Autowired
	@Qualifier("nestle")
	public void waterBrand() {
		System.out.println("I am the Nestle water brand");
		
	}

}
