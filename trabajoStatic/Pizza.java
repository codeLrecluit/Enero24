package trabajoStatic;

public class Pizza {
	 public static String levadura = "10g";
	 public static String harina = "200g";
	 public static String agua = "120ml";
	 public static String sal = "5g";
	 
	 public String forma;
	 public String sabor;
	 
	 public double precio;

	public Pizza(String forma, String sabor, int precio) {
		super();
		this.forma = forma;
		this.sabor = sabor;
		this.precio = precio;
	}

	public static String getLevadura() {
		return levadura;
	}

	public static void setLevadura(String levadura) {
		Pizza.levadura = levadura;
	}

	public static String getHarina() {
		return harina;
	}

	public static void setHarina(String harina) {
		Pizza.harina = harina;
	}

	public static String getAgua() {
		return agua;
	}

	public static void setAgua(String agua) {
		Pizza.agua = agua;
	}

	public static String getSal() {
		return sal;
	}

	public static void setSal(String sal) {
		Pizza.sal = sal;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	@Override
	public String toString() {
		return "Pizza [forma=" + forma + ", sabor=" + sabor + ", precio=" + precio + "]";
	}
	 
	
	 
	 
			 
}
