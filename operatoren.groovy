// Rekenkundige operatoren:
int x = 2
int y = 4

println x+y
println x++

println y%x // Modulus operator; restant van de deling
println y%(x+1)


// String operator (+):
println 'Software' + " schrijven " + '''is ''' + /leuk/ + $/ ..echt!/$


// Bitshift, let op voorrang bij gebruik + (concatenatie):
byte b = 64
println "${b<<1} en ${b>>1}"


// Toekenningoperatoren
println x += 1


// Vergelijkingoperatoren
println x > y
println x != y

x = '4'
println x == y
println x === y


// Logische operatoren. AND heeft hogere prioriteit dan OR
println 'woordje'.equals("woordje") && x == y
println 'woordje'.equals("woordje") || x == y


// Ternary operator


// Elvis operator sinds Groovy 3.0


// Range operatoren
def range = 10..0
range.each { e -> println e }


// Object operatoren




// Reguliere expressie operatoren
