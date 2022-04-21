package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	@Test
	public void test1() {
		System.out.println("from test 1");
	}
	@Test 
	public void test2() {
		System.out.println("from test 2");
	}
	@AfterMethod
	public void afterTest(){
		System.out.println("After test");
	}
	@BeforeMethod
	public void beforeTest(){
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before  Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After  Class");
	}
}
