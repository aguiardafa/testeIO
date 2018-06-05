package br.com.aguiardafa.estudo.testeIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class programa {

	public static void main(String[] args) throws IOException {

		// 1. Formato extenso
		// InputStream is = System.in; // recebendo na entrada padrão comando do teclado
		// InputStream is = new FileInputStream("arquivo.txt"); // recebendo um arquivo texto
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(isr);

		// 2. Formato curto
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("saida.txt")));
		
		String linha = br.readLine(); // lê primeira linha
		while (linha != null) {
			System.out.println(linha);
			bw.write(linha);
			bw.newLine();
			linha = br.readLine(); //incremento
		}
		br.close();
        bw.close();
	}

}
