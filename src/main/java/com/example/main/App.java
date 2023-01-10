package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.models.Guitariste;
import com.example.models.Violoniste;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext morceau = new AnnotationConfigApplicationContext(AppConfig.class);

		Guitariste solo = (Guitariste) morceau.getBean("musicien");
		solo.playSong();
		
		Violoniste solo2 =  (Violoniste) morceau.getBean("musicien2");
		solo2.playSong();
	}
}
