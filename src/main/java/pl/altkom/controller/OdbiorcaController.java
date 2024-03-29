package pl.altkom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.altkom.projekt.model.Odbiorca;
import pl.altkom.util.StringUtils;
import pl.altkom.util.validation.OdbiorcaValidator;

@Controller
@RequestMapping("/dodajOdbiorce")
public class OdbiorcaController {
	 
	private final static String FORM_VIEW = "dodajOdbiorce";
	private final static String SUCCESS_VIEW = "home";

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		model.addAttribute(new Odbiorca());
		
		return FORM_VIEW;
	}
	
	@RequestMapping( method = RequestMethod.POST )
	public String submitForm( @ModelAttribute Odbiorca odbiorca, Errors errors, Model model ) {
		 System.out.println(":)");
		// new OdbiorcaValidator().validate( odbiorca, errors );
		
		if(StringUtils.isEmpty(odbiorca.getImie())){
			errors.rejectValue("imie", "required");
		}
		
		if(StringUtils.isEmpty(odbiorca.getNazwisko())){
			errors.rejectValue("nazwisko", "required");
		}
		
		if(StringUtils.isEmpty(odbiorca.getMail())){
			errors.rejectValue("mail", "required");
		}
		
		if ( errors.hasErrors() ) {
			return FORM_VIEW;
		} 
			
		System.out.println(odbiorca);
		return SUCCESS_VIEW;
	}
}
