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

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		model.addAttribute(new Odbiorca());
		
		return "dodajOdbiorce";
	}
	
	@RequestMapping( method = RequestMethod.POST )
	public String submitForm( @ModelAttribute Odbiorca odbiorca, Errors errors, Model model ) {
		
		/*new EntryValidator().validate( entry, errors );
		
		if ( errors.hasErrors() ) {
			model.addAttribute( "categories", prepareCategories() );
			model.addAttribute( "phoneTypes", preparePhoneTypes() );
			return FORM_VIEW;
		}*/
		
		/*phoneBookRepository.save( entry );
		phoneBookRepository.logToSysout();*/
		
		return "home";
	}
}
