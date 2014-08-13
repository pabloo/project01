package pl.altkom.projekt.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import pl.altkom.projekt.model.Mail;
import pl.altkom.projekt.model.Odbiorca;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Wysylacz {

	public static boolean wyslij(Mail m) {
		
		for (Odbiorca o : m.getOdbiorcy()) {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(m.getNadawca());
			message.setTo(o.getMail());
			message.setSubject(m.getTemat());
			message.setText(m.getTekstWiadomosci());
			JavaMailSenderImpl ms = new JavaMailSenderImpl();
			ms.setHost("smtp.gmail.com");
			ms.setPort(587);
			ms.setUsername("llekutek");
			ms.setPassword("nananana123");

			Properties p = new Properties();
			p.setProperty("mail.smtp.auth", "true");
			p.setProperty("mail.smtp.starttls.enable", "true");
			p.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

			ms.setJavaMailProperties(p);

			ms.send(message);

		}
		return true;
	}

	public static void main(String[] args) {
		
		Mail m = new Mail();
		
		m.setNadawca("llekutek@gmail.com");
		List<Odbiorca> listaOdbiorcow = new ArrayList<Odbiorca>();
		listaOdbiorcow.add(new Odbiorca("Jan", "Kowalski", "llekutek@gmail.com"));
		listaOdbiorcow.add(new Odbiorca("Jan", "Kowalski", "llekutek@gmail.com"));
		m.setOdbiorcy(listaOdbiorcow);
		m.setTekstWiadomosci("To jest tekst wiadomosci i ....");
		m.setTemat("temat");
		Wysylacz.wyslij(m);
		
		// message.setFrom("llekutek@gmail.com");
		// message.setTo("llekutek@gmail.com");
		// message.setSubject("Javacodegeeks email test");
		// message.setText("Lala");
		// JavaMailSenderImpl ms = new JavaMailSenderImpl();
		// ms.setHost("smtp.gmail.com");
		// ms.setPort(587);
		// ms.setUsername("llekutek");
		// ms.setPassword("nananana123");
		//
		// Properties p = new Properties();
		// p.setProperty("mail.smtp.auth", "true");
		// p.setProperty("mail.smtp.starttls.enable", "true");
		// p.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

	}

}
