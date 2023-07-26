import java.util.Scanner;
public class practica1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese su cifra de ventas : ");
		int salesRange = in.nextInt();
		String Commission = "";
		if (salesRange >= 10000){
			Commission = String.valueOf(salesRange * 0.30);
		} else if (salesRange >= 5001 && salesRange <= 9999) {
			Commission = String.valueOf(salesRange * 0.20);
		} else if (salesRange >= 1000 && salesRange <= 4999) {
			Commission = String.valueOf(salesRange * 0.10);
		} else if (salesRange <= 999){
			Commission = "N/A";
		}
		 System.out.println("Su comision es de: " + Commission);
		in.close();
	}//class
}//if