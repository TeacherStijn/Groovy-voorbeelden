class Voetbal {
    int vulling = 0;
}

class Pomp {
    void opPompen(int vulling) {
        vulling += 10;
    }
}

Voetbal mijnVoetbal = new Voetbal();
Pomp mijnPomp = new Pomp();

mijnPomp.opPompen(mijnVoetbal.vulling);

println mijnVoetbal.vulling;
