class Muis {
    String merk;
    String kleur;
    int aantalKnoppen;
    boolean scrollWiel;
    Cursor cursortje = new Cursor();
    
    def beweeg(int xPos, int yPos) {
         // hier gaan wij de cursor positie wijzigen  
         this.cursortje.x = xPos;
         this.cursortje.y = yPos; 
    }    
}

class Cursor {
    String plaatje;
    int x;
    int y;
    
    String toString() {
        return "Dit is een cursor op plek: ${x}:${y} ";
    }
}

Muis muisVoorJos = new Muis();
muisVoorJos.kleur = "groen";
println(muisVoorJos.kleur);
muisVoorJos.beweeg(8,10);

println(muisVoorJos.cursortje);