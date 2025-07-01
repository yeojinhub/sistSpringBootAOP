package kr.co.sist.day0701;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestAdviceController {

	@Autowired(required = false)
	private TestAdviceService tas;
	
	@GetMapping("/before")
	public String controllerBefore(String msg, Model model) {
		String value = tas.before(msg);
		model.addAttribute("msg", value);
		model.addAttribute("adviceMsg", "before");
		
		return "day0701/beforeResult";
	} //controllerBefore
	
	@GetMapping("/afterReturning")
	public String controllerAfterReturning(String msg, Model model) {
		String value = tas.afterReturning(msg);
		model.addAttribute("msg", value);
		model.addAttribute("adviceMsg", "AfterReturning");
		
		return "day0701/beforeResult";
	} //controllerAfterReturning
	
	@GetMapping("/afterThrowing")
	public String controllerAfter(String msg, Model model) {
		String value="";
		
		try {
			value=tas.afterThrowing(msg);
		} catch(Exception e) {
			e.printStackTrace();
		} //end try catch
		
		model.addAttribute("msg", value);
		model.addAttribute("adviceMsg", "AfterThrowing");
		
		return "day0701/beforeResult";
	} //controllerAfter
	
} //class
