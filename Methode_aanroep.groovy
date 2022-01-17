def scriptMethode(input) {
    println "Deze methode toont iets: " + input;
}

def scriptMethodeReturn() {
    println "Deze methode geeft iets terug, namelijk: "
    return "deze drie woorden"
}

// Aanroep van methoden uit script:
scriptMethode("geheim!")
println scriptMethodeReturn()

class Scherm {
    def toonAfbeelding() {
        println "@('_')@"
    }
}

// Aanroep van methode uit klasse
Scherm s = new Scherm()
s.toonAfbeelding()