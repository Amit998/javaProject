package springmvc.controller;



import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import springmvc.model.User;


@Controller
@SessionAttributes("input")
public class ContactController {


	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("Header","This is amit dutta's page");
		//System.out.println("This is contact");
		return "contact";
	}
	
	
	
	/*
	 * @RequestMapping(path="/processFrom",method = RequestMethod.POST) public
	 * String handleForm(HttpServletRequest request) {
	 * 
	 * 
	 * String emailString=request.getParameter("emailS"); String
	 * nameString=request.getParameter("nameS"); String
	 * pwString=request.getParameter("passwordS");
	 * 
	 * System.out.println("The email is"+emailString); return "contact"; }
	 */
	
	@RequestMapping(path="/processFrom",method = RequestMethod.POST)
//	public String handleForm(@RequestParam("emailS") String userEmail,@RequestParam("nameS") String userName,@RequestParam("passwordS") String userPassword,Model model) {
	//	model.addAttribute("name",userName);
	//	model.addAttribute("email",userEmail);
	//	model.addAttribute("password",userPassword);

	public String handleForm(@ModelAttribute User user,Model model) {
		
		
		
		
		

		
		
//		User user=new User();
//		user.setEmailS(userEmail);
//		user.setNameS(userName);
//		user.setPasswordS(userPassword);
		
		
//		model.addAttribute("user",user);
		
//		System.out.println("The email is"+userEmail+userName+userPassword);
		return "success";
	}
	
	
}
