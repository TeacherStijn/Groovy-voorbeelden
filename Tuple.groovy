Tuple tupleCollectie = new Tuple();
// Tuple is een niet wijzigbare List achter de schermen
// daardoor even handig te gebruiken om bijv.
// tijdelijk even snel een lijst met waarden terug te geven
// (vanuit een methode bijvoorbeeld)

// Even alle methoden bekijken:
tupleCollectie.metaClass.methods.name.unique().each {
    println it;
}

tupleCollectie.addAll();