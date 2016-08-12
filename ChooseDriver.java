package com.apex.test;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChooseDriver {

	public static void main(String[] args) {

		// WebDriver driver = new FirefoxDriver();	

		WebDriver dr = choosebrowser();
		System.out.println(dr);

		/*
		 * 
		 * WebDriver driver = new FirefoxDriver(); driver.get("");
		 */
	}

	public static WebDriver choosebrowser() {

		System.out.println(
				"Select your browser:" + "\n" + "1- FireFox" + "\n" + "2- Chrome" + "\n" + "3- Internet Explorer");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		WebDriver driver = null;
		switch (num) {
		case 1: {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			return driver1;
		}
		case 2: {
			WebDriver driver2 = new FirefoxDriver();
			return driver2;
		}
		case 3: {
			WebDriver driver3 = new InternetExplorerDriver();
			return driver3;
		}
		}
		return driver;
	}
}