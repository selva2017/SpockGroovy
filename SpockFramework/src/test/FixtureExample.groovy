package test
import spock.lang.*

class FixtureExample extends Specification{
	def setupSpec(){
		println "SetupSpec Fixture"
	}
	def setup(){
		println "Setup Fixture"
	}

	def "Feature method 1"(){
		given:
		println "Feature Method 1"
	}

	def "Feature method 2"(){
		given:
		println "Feature Method 2"
	}

	def "Feature method 3"(){
		given:
		println "Feature Method 3"
	}
	def cleanup(){
		println "Cleanup Fixture"
	}
	def cleanupSpec(){
		println "CleanupSpec Fixture"
	}
}
