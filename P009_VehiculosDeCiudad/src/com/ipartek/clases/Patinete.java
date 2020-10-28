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
		
		if (this.estaArrancado) {
			System.out.println("El patinete ya esta arrancado");
		}else {
			if (!estaArrancado) {
				estaArrancado = true;
			}
		}
		
	}

	@Override
	public void Acelerar(int incrementoVel) {
		
		if (this.estaArrancado) {
			if (((this.velocidadActual + incrementoVel) < VEL_MAX_PATINETE) ) {
				this.velocidadActual = this.velocidadActual + incrementoVel;
			}else {
				System.out.println("El patinete ha llegado a su m�xima velocidad y no puede acelerar mas");
			}
		}else {
			System.out.println("El patinete no se puede acelerar estando apagado");
		}
		

	}

	@Override
	public void Frenar(int decrementoVel) {
		
		if (this.estaArrancado) {
			
			if (((this.velocidadActual + decrementoVel) > 0) ) {
				this.velocidadActual = this.velocidadActual - decrementoVel;
			}else {
				System.out.println("El patinete no puede frenar m�s ya que esta parado");
			}
			
		}else {
			System.out.println("El patinete no se puede frenar estando apagado");
		}
		

		
		
	}

	@Override
	public void Apagar() {
	
	
		if (this.estaArrancado) {
			if (velocidadActual == 0) {
				estaArrancado = false;
			}else {
				System.out.println("El patinete no se puede parar en marcha");
			}
		}else {
			System.out.println("El patinete ya esta parado");
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
