package comm.controlerPack;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import comm.entity.Userdata;
import comm.userService.service;

import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class IndexController {
	
	 Userdata user;
	 
	@Autowired
	private service userservice;
	
	@RequestMapping("/home")
	public String Home() {
		
		
		return "home";
	}
	@RequestMapping("/AboutUs")
	public String AboutUs() {
		
		
		return "AboutUs";
	}

	@RequestMapping("/BusinessRegistration")
	public String BusinessRegistration() {
		
		
		return "BusinessRegistration";
	}
	
	@RequestMapping("/individualLogin")
	public String individuallogin() {
		
		
		return "loginPage";
	}
	
	@RequestMapping("/BusinessLogin")
	public String BusinessLogin() {
		return "BusinessLogin";
	}
	@RequestMapping("/business")
	public String BusinessPage() {
		return "BusinessPage";
	}
	@RequestMapping("/services")
	public String services() {
		return "Services";
	}
	
	
	@RequestMapping("/signup")
	public String Signup() {
		
		
		return "SignupPage";
	}
	

		@RequestMapping("/trial")
		public ModelAndView mdl1(){
			ModelAndView model = new ModelAndView();
			/*
			 * model.addObject("name","Sigar"); model.addObject("worrk", "prog");
			 */
			model.setViewName("trial");
			return model;
	}
		
		@RequestMapping(path = "/register",method=RequestMethod.GET)
		public String register(@ModelAttribute Userdata userdata , @RequestParam("firstname")String gn,@RequestParam("lastname") String ln){
			System.out.println(userdata+gn+ln);
			
//			ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("Spring-servlet.xml");
//			daoClas dao = ac.getBean("userdata",daoClas.class);
//			
//			int r= dao.dataSave(user);
			
			int r= this.userservice.createuser(user);
			
			System.out.println(r+ "rows affected");
			return "success";
		}
	
	@Controller
	public class trial {
		@RequestMapping("/test")
		public String test() {
			return "trial";
		}
	}
	

}
