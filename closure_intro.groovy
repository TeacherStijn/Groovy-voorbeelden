def nummer = 1 
def bijMaken = "nr == ${nummer}"
def bijGebruiken = "nr == ${ -> nummer }"

nummer = 2
println 'Bij maken: ' + bijMaken
println 'Bij gebruiken: ' + bijGebruiken

// Uitgebreid voorbeeld:
def bestand = new File('D:/Projecten/Github/Groovy voorbeelden/input.txt');
bestand.eachLine { regel -> println regel }