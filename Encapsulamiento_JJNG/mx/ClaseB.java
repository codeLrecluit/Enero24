package mx;

import common.ClaseA;

public class ClaseB extends ClaseA {

	ClaseA aa = new ClaseA();
	
	public ClaseB() {
		
	}

	public ClaseB(int atributo1, String atributo2, double atributo3, ClaseA aa) {
		super(atributo1, atributo2, atributo3);
		this.aa = aa;
	}
	
	public void pA2(){
        System.out.println(atributo2);
    }	
	
}
