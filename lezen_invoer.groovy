System.in.withReader ({
	console -> {
		println "Geef je keuze op:"
		println "1> Toon producten"
		println "2> Voeg product toe"
		println "3> Wijzig product"
		println "4> Verwijder product"				
		def invoer = console.readLine()
		println "Je keuze was: ${invoer}";
	}
})