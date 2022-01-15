class Bureau {
    int breedte;
    
    Bureau(int b) {
        this.breedte = b;
    }
}

def mijnBureau = new Bureau(100);
def jouwBureau = new Bureau(80);

mijnBureau = jouwBureau;
// Deze regel:
println "Mijn bureau: ${mijnBureau.breedte} en jouw bureau: ${jouwBureau.breedte}"

mijnBureau.breedte = 150;
// Deze regel:
println jouwBureau.breedte;