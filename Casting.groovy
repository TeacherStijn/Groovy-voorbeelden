class Casting {
	public static void main (String args[]) {
		
		// 'f' of 'd' achter waarde is al om aan
		// te geven dat waarde een float of double bevat
		// Let op: standaard ziet Java:
		// - Geheel getal als een int
		// - Kommagetal als een double
		
		// Casting primitieven:
		float f = 3.4f;
		double d = (double)f;
				
		// String naar primitief:
		String mijnStr = "42.5";
		float vanStrNaarFloat = Float.parseFloat(mijnStr);
		
		// Casting objecten:
		Voertuig v = new Auto();
		System.out.println("Instance van Auto?" + (v instanceof Auto));	
		Auto a = (Auto)v;		
		System.out.println(a.aantalDeuren + " aantal deuren");
		
		// Type check primitieven:		
		System.out.println(((Object)f).getClass().getName());
	}
}

class Voertuig {
	int aantalDeuren = 4;
}

class Auto extends Voertuig {
	
}