package sigep;

import java.util.Scanner;

public class Leitor {
	private Scanner scanner;
	
	public Leitor() {
		scanner = new Scanner(System.in);
	}
	
	public int leInteiro() {
		int retorno = scanner.nextInt();
		scanner.nextLine();
		return retorno;
	}
	
	public String leString() {
		return scanner.nextLine();
	}
	
	public float leFloat() {
		float retorno = scanner.nextFloat();
		scanner.nextLine();
		return retorno;
        }
}