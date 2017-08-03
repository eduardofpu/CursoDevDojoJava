package Wio.teste;

import java.io.Console;

public class ConsoleTeste {
	public static void main(String[] args) {
		Console c = System.console();
		char[] pw = c.readPassword("%s","pw");
		for(char pass : pw){
			c.format("%c",pass);
		}
		c.format("\n");
	}
}
