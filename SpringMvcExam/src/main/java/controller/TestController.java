package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@GetMapping("ex2")
	public String gotoEx2()
	{
		return "ex2";
	}
	@RequestMapping("ex3")
	public String ex3()
	{
		return "ex3";
	}
}
