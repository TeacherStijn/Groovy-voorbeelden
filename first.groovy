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
intro = "Dat is toch een leuk spel zeg dat $titel"
println intro


// Variabele maken mag ook met def. Handiger bij gebruik meerdere threads (CPU cores):
def titel = 'Qwixx'
def intro = "Dat is toch een leuk spel zeg dat $titel"
println intro


// Je ziet ook: geen meldingen bij opnieuw declareren variabelen.