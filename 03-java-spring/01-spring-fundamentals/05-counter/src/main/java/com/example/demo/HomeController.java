package com.example.demo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(HttpSession session) {
        // check if a key exists in session with the name "count"
        if(session.getAttribute("count") == null) {
            // no key found!  set session "count" to 0
            session.setAttribute("count", 0);
        }
        // first retrieve the current value in session, casting from Object to Integer
        Integer currentCount = (Integer) session.getAttribute("count");
        // increment count by 1
        currentCount++;
        // set the updated count value back into session
        session.setAttribute("count", currentCount);
        System.out.println(currentCount);
        return "index.jsp";
	}
	
	@RequestMapping(value="/counter", method=RequestMethod.GET)
	public String counter(HttpSession session) {
        // first retrieve the current value in session, casting from Object to Integer
        Integer currentCount = (Integer) session.getAttribute("count");
        // set the updated count value back into session
        session.setAttribute("count", currentCount);
        System.out.println(currentCount);
		return "counter.jsp";
	}

}

