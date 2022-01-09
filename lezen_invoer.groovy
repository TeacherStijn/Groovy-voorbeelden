System.in.withReader ({
	console -> {
		println "Geef uw keuze op:"
		println "1> "
		println "2> "
		println "3> "
		println "4> "				
		def invoer = console.readLine()
		println "Je keuze was: ${invoer}"
	}
})