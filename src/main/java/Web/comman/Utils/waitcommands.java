package Web.comman.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Web.Baseclass.baseclass;

public class waitcommands extends baseclass{
	public static int wait = 30;
	public static void visibilityOfAllElementsLocatedBy(By element) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
	public static void visibilityOfElementLocated(By element) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	public static void presenceOfAllElementsLocatedBy(By element) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	public static void elementToBeClickable(By element) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.elementToBeClickable(element));
	}
}
