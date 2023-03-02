package com.uax.accesodatos.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import com.uax.accesodatos.dto.Mail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class PeliculasUtils {
	/*
	 * @Value("${api.key}") private String apiKey;
	 */
	
	@Autowired
	private SpringTemplateEngine springTemplateEngine;
	
	@Autowired
	private JavaMailSender mailSender;
	
	public String getResponseToAPIPeliculas(String uri) throws IOException, InterruptedException {
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		
		return response.body();
	}
	
	public void formarMail(Mail mail, String templateHtml) throws MessagingException {
		
		Context context = new Context();
		
		MimeMessage mimeM = mailSender.createMimeMessage();
		MimeMessageHelper mimeHelper = new MimeMessageHelper(mimeM, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
		context.setVariables(mail.getProps());
        mimeHelper.setFrom(mail.getFrom());
        mimeHelper.setTo(mail.getTo());
        mimeHelper.setSubject(mail.getAsunto());
        String html = springTemplateEngine.process(templateHtml, context);
        mimeHelper.setText(html, true);
		
		mailSender.send(mimeM);
		
	}
	
}
