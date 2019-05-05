package test

import main.utils.HttpUtils
import spock.lang.Shared
import spock.lang.Specification
import com.cedarsoftware.util.io.GroovyJsonReader

class WebServices	extends Specification{

	//	def obj = new SumOfTwoNumbers()
	//	@Shared obj = new SumOfTwoNumbers()

	def "get the earthquake data"(){

		given:
			String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=2&limit=10&offset=11"
			def utils = new HttpUtils();
		//		def obj = new SumOfTwoNumbers()

		when: "we request the earhquake data"
		def response =	utils.getEarthQuakeData(url)
		//		def sum = obj.adder(2,3)

		then: "the response is shown"
			//println response
			Object obj = GroovyJsonReader.jsonToGroovy(response)
			println obj
			println obj.features[0].properties.place
		//		sum == 7
	}
}
