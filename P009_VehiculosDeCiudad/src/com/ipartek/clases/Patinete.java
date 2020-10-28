package com.ipartek.clases;

import com.ipartek.interfaces.Vehiculo;

public class Patinete implements Vehiculo{
	
	int velocidadActual;
	
	boolean estaArrancado;
	
	public Patinete() {
		
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Arrancar() {
		if (!estaArrancado) {
			estaArrancado = true;
		}
		
	}

	@Override
	public void Acelerar(int incrementoVel) {
		
		if (((this.velocidadActual + incrementoVel) < VEL_MAX_PATINETE) && (this.estaArrancado)) {
			this.velocidadActual = this.velocidadActual + incrementoVel;
		}else {
			System.out.println("El coche no puede acelerar");
		}
		
	}

	@Override
	public void Frenar(int decrementoVel) {
		
		if (((this.velocidadActual - decrementoVel) > 0) && (this.estaArrancado)) {
			this.velocidadActual = this.velocidadActual - decrementoVel;
		}else {
			System.out.println("El coche no puede frenar");
		}
		
		
	}

	@Override
	public void Apagar() {
		
		if (velocidadActual == 0) {
			estaArrancado = false;
		}
		
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}
	
	@Override
	public String toString() {
		return "Patinete [velocidadActual=" + velocidadActual + ", estaArrancado=" + estaArrancado + "]";
	}


	
}
