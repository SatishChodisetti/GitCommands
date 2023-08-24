package Emails;
import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws Exception  {
		System.out.println("==========Test Started           =======");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("satishnani1792@gmail.com", "ijpdluqahqkrvawc"));
		email.setSSLOnConnect(true);
		email.setFrom("satishnani1792@gmail.com");
		email.setSubject("AutomationTriggeredMail");
		email.setMsg("This is just to test the Commons Email API");
		email.addTo("satish.rpea14@gmail.com");
		email.send();
		System.out.println("==========Email sent           =======");

	}

}
