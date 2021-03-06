package test

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction

import spock.lang.Specification

class FourthExample extends Specification {

	def "Feature without Explicit Block"(){

		setup:
		println "Setup ..."
		def a = 5
		def b = 6
		def obj = new SumOfTwoNumbers()

		when:
		def sum = obj.adder(a, b)

		then:
		sum == 11

		when:
		def list = []
		list.add(3)
		list.add(4)

		then:
		list.size() == 2
		println "size of the list is.." + list.size()

		when:
		def list1 = []
		list1.add(3)
		list1.add(4)
		println list1.get(6)

		then:
		println "size of the list1 is.." + list1.size()
		thrown(IndexOutOfBoundsException)
		println "Exception"

		//		expect:
		//		println "Given ..."

		expect:
		Math.max(1,2) == 2

		cleanup:
		println "cleanup"
	}
	def "Feature without Explicit Block 2"(){

		setup:
		println "Setup ..."
		def a = 5
		def b = 6
		def obj = new SumOfTwoNumbers()

		when:
		def sum = obj.adder(a, b)

		then:
		sum == 11

		when:
		def list = []
		list.add(3)
		list.add(4)

		then:
		list.size() == 2
		println "size of the list is.." + list.size()

		when:
		def list1 = []
		list1.add(3)
		list1.add(4)
		println list1.get(6)

		then:
		println "size of the list1 is.." + list1.size()
		thrown(IndexOutOfBoundsException)
		println "Exception"

		//		expect:
		//		println "Given ..."

		expect:
		Math.max(1,2) == 2

		cleanup:
		println "cleanup"
	}
}
