package test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("a");
		str.add("d");

		str.forEach(st->System.out.println(st));
	}
}
