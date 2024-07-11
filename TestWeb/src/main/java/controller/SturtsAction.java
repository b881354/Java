package controller;

import com.opensymphony.xwork2.ActionSupport;

public class SturtsAction extends ActionSupport {
	
	private int x;
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	@Override
	public String execute() throws Exception
	{
		if(getX()>=60)
		{
			return "a";
		}
		else
		{
			return "b";
		}
	}

}
