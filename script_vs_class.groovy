/* Hier bouwen wij een script: */
def String naam = "Jan";

def doeIets(String invoer) {
    println ("Hallo " + invoer);
}

doeIets(naam);



/* Hier maken wij een klasse aan: */

class Gereedschap {
    String soort;
    String merk;
    String type;
    boolean elektrisch;
    boolean isOn = false;
    
    Gereedschap() {}
    
    Gereedschap(String merk, String type, boolean elektrisch){
        this.merk = merk;
        this.type = type;
        this.elektrisch = elektrisch;
    }
    
    def zetAan() {
        println ("ik ga aan");
        isOn = true;
    }
}

Gereedschap mijnCirkelzaag = new Gereedschap();
mijnCirkelzaag.merk = "Hitachi";
mijnCirkelzaag.type = "CL500";
mijnCirkelzaag.elektrisch = true;
mijnCirkelzaag.zetAan();
println (mijnCirkelzaag.isOn);

Gereedschap mijnZaag = new Gereedschap("Festool","TS100",true);