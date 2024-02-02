package com;

public class Basica {
	double sumar;
	double restar;
	double dividir;
	double multiplicar;

	
	 public Basica(double sumar, double restar, double dividir, double multiplicar) {
		super();
		this.sumar = sumar;
		this.restar = restar;
		this.dividir = dividir;
		this.multiplicar = multiplicar;
	}
    
	public void setSumar(double sumar) {
		this.sumar = sumar;
	}

	public double getRestar() {
		return restar;
	}

	public void setRestar(double restar) {
		this.restar = restar;
	}

	public double getDividir() {
		return dividir;
	}

	public void setDividir(double dividir) {
		this.dividir = dividir;
	}

	public double getMultiplicar() {
		return multiplicar;
	}

	public void setMultiplicar(double multiplicar) {
		this.multiplicar = multiplicar;
	}
	public double sumar(double a, double b) {
        return a + b;
    }

		public double restar(double a, double b) {
	        return a - b;
	    }
	    
	    public double multiplicar(double a, double b) {
	        return a * b;
	    }
	    
	    public double dividir(double a, double b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("No se puede dividir por cero.");
	        }
	    }
	    
	    public static void main(String[] args) {
	
	    }

		@Override
		public String toString() {
			return "Basica [sumar=" + sumar + ", restar=" + restar + ", dividir=" + dividir + ", multiplicar="
					+ multiplicar + "]";
		}
	    
	   
		
}
