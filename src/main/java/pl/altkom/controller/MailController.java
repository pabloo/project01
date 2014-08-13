package pl.altkom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.altkom.projekt.model.Mail;
import pl.altkom.util.validation.MailValidator;

@Controller
@RequestMapping("/addMail.do")
public class MailController {

	private final static String FORM_VIEW = "addMailForm";

	private final static String SUCCESS_VIEW = "home";

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		model.addAttribute("mail", new Mail());
		return FORM_VIEW;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute Mail mail, Errors errors,
			Model model) {
		new MailValidator().validate(mail, errors);
		if (errors.hasErrors()) {
			return FORM_VIEW;
		}
		return SUCCESS_VIEW;
	}
}
