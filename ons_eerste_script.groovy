int x = 3;
int y = x;

x = 4;

println x;
println y;

/* *************************************************** */

class Auto {
    String merk;
    int bouwjaar;
}

Auto mijnAuto;
mijnAuto = new Auto();
mijnAuto.merk = "Honda";
mijnAuto.bouwjaar = 1999;

Auto mijnVolgende = mijnAuto;

println mijnVolgende.merk;

println mijnAuto.merk;
mijnVolgende.merk = "Toyota";
println mijnVolgende.merk;
println mijnAuto.merk;

mijnAuto = null;





