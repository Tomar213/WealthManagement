package controlerPack;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/home")
	public String Home() {
		return "home";
	}
	
	@Controller
	public class mdl{
		@RequestMapping("/trial")
		public ModelAndView mdl1(){
			ModelAndView model = new ModelAndView();
			model.addObject("name","Sigar");
			model.addObject("worrk", "prog");
			model.setViewName("trial");
			return model;
			
		}
	}
	
	@Controller
	public class trial {
		@RequestMapping("/test")
		public String test() {
			return "trial";
		}
	}
}
