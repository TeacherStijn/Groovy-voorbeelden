class Banaan {
    int lengte = 3;

    def doeIets() {
        
    }
}

Banaan b = new Banaan();


class SuperBanaan extends Banaan {
  SuperBanaan(int x) {
      lengte = x;
  }
}

SuperBanaan b2 = new SuperBanaan(5);
println b2.lengte;