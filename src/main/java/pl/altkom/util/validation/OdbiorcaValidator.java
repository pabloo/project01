package pl.altkom.util.validation;

import org.springframework.validation.Errors;

import pl.altkom.projekt.model.Odbiorca;
import pl.altkom.util.StringUtils;

public class OdbiorcaValidator {
	
	
	public void validate(Odbiorca odbiorca, Errors error){
		
		
		if(StringUtils.isEmpty(odbiorca.getImie())){
			error.reject("odbiorca.imie", "Pole wymagane");
		}
		
		if(Character.isLowerCase(odbiorca.getImie().charAt(0))){
			error.reject("odbiorca.imie", "Imie z duzej litery");
		}
		
		if(StringUtils.isEmpty(odbiorca.getNazwisko())){
			error.reject("odbiorca.nazwisko", "Pole wymagane");
		}

		if(Character.isLowerCase(odbiorca.getNazwisko().charAt(0))){
			error.reject("odbiorca.nazwisko", "Nazwisko z duzej litery");
		}
		
		if(StringUtils.isEmpty(odbiorca.getMail())){
			error.reject("odbiorca.mail", "Pole wymagane");
		}
		
	}
}
