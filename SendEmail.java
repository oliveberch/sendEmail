import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

   public static void main(String [] args) {    
      // Recievers's email ID 
      String to = "oliveberch@gmail.com";

      // Sender's email ID
      String from = "architgupta737@gmail.com";

      // Specify host
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      properties.setProperty("mail.smtp.host", host);

      Session session = Session.getDefaultInstance(properties);

      try {
         MimeMessage message = new MimeMessage(session);

         // Set mail details
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
         message.setSubject("Mail using Java program!");
         message.setText("Different measures of scientific performance have been pointing to a shift in the national balance of global science since the mid-2010s");
         
         // Send mail
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } 
      catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}