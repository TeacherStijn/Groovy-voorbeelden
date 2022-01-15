class Demoo {
    def eigenschap
    
    Demoo(x) {
        this.eigenschap = x;
    }
 
    def doeIets() {
        println 'hi'
    }
}

Demoo d = new Demoo(3);
println d.eigenschap
d.doeIets()