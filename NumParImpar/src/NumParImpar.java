import java.util.Scanner;
public class NumParImpar{
	public static void main(String[]args){
		Scanner en = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int numero=en.nextInt();
		if (numero % 2 == 0){
			System.out.println("El numero es Par");
			}
		else {
			System.out.println("El numero es impar ");
		}

}
}