import groovy.util.GroovyTestSuite 
import junit.framework.Test 
import junit.textui.TestRunner 

class Auto {
	def merk
	def type
	
	def starten() {
		return ["Uitlaatgasje","Benzinegeur","Olie"]
	}
}

class AutoTest extends GroovyTestCase {
   void testStarten() {
      def broemNr1 = new Auto(merk: 'Skoda', type: 'Octavia')
      def expected = 2; // is natuurlijk 3 ;)
      assert broemNr1.starten().size() == expected
   }
}

class TestSet { 
   static Test suite() { 
      def allTests = new GroovyTestSuite() 
      allTests.addTestSuite(AutoTest.class) 
      //allTests.addTestSuite(Brommer.class) 
      return allTests 
   } 
} 

TestRunner.run(TestSet.suite())