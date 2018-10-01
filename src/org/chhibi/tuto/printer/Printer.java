package org.chhibi.tuto.printer;

import java.util.StringJoiner;

public class Printer {

	public static void main(String[] args) {
//		print(x->System.out.println(x),"Anass");
		print(System.out::println,"Anass");
		
		var myThread=new Thread(()->System.out.println("start"));
		myThread.start();
	}
	
	static void print(IPrinter printer,String arg) {
		printer.print(new StringJoiner(" ")
				.add("Hello")
				.add(arg)
				.toString());
	}

}
