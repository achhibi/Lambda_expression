package org.chhibi.tuto.printer;

import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PrinterConsumer {

	public static void main(String[] args) {
		
		Consumer<String> print = param -> System.out.println(param);
		print.accept("HELLO World Java8");
		//java.util.StringJoiner
		BiConsumer<String, String> printJoiner = (arg1, arg2) -> System.out
				.println(new StringJoiner(" ")
						.add(arg1)
						.add(arg2)
						.toString());
		printJoiner.accept("Hello", "Anass");
	}

}
