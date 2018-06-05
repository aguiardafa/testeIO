package br.com.aguiardafa.estudo.testeIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteScannerPrintStream {
	public static void main(String[] args) throws IOException {
		
		//Scanner entrada = new Scanner(new FileInputStream("arquivo.txt")); // recebendo um arquivo texto
		Scanner entrada = new Scanner(System.in); // recebendo na entrada padrão comando do teclado
		
		PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
		
		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		
		saida.close();
		entrada.close();
	}

}
