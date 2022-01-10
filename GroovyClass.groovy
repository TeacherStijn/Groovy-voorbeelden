class GroovySuperClass {

}

class GroovyClass extends GroovySuperClass {
	def naam
	def leeftijd
	String hobby = 'mooie hobby'
	
	def doeIets() {
		println "${naam} met leeftijd: ${leeftijd} en hobby: ${hobby}"
		println "En nog even een andere methode aanroepen: "
		testje();
	}
	
	private void testje() {
		System.out.println("Interne methode");
	}
}