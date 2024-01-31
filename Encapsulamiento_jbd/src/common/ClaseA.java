package common;

public class ClaseA {

	private int atributo1;
	protected String atributo2;
	public double atributo3;
	public ClaseA() {
		
	}
	public ClaseA(int atributo1, String atributo2, double atributo3) {
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}
	public int getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	public double getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(double atributo3) {
		this.atributo3 = atributo3;
	}
	@Override
	public String toString() {
		return "ClaseA [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	
}
