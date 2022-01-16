package com.itcourses.voorbeeld;

import com.dummy.HulpKlasse;

public class ModuleDemoApp {
	public static void main (String args[]) {
		System.out.println("Hij doet het vanuit de ModuleDemoApp");
		System.out.println("Aanroep naar HulpKlasse: " + HulpKlasse.antwoordOpAlles());
	}
}