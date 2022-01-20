//
// Ternary ? : en Elvis ?: operator 
//
final APIKEY = "ASFS43543lrk84jRr";
def login = false;
def invoer = APIKEY;

if (invoer == APIKEY) { 
	login = true ;
} else {
	login = false;
}

// korte versie dus: 
login = (invoer==APIKEY)?true:false

println login;






//
// Safe navigation ? operator
//
def snelleAuto

// hier kun je dus nu null waarden ontvangen, ipv een NullPointerException
println snelleAuto?.type



//
// Direct field access .@ operator
//
// Mogelijkheid om directe veldwaarde uit te lezen, wanneer er ook een get() methode aanwezig is:
class Wagen {
	public String merk;
	Wagen (String m){ 
		this.merk = m;
	}
	String getMerk() {
		"Mooie auto met merk ${merk}"	// mag dus ook zonder 'return' zoals in Java hoort
	}
}

def deAuto = new Wagen('Maserati')
println "Merk vanuit getter: " + deAuto.merk
println "Merk vanuit directe benadering: " + deAuto.@merk



//
// Method pointer .&
//
// Voor het opslaan van een methode verwijzing van een klasse in een variabele,
// zodat die variabele als methode aanroepbaar is, kunnen wij de .& operator gebruiken:

def favorieteSport = 'karten'

def hoeFavoriet = favorieteSport.&toUpperCase
println 'Mijn favoriete sport is: ' + hoeFavoriet() + '!'

// of gebruikmakend van methode uit een klasse:

class Auto {
	void starten() {
		System.out.println('Ik start!')
	}
}

def gaRijden = new Auto().&starten
gaRijden()



//
// Pattern ~, find = ~ en match == ~ operatoren
//
def zoekTekst = "Er was eens een jongentje genaamd Jantje. Hij wilde graag astronaut worden"
def patroon = ~".*Jantje.*"
println "Gevonden? " + zoekTekst.matches(patroon)

// Ook zoeken zonder matches methode() kan, door direct Matches object te laten genereren:
def patroon2 ==~ /.*Jantje.*/
println "Gevonden met 'find'? " + patroon2



//
// Spread operatoren *. en *
//
// Met de *. operator kunnen we bijvoorbeeld properties uit een verzameling halen zonder 
// er met een loop doorheen te hoeven navigeren. Bijvoorbeeld:
class Boek {
	String titel;
	String auteur;
	
	Boek (String t, String a){
		this.titel = t;
		this.auteur = a;
	}
}

// Onderstaande definitie mag ook bij geen gebruik constructor:
def boeken = [
	new Boek('Harry Potter', 'JK Rowling'),
	new Boek('Lord of the Rings', 'J.R.R. Tolkien')
]

// Onderstaande definitie mag ook bij geen gebruik constructor:
// new Boek(titel: 'Harry Potter', auteur: 'JK Rowling')
println boeken*.auteur

// De * notatie mag ook gebruikt worden bij het meegeven van argumenten
// Bijvoorbeeld wanneer losse elementen worden verwacht en je wilt een array / list meegeven
// Ook kun je dus bij het vullen van een list, een bestaande list daarin 'uitsmeren'
def nieuweNamen = ['Qwin', 'Aloy', 'Amber', 'Kaeya']
def alleNamen = ['Peter', 'Suzanne', *nieuweNamen, 'Hendrik']
alleNamen.each { println it }