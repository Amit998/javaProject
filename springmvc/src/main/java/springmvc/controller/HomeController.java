package springmvc.controller;

import java.util.*;
import java.util.ArrayList;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.Calculator;

@Controller
/* @RequestMapping("/first") */
public class HomeController {


	
//	@RequestMapping(path="/home",method = RequestMethod.GET)
//	public String index(Model model) {
//		model.addAttribute("name","Amit Dutta");
//		model.addAttribute("id",111);
//		
//		List<String> namesList = new ArrayList<String>();
//	
//		namesList.add("A");
//		namesList.add("B");
//		namesList.add("C");
//		model.addAttribute("names",namesList);
//		
//		System.out.println("This is home");
//		return "index";
//	}

	@RequestMapping("/")
	public String index() {
		
		System.out.println("This is home");
		return "index";
	}
	
	@RequestMapping(path="/home")
	public String home() {
		
		System.out.println("This is home");
		return "index";
	}
	
//	@RequestMapping(path="/calculate")
//	public String calculate() {
//		
//		
//		System.out.println("This is calculate");
//		return "calculate";
//	}
//
//	
//	
//	@RequestMapping(path="/Calculation",method = RequestMethod.POST)
//	public String calculation(@ModelAttribute Calculator cal,Model model) {
//		
//		model.addAttribute("cal",cal);
//
//		
//		System.out.println("This is Calculation");
//		return "Calculation";
//	}
	
	@RequestMapping(path="/calculate")
	public String calculate(Model model) {
		
		
		model.addAttribute("isEmpty","false");
		System.out.println("This is calculate");
		return "calculate";
	}
	
	
	@RequestMapping(path="/calculate",method = RequestMethod.POST)
	public String calculate(@ModelAttribute Calculator cal,Model model) {
		
		
		
		if (cal.getfNumber()==null || cal.getsNumber()==null || cal.getOpration()==null ) {
			model.addAttribute("isEmpty","true");
			model.addAttribute("errMsg","Empty Field");
			
			
		}else {
			System.out.println("model is not empty"+cal.getfNumber()+cal.getsNumber()+cal.getOpration());
			model.addAttribute("isEmpty","false");
			
			
			if (cal.getfNumber()==null||cal.getsNumber()==null ) {
				model.addAttribute("hasError",true);
				model.addAttribute("errMsg","Input Field Is Empty");
			}else if(cal.getOpration()== null){
				model.addAttribute("hasError",true);
				model.addAttribute("errMsg","Select Opration");
			}else {
				
				
			
				model.addAttribute("hasError","false");
				
				Double result=getCalCulation(Integer.parseInt(cal.getfNumber()), Integer.parseInt(cal.getsNumber()), cal.getOpration());
				
				System.out.println(result);
				model.addAttribute("calculatedValue",result);
				
			}
		}
		
		model.addAttribute("cal",cal);
		
		
		/* System.out.println("This is calculate"); */
		return "calculate";
	}
	
	public double getCalCulation(int num1,int num2,String op) {
		
		
		
		if (op.equals("+")) {
			//System.out.println("+");
			return num1+num2;
			
		}else if (op.equals("-")) {
			//System.out.println("-");
			return num1-num2;
			
		}else if (op.equals("/")) {
			//System.out.println("/");
			return num1/num2;
				
		}else if (op.equals("*")) {
			//System.out.println("*");
			return num1*num2;
		}
		
		return 0;
		
		
	}

	
	
	/*
	 * @RequestMapping(path="/Calculation",method = RequestMethod.POST) public
	 * String calculation(@ModelAttribute Calculator cal,Model model) {
	 * 
	 * model.addAttribute("cal",cal);
	 * 
	 * 
	 * System.out.println("This is Calculation"); return "Calculation"; }
	 */
	
	
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("name","amit");
		modelAndView.setViewName("help");

		System.out.println("this is help");
			
		return modelAndView;
	}
	
	
	@RequestMapping("/test")
	public String testView() {
		
		
	
		return "test";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about");
		return "about";
	}
	
	
	
	


}
