package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.interfaces.IInstrument;
import com.example.interfaces.IMusicien;
import com.example.models.Guitare;
import com.example.models.Guitariste;
import com.example.models.Violon;
import com.example.models.Violoniste;

@Configuration
@ComponentScan("com.example.models")
public class AppConfig {

	@Bean(name = "instrument")
	public IInstrument instrument() {
		return new Guitare();
	}

	@Bean(name = "instrument2")
	public IInstrument instrument2() {
		return new Violon();
	}

	@Bean(name = "musicien")
	public IMusicien guitariste() {
		return new Guitariste();
	}
	@Bean(name = "musicien2")
	public IMusicien violoniste() {
		return new Violoniste();
	}

}
