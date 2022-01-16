class Auto {
    int vermogen = 100;
    
    // Beetje meta-programming
    def plus(Auto input) {
        return vermogen + input.vermogen
    }
}

Auto a = new Auto();
Auto b = new Auto();
println a+b;

// Kan zelfs voor bestaande klassen:
// Integer.metaClass.plus = {...}