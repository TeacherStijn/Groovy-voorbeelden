GroovyClassLoader loader = new GroovyClassLoader();

GroovyCodeSource source = new GroovyCodeSource(new File("inleesFile.groovy"));
// Verschillende overloaded constructoren te gebruiken:
Class nieuweKlasse = loader.parseClass("println 3");

loader.loadClass(nieuweKlasse);