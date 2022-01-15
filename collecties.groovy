// Groovy List:
// stiekem java.util.List ;)

def aantal = ['SQL','HTML','JavaScript','Python','Go','Groovy']

for(item in aantal){
    println item
}

aantal.each {
	elem -> {
		// Er mogen meer regels in een closure
		println 'Jep'
		println elem
	}
}

aantal.eachWithIndex {
	elem, i -> {
		println "En met index: ${i}, ${elem}"
	}
}


// Groovy Map (lijkt op object in JavaScript):
def auto = [
	merk: 'Toyota',
	type: 'Avensis'
]

auto['pk'] = 170
auto.kleur = "Zilvergrijs"

println auto

// Nieuwe lege map maken kan met  [:]

// Let op: de keys zijn impliciet Strings! Dus wil je daar een variabele hebben (als key naam),
// dan moeten we de naam 'escapen' middels een setje (). Dus: [(prop): 'Janssen', leeftijd: 38]


auto.each { e->println e }

// implementatie met zowel twee als drie argumenten mogelijk:
auto.eachWithIndex { key, value, i -> println "Key: ${key}, value: ${value}, index: ${i}" }

// find, minus, removeAll, retainAll


// Java Array notatie mag natuurlijk ook:
String letters = new String[]{ 'x','y','z'}
println letters
letters.each { println it }



// Maps in List?
def albumList = [
	[
	'artiest':'Queen',
	'titel':'Greatest Hits II'
	],
	[
	'artiest':'Alicia Keys',
	'titel':'Songs in A minor'
	]
];

// Let op: ronde haken om parameters verplicht.
// Bij doorlopen ook enkel de {} functiehaken te gebruiken. Ronde haken dan niet.
// Onderstaand een combinatie:

albumList.eachWithIndex (
	(el,i) -> {
		println "****** Album ${i} ********"
		println "- ${el.artiest}"
		println "- ${el.titel}"
		println "***********************"
	}
)