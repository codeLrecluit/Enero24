package common;

public class Main {

	public static void main(String[] args) {
		
		CasaInfonavit ci1 = new CasaInfonavit(2, "Verde");
		CasaInfonavit ci2 = new CasaInfonavit(2, "Rojo");
		CasaInfonavit ci3 = new CasaInfonavit(2, "Amarillo");
		
		System.out.println(ci1.getArea());
		System.out.println(ci2.getArea());
		System.out.println(ci3.getArea());
		
//		System.out.println(CasaInfonavit.area);
//		ci1.setArea(150);
		CasaInfonavit.area = 200;
		
		System.out.println(ci1.getArea());
		System.out.println(ci2.getArea());
		System.out.println(ci3.getArea());
		
		System.out.println(ci1.getColor());
		System.out.println(ci2.getColor());
		System.out.println(ci3.getColor());
		
	}
	
}
