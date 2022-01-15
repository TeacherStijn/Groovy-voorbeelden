class Voetbal {
    int vulling = 0;
}

class Pomp {
    void opPompen(Voetbal v) {
        v.vulling += 10;
    }
}

Voetbal mijnVoetbal = new Voetbal();
Pomp mijnPomp = new Pomp();

mijnPomp.opPompen(mijnVoetbal);

println mijnVoetbal.vulling;
