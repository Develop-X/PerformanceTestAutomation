package com.perftest

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ComputerDatabase1 extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-AU,en-GB;q=0.9,en-US;q=0.8,en;q=0.7")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36")





	val scn = scenario("ComputerDatabse1")
		.exec(http("request_0")
			.get("/computers?f=macbook"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}