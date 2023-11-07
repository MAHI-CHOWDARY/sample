package com.devops.cse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
	@Test
	public void UserValidationTest1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void UserValidationTest2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("mahendra", ""));
	}
	@Test
	public void UserValidationTest3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("mahendra", "mahi@1789"));
	}

}
