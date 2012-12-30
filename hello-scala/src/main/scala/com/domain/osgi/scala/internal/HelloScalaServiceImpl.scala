package com.domain.osgi.scala.internal

import com.domain.osgi.scala._

import org.apache.felix.scr.annotations._

@Service
@Component
class HelloScalaServiceImpl extends HelloScalaService {
   def hello() : String = {
	Console.println("Hello, from scala")
	"Hello, from Scala"
   }
}
