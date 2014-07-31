package hackExternalLibs;

import java.nio.file.Paths;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class MailWithHorse {
public static void main(String[] args) throws EmailException {
    String to="gnomekiller@abv.bg";
    String from="gnomekiller@abv.bg";

    
    EmailAttachment attach=new EmailAttachment();
    attach.setName("test");
    attach.setPath(Paths.get( "resources","azbW3zq_460sa_v1.gif").toString());
    attach.setDescription("qko test");
    MultiPartEmail email = new MultiPartEmail();
    email.setAuthenticator(new DefaultAuthenticator("svetlozarsmihaylov", "#FMI.digital-AXON.com"));
    email.setSSLOnConnect(true);
    email.setFrom("svetlizarsmihaylov@gmail.com");
    email.setSubject("TestMail");
    email.setHostName("smtp.googlemail.com");
    email.addTo("svetlizarsmihaylov@gmail.com", "sdf");
    email.setFrom("svetlozarsmihaylov@gmail.com", "Me");
    email.setSubject("The picture");
    email.setMsg("Here is the picture you wanted");

    email.attach(attach);
  email.send();
}
}
