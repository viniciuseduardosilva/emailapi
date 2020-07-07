package br.com.emailapi.service;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	private Configuration config;
	
	
	public void sendEmail(String email) throws Exception {
		
		MimeMessage message = sender.createMimeMessage();

			// set mediaType
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			// add attachment
//			helper.addAttachment("logo.png", new ClassPathResource("logo.png"));
			
			Template t = config.getTemplate("email-template.ftl");
//			Map<String, Object> url = new HashMap<String, Object>();
			
			Map<String, Object> model = new HashMap<>();
			model.put("Name", email);
			model.put("location", "São Paulo Sp");
			
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(t,model);
			helper.setTo(email);
			helper.setText(html, true);
			helper.setSubject("Ola");
			helper.setFrom("devhibrido.software@gmail.com");
			sender.send(message);
	}
	

}
