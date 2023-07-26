import java.util.Scanner;
public class practica2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hola por favor ingrese su edad para poder conocer si puede tener un descuento");
		System.out.println("Recuerde que el precio del boleto Normal de es $19 MXM");
		System.out.print("Ingrese su edad : ");
		int YearsRange = in.nextInt();
		String PrecioBoleto = "";
		if (YearsRange <= 5){
			PrecioBoleto = String.valueOf(19 * 0.60);
		} else if (YearsRange >= 6 && YearsRange <= 59) {
			PrecioBoleto = String.valueOf(19);
		} else if (YearsRange >= 60) {
			PrecioBoleto = String.valueOf(19 * 0.55);
		} else{
			PrecioBoleto = "N/A";
		}
		 System.out.println("El precio de su boleto es: " + PrecioBoleto);
		in.close();
	}//class
}//if
