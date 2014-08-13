package pl.altkom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.altkom.projekt.model.Odbiorca;

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
		 
		/*new EntryValidator().validate( entry, errors );
		
		if ( errors.hasErrors() ) {
			model.addAttribute( "categories", prepareCategories() );
			model.addAttribute( "phoneTypes", preparePhoneTypes() );
			return FORM_VIEW;
		}*/
				
		return SUCCESS_VIEW;
	}
}
