producten = []

println "Geef je keuze op:"
println "1> Toon producten"
println "2> Voeg product toe"
println "3> Wijzig product"
println "4> Verwijder product"				
def invoer = System.in.newReader().readLine();  // evt as Integer erachter :)

while (invoer != 'q') {
	//println "Je keuze was: ${invoer}";
	
	switch(invoer) {
		case "1": 
			toon();
			break;
		case "2":
			println "Geef naam van toe te voegen item: "
			nieuwItem = System.in.newReader().readLine();
			voegToe(nieuwItem);
			break;
		case "3":
			println "Geef een te wijzigen item op: "
			def teWijzigen = System.in.newReader().readLine();
			println "Geef een nieuwe waarde op: "
			def wijzigWaarin = System.in.newReader().readLine();
			wijzig(teWijzigen, wijzigWaarin);
			break;
		case "4":
			println "Geef te verwijderen item op: "
			toon();
			def teVerwijderen = System.in.newReader().readLine();
			verwijder(teVerwijderen);
			break;					
		default:
		println 'Hallo?' 
			break;
	}
	
	println ""
	println "Geef je keuze op:"
	println "1> Toon producten"
	println "2> Voeg product toe"
	println "3> Wijzig product"
	println "4> Verwijder product"
	println ""
	invoer = System.in.newReader().readLine();
}

def toon () {
	if (producten.size() > 0) {
		producten.eachWithIndex { e,i -> println "${i})${e}" }; 
	} else {
		println "Geen producten gevonden"
	}
		
}

def voegToe(inp) {
	producten.push(inp)
}

def wijzig(inp,inp2) {
	def gevonden = producten.indexOf(inp);
	// try-catch blok toepassen
	if (gevonden != -1) {
		producten.set(gevonden,inp2);
		println "${inp} gewijzigd naar ${inp2}"
	} else {
		println "Te wijzigen item niet gevonden"
	}
}

def verwijder(inp) {
	def index = Integer.parseInt(inp);
	// try-catch blok toepassen
	def gevonden = producten.get(index);
	producten.removeAt(index);
}