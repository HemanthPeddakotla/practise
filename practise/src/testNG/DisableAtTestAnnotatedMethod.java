package testNG;

import org.testng.annotations.Test;

public class DisableAtTestAnnotatedMethod {
	@Test
	public void jan() {
		System.out.println("Sankranthi");
	}
	
	@Test
	public void feb() {
		System.out.println("MahaShiva ratri");
	}
	
	@Test(enabled = false)
	public void mar() {
		System.out.println("Ugadi");
	}

}
