System.in.withReader ({
	console -> {
		println "Geef je keuze op:"
		println "1> Toon producten"
		println "2> Voeg product toe"
		println "3> Wijzig product"
		println "4> Verwijder product"				
		def invoer = console.readLine()
		
		while (invoer != 'q') {
			println "Je keuze was: ${invoer}";
			println "Geef je keuze op:"
			println "1> Toon producten"
			println "2> Voeg product toe"
			println "3> Wijzig product"
			println "4> Verwijder product"
			invoer = console.readLine();
		}
	}
})