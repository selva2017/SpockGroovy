package test

import spock.lang.Specification

class FirstExample extends Specification{
	
	def "We are going to see MAx value using MAth class"(){
		
		expect:
		Math.max(2,3) == 3
	}

	def "We are going no to see MAx value using MAth class"(){
		
		expect:
		Math.max(2,4) == 3
	}
}