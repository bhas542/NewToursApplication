package com.CompleteWebTableData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicWebTableData extends BaseClass{
	public void dynamicTestData()
	{
WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
List<WebElement>rows=element.findElements(By.tagName("tr"));
int rowcount=rows.size();
System.out.println(rowcount);
for(int i=0;i<rowcount;i++)
{
	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<cols.size();j++)
	{
		String data=cols.get(i).getText();
		System.out.print(data+" ");
	}
	System.out.println();
}
	}

}
