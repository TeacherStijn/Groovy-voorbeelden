def lijstje = ['Gregory','Ira','Niels','PietPatat'];

lijstje << ['Hallo', "fg"]
lijstje.push("hmm");

for (i=0; i<lijstje.size(); i++){
    println(lijstje[i]);
}

for (waarde in lijstje){
    println(waarde);
}

lijstje.remove("hmm");


lijstje.each({
    println (it)
});

lijstje.each({
    item -> println (item)
});

lijstje.eachWithIndex({
    item, index -> println ("Element nr: ${index} met item: ${item}");
});






