package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.interfaces.IInstrument;
import com.example.interfaces.IMusicien;

@Component
public class Guitariste implements IMusicien {

	@Autowired
	private IInstrument instrument;

	public void playSong() {
		System.out.println("le guitariste joue le morceau : " + this.instrument.partition());

	}
}
