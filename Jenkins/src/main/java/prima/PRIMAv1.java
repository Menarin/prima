package prima;


import java.util.Scanner;


public class PRIMAv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int edad = scan.nextInt();
		int puntosLicencia = scan.nextInt();
		scan.close();
		
	
		System.out.println(valorPrimaMain(edad, puntosLicencia));
		
	}
		
	public static double valorPrimaMain(int edad, int puntosLicencia) {
			
		
		Conductor conductor = new Conductor(edad, puntosLicencia);
		if(conductor.getEdad() < 18 || conductor.getEdad() > 90) {
			System.out.println("Lo sentimos, tu edad no es la indicada.");
			return 0;
		}
		
		double factorEdad = Aseguradora.factorEdad(conductor);
		int reduccionConductorSeguro = Aseguradora.reduccionConductorSeguro(conductor);
		
		if(reduccionConductorSeguro == -1) {
			System.out.println("�Sin Puntos de Licencia!...");
			return 0;
		}
		/*
		 * if(reduccionConductorSeguro == 1) {
		 * System.out.println("Puntos de Licencia Inv�lidos"); return; }
		 */
		
		
		System.out.println("Calculando Valor Prima a Pagar...");
		double primaPagar = Aseguradora.calcularPrima(500.0, factorEdad, reduccionConductorSeguro);
		
		System.out.println("El valor calculado  de la prima es: $" + primaPagar);
		return primaPagar;
	}
	
}
	


	



