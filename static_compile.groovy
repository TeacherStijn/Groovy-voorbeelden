// Static compile zorgt ervoor dat methoden ook alvast worden gecompileerd
// en niet runtime pas e.e.a. wordt bepaald

// Beiden uit commentaar halen om CompileStatic te importeren en toe te passen:
// import groovy.transform.CompileStatic


// @CompileStatic
class Voorbeeld {
    def vbMethode() {
        def name = ["test","test2"]
        name.substring(0,3) // Geeft een compilatiefout bij Static compilatie
    }
}

// Let op: methode hier nog niet aanroepen, anders gaat hij het hier al checken

println "Gaat dus verder (niet goed?) bij non-static compilatie"