package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.interfaces.IInstrument;
import com.example.interfaces.IMusicien;
@Component
public class Violoniste implements IMusicien {

		@Autowired
		private IInstrument instrument2;

		public void playSong() {
			System.out.println("le violoniste joue le morceau : " + this.instrument2.partition());

		}
	}
