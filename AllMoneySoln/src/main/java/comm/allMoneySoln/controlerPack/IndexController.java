package comm.allMoneySoln.controlerPack;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import comm.allMoneySoln.entity.Userdata;
import comm.allMoneySoln.entity.userdata2;
import comm.allMoneySoln.userService.service;



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
	@RequestMapping("/signup2")
	public String signup2() {
		return "SignUp2";
	}
	
	
	@RequestMapping("/signup")
	public String Signup() {
		
		
		return "SignupPage";
	}
	
	@GetMapping("/individual")
	public String Individual() {
		
		
		return "Individual";
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
		
		
		@PostMapping("/submit")
		public String savedata(@ModelAttribute userdata2 userdata2) {
			serv.save1(userdata2);
			
			
			
			return "success";
			
		}
		
		@PostMapping("/register")
		public String register(@ModelAttribute Userdata userdata,@ModelAttribute userdata2 userdata2 ){
			Random ran = new Random();
			long first = (ran.nextLong()% 90000L)+5040000;
	        String accNo=""+Math.abs(first);
	        userdata.setAcc_no(accNo);
	        serv.save(userdata);
	        userdata2.setUserdata(userdata);
	        
			System.out.println(userdata);
			
			serv.save1(userdata2);
			
//			ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("Spring-servlet.xml");
//			daoClas dao = ac.getBean("userdata",daoClas.class);
//			
//			int r= dao.dataSave(user);
			 	
			/* serv.save(userdata); */
		
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
