package herencia_AAGTcommon;

public class Reloj {
	public class Smartwatch extends Reloj{
		
		SistemaOperativo so;
		
		public Smartwatch() {
			
		}
		
		
		public Smartwatch(String tipo, int minutos, int horas, int segundos, String material, SistemaOperativo so) {
			super();
			this.so = so;
		}
		
		
		//Metodo nativo 
		public void sincronizarHora() {
			
			System.out.println("Conectando a internet ....");
			System.out.println("Sincronizando hora...");
		}
		
		@Override
		public void mostrarHora() {
			System.out.println("Esta es la hora .....");
		}
		
		
	}

	public void mostrarHora() {
		// TODO Auto-generated method stub
		
	}
}