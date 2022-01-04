// Variabele maken en tonen:
x = 3;
y = 4;
println 'Het antwoord van de optelling is: ' + (x+y)


// Met teksten werkt het vergelijkbaar:
titel = 'Qwixx'
intro = 'Dat is toch een leuk spel zeg dat '
println intro + titel


// Variabele maken en tonen in tekst, moet met dubbele quotes
titel = 'Qwixx'
intro = "Dat is toch een leuk spel zeg dat ${titel}"
println intro


// Variabele maken mag ook met def. Handiger bij gebruik meerdere threads (CPU cores):
def titel = 'Qwixx'
def intro = "Dat is toch een leuk spel zeg dat ${titel}"
println intro


// Je ziet ook: geen meldingen bij opnieuw declareren variabelen
titel = 'Qwixx'
println titel instanceof String
titel = 3; // mag
println titel instanceof Integer // (check op 'int' kan niet)
titel = {} // mag niet
println titel instanceof Object
println titel !instanceof Object // nieuwe feature sinds Groovy 3