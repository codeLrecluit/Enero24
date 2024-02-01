package trabajoStatic;

public class Principal {
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Circular","Pepperoni",150);
		Pizza p2 = new Pizza("Circular","Hawahiana",200);
		Pizza p3 = new Pizza("Cuadrada","Mexicana",150);
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
