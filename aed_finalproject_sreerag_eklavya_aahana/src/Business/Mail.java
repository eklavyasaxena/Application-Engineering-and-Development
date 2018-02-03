/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
/**
 *
 * @author sreer
 */
public class Mail {
     private String  d_email = "sealert.aed@gmail.com",
                    d_password = "SEAlert@aed2017",
                    d_host = "smtp.gmail.com",
                    d_port  = "465";


    public boolean sendMail(String strTo, String strSubject, String strBody){

        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", d_port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        try
        {
            Session session = Session.getDefaultInstance(props, null);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(strBody);
            msg.setSubject(strSubject);
            msg.setFrom(new InternetAddress(d_email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(strTo));
            msg.saveChanges();

            Transport transport = session.getTransport("smtp");
            transport.connect(d_host, d_email, d_password);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            return true;
        }
        catch (Exception mex)
        {
            mex.printStackTrace();
            return false;
        }
    }
}
