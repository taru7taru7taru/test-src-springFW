package test.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.login.form.LoginForm;
import test.validation.InputValidationZOrder;
 
@Controller
public class LoginController {
	
	@RequestMapping(value= "/" , method = RequestMethod.GET )
	public String loginForm(Model model){
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @Validated(InputValidationZOrder.class) @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result ) {
		//System.out.println("UserName:"+LoginForm.getLoginName());
		//System.out.println("result.hasErrors():"+result.hasErrors());
		if( result.hasErrors() ){
			return "index";
		}
		model.addAttribute("loginName", loginForm.getLoginName() );
		return "top";
	}
}