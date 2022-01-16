// Casting primitieven:
float f = 3.4f;
double d = f as double;
println d.class
				
// String naar primitief:
String mijnStr = "42.5";
float vanStrNaarFloat = mijnStr as float
println vanStrNaarFloat.getClass()

// alternatief":
String mijnStr2 = "88.8";
float vanStr2NaarFloat = mijnStr.asType(Float);
println vanStr2NaarFloat.getClass();

// Casting objecten:
Voertuig v = new Auto();
println "Instance van Auto? " + (v instanceof Auto)
println "Instance van ..? " + (v.getClass().getName());	//.class mag ook
Auto a = v as Auto;	
println a.aantalDeuren + " aantal deuren";
	
// Type check primitieven:		
println "Klasse van f: ${f.class}";

class Voertuig {
	int aantalDeuren = 4;
}

class Auto extends Voertuig {
	
}