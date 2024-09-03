package view;

import business.CamaraTermica;

public class Principal {

	public static void main(String[] args) {
		// instancia objeto CamaraTermica, que contém, em seus
		// atributos, a classe temperatura
		
		CamaraTermica objCamaraFria =  new CamaraTermica(-5,1);
		// exibe os valores minimos e maximos de temperatura em Celsius e em Farenheit
		System.out.println(
				String.format("[camara fria] temp. min.: %.2f oC; " + "temp. max.: %.2f oC.",
						objCamaraFria.getTemperaturaMinima().getGrausCelsius(),
						objCamaraFria.getTemperaturaMaxima().getGrausCelsius()));
		
		System.out.println(
				String.format("[camara fria] temp. min.: %.2f oF; " + "temp. max.: %.2f oF.",
						objCamaraFria.getTemperaturaMinima().getGrausFarenheit(),
						objCamaraFria.getTemperaturaMaxima().getGrausFarenheit()));
	}

}
