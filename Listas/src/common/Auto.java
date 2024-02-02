package common;

public class Auto {
	
	String placa;
	String numMotor;
	String numTarjetaCirculacion;
	public Auto(String placa, String numMotor, String numTarjetaCirculacion) {
		super();
		this.placa = placa;
		this.numMotor = numMotor;
		this.numTarjetaCirculacion = numTarjetaCirculacion;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNumMotor() {
		return numMotor;
	}
	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}
	public String getNumTarjetaCirculacion() {
		return numTarjetaCirculacion;
	}
	public void setNumTarjetaCirculacion(String numTarjetaCirculacion) {
		this.numTarjetaCirculacion = numTarjetaCirculacion;
	}
	@Override
	public String toString() {
		return "Auto [placa=" + placa + ", numMotor=" + numMotor + ", numTarjetaCirculacion=" + numTarjetaCirculacion
				+ "]";
	}
	

}
