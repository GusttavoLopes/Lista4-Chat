package br.com.negocio;

import java.util.Scanner;

public class Controle {
	
	Scanner in;
	
	public Controle(){
		in = new Scanner(System.in);
	}
	
	public int readInt() {
		if( in.hasNextInt() ) {
			return in.nextInt();
		}
		in.nextLine();
		return -1;
	}
	
	public String readLine() {
		if ( in.hasNextLine() ) {
			in.nextLine();
		}
		return in.nextLine().trim();
	}
	public void await() {
		System.out.println("...");
		this.readLine();
		
	}
	
}
