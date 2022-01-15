class DVD {
    def titel
    def jaartal
    
    def static totaalAantal = 0;
    
    DVD () {
       DVD.totaalAantal++;
       // totaalAantal++;
       // this.totaalAantal++;
    }
    
    static hulpMethode() {
        println "Ik ben aanroepbaar zonder object (instantie)";
    }
}

// DVD.hulpMethode();
new DVD();
new DVD();
new DVD();
println DVD.totaalAantal;
