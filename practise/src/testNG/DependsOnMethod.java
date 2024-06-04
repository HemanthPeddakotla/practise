package testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(dependsOnMethods = "yamaha")
	public void royalEnfield() {
		System.out.println("Himalayan"); //3
	}
	
	@Test(dependsOnMethods = "royalEnfield")
	public void ktm() {
		System.out.println("ADV 390"); //4
	}
	
	@Test(dependsOnMethods = "re")
	public void yamaha() {
		System.out.println("MT-15"); //2
	}
	
	@Test(dependsOnMethods = "ktm")
	public void bmw() {
		System.out.println("BMW GS-310"); //5
	}
	
	@Test
	public void re() {
		System.out.println("Hunter-350"); //1
	}

}
