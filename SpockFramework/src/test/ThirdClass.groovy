package test
import spock.lang.*

class ThirdClass extends Specification{

	//	def obj = new SumOfTwoNumbers()
	@Shared obj = new SumOfTwoNumbers()

	def "Add 2 numbers"(){
		given:
		def obj = new SumOfTwoNumbers()

		when: "we are going to call adder"
		def sum = obj.adder(2,3)
		
		then:
		sum == 7
	}
}
