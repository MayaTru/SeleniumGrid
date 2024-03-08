package org.maya.SeleGridTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test123 {
	
	@Test
	public void Check1() throws MalformedURLException, URISyntaxException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("MicrosoftEdge");
		cap.setPlatform(Platform.WIN10);
		//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.9:4444").toURL(), cap);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("ChecK");
	}
}
