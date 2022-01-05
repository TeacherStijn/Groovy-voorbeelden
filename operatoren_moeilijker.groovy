// Ternary ? : en Elvis ?: operator 
final APIKEY = "ASFS43543lrk84jRr"
def login = false
def invoer = APIKEY

if (invoer == APIKEY) { 
	login = true 
} else {
	login = false
}

println login





// Safe navigation ? en direct field access .@ operator



// Method pointer .&
// Voor het opslaan van een methode verwijzing in een variabele,
// zodat die variabele als methode aanroepbaar is, kunnen wij de .& operator gebruiken:

def gedrag() {
	System.out.println('Ik ga iets doen');
}

def doeIets = it.&gedrag
doeIets()

// of gebruikmakend van methode uit een klasse:

class Auto {
	void starten() {
		System.out.println('Ik start!')
	}
}

def gaRijden = new Auto().&starten
gaRijden()


// Pattern ~, find =~ en match ==~ operator



// Spread operator *. en *
/*
Met de *. operator kunnen we bijvoorbeeld properties uit een verzameling halen zonder 
er met een loop doorheen te hoeven navigeren. 

Bijvoorbeeld:
*/
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