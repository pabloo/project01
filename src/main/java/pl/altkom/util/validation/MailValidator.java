package pl.altkom.util.validation;

import org.springframework.validation.Errors;

import pl.altkom.projekt.model.Mail;
import pl.altkom.projekt.model.Odbiorca;
import pl.altkom.util.StringUtils;


public class MailValidator {

	
	public void validate( Odbiorca odbiorca, Errors errors ) {
		if ( StringUtils.isEmpty( odbiorca.getImie() ) ) {
			errors.rejectValue( "odbiorca.imie", "required" );
		}
		
		if ( StringUtils.isEmpty( odbiorca.getNazwisko() ) ) {
			errors.rejectValue( "odbiorca.nazwisko", "required" );
		}
		
			if ( StringUtils.isEmpty( odbiorca.getMail() ) ) {
				errors.rejectValue( "odbiorca.mail", "required" );
			}
			
		}
		
	public void validate( Mail mail, Errors errors ) {
		if ( StringUtils.isEmpty( mail.getNadawca() ) ) {
			errors.rejectValue( "mail.nadawca", "required" );
		}
		
		
		for (Odbiorca o: mail.getOdbiorcy()){
		if ( StringUtils.isEmpty(o.getNazwisko() ) ) {
			errors.rejectValue( "mail.odbiorca", "required" );
		}
		}
		if ( StringUtils.isEmpty( mail.getTemat() ) ) {
			errors.rejectValue( "mail.nadawca", "required" );
		}
		
		if ( StringUtils.isEmpty( mail.getTekstWiadomosci() ) ) {
			errors.rejectValue( "mail.tekstWiadomosci", "required" );
		}
		
		if ( StringUtils.isEmpty( mail.getDataNadania().toString() ) ) {
			errors.rejectValue( "mail.dataNadania", "required" );
		}
			
		}
	
	}

