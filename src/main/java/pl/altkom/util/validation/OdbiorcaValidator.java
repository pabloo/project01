package pl.altkom.util.validation;

import org.springframework.validation.Errors;

import pl.altkom.projekt.model.Odbiorca;
import pl.altkom.util.StringUtils;

public class OdbiorcaValidator {
	
	
	
	public void validate(Odbiorca odbiorca, Errors error){
		if(StringUtils.isEmpty(odbiorca.getImie())){
			error.reject("odbiorca.imie", "Pole wymagane");
		}
		
		if(StringUtils.isEmpty(odbiorca.getNazwisko())){
			error.reject("odbiorca.nazwisko", "Pole wymagane");
		}
		
		if(StringUtils.isEmpty(odbiorca.getMail())){
			error.reject("odbiorca.mail", "Pole wymagane");
		}
		
		
	}
}
