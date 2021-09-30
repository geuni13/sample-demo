package com.example.demo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontroller {

	@RequestMapping("/")
	public void hello (HttpServletRequest request, HttpServletResponse response) throws IOException {
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sft = new SimpleDateFormat("HH:mm:ss");
		
		String str = "Hello Spring Boot!!";
		str += "<br>" + sf.format(now);
		response.getWriter().print(str);
	}
	
}
