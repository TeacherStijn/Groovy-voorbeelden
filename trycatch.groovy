def jaar = new Date().format('yyyy')
println "Welkom bij de... altijd ${jaar} app!"
println "Wat is je geboortejaar?"

def jaarInput = System.in.newReader().readLine();
println "Wat is je leeftijd?"
def leeftijdInput = System.in.newReader().readLine();

try {
	jaarInput = jaarInput as Integer
	leeftijdInput = leeftijdInput as Integer
	println "Je uitkomst is: ${jaarInput+leeftijdInput} of ${jaarInput+leeftijdInput+1}, wauw!"
	println "Uitleg: geboortejaar + leeftijd = nu"
} catch (NumberFormatException nfe) {
	println "Ging niet goed: geef geldige getallen op"
	nfe.printStackTrace() // handig bij meer methode calls
}
finally {
	println "En deze zin wordt -altijd- uitgevoerd"
	println "Nuttig om bijv. openstaande resources af te sluiten"
}