package comm.controlerPack;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import comm.entity.Userdata;
import comm.userService.service;





@Controller
public class IndexController {
	@Autowired(required=true)
	service serv;
	
	
	@GetMapping("/")
	public String Home1() {
		
		
		return "index";
	}
	
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
		
		@GetMapping("/register")
		public String register(@ModelAttribute Userdata userdata , @RequestParam("firstname")String gn,@RequestParam("lastname") String ln){
			System.out.println(userdata+gn+ln);
			
//			ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("Spring-servlet.xml");
//			daoClas dao = ac.getBean("userdata",daoClas.class);
//			
//			int r= dao.dataSave(user);
			
			try {
			serv.save(userdata);
			}
			catch(Exception e) {
				System.out.println(e+"your exception");
			}
	
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
