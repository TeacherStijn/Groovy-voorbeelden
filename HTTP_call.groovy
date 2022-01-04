def connectie = new URL('https://www.stijnjanssen.nl/api/assortiment.json').openConnection();
def code = connectie.getResponseCode();
println code
if (code.equals(200)) {
	println connectie.getInputStream();
	println connectie.getInputStream().getText();
}