class Overriding {
	public static void main (String args[]) {
		Auto a1 = new Auto("Mazda","RX7", 2004);
		Auto a2 = new Auto("BMW", "Z8", 2000);
		
		System.out.println(a1);
		System.out.println(a1.equals(a2));
	}
}

class Auto {
	String merk, type;
	int bouwjaar;
	
	Auto(String merk, String type, int bouwjaar) {
		this.merk = merk;
		this.type = type;
		this.bouwjaar = bouwjaar;
	}		
	
	@Override	// om aan de compiler aan te geven dat ik een methode overschrijf
	public String toString(){
		return String.format("Mooie auto van merk %s, type %s en bouwjaar %d", merk, type, bouwjaar);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Auto) { 
			Auto vergelijking = (Auto)obj;
			// Probeer deze uit te breiden met merk en type
			// Let op: Strings vergelijken.. ook altijd met .equals()!
			if (this.bouwjaar == vergelijking.bouwjaar) {
				return true;
			}
		}
		
		return false;
	}
}

