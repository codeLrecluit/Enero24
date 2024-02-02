package common;


import java.util.Scanner;

public class ejemplo {
//lenar dos matrices de strings(4x4)
	//numeros (0-9)y letras
 public static void main (String[]Args){
	 int ma[][] = new int [3][3];
     int mb[][] = new int [3][3];
	 int mc[][] = new int [3][3];
     int i, j;
Scanner dato = new Scanner (System.in);
 System.out.println("Datos de la Matriz A :");
	for (i=0; i<=2; i++){
    for (j=0; j<=2; j++){
System.out.print("Escribir valor " + i + " , " + j + " : ");
     ma [i][j]= dato.nextInt();
    }
	}
		            
	System.out.println("Datos de la Matriz B :");
		            
	for (i=0; i<=2; i++){
	for (j=0; j<=2; j++){
	System.out.print("Escribir valor " + i + " , " + j + " : ");
	mb [i][j]= dato.nextInt();
	}
	}
		            
for (i=0; i<=2; i++){
	for (j=0; j<=2; j++){
	mc [i][j]= ma[i][j]+mb[i][j];
	}
}
		            
System.out.println("Matriz resultante de la suma :");
    for (i=0;i<=2;i++){
for (j=0;j<=2;j++) {
	System.out.print(mc[i][j] + " ");
}
System.out.println("");
		            
 }
 }
}
