// Eenvoudig voorbeeld:

try {
	println "Geef een getal op";
	def vraag = System.in.newReader().readLine() as Integer
	def antwoord = 42;
	assert vraag == antwoord;
} catch (NumberFormatException nfe) {
	println "Geldig getal nodig, we gaan nu verder";
}


// Gedetailleerde meldingen:
println "Geef een naam op: ";
def naam = System.in.newReader().readLine();
def collectie = ['Jan','Piet'];
assert (collectie << naam) == ['Jan','Piet','Henk'];

