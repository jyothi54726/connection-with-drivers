package driverConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		driver.close();
	}
}
