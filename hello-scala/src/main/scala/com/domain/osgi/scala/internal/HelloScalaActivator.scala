package com.domain.osgi.scala.internal

import org.osgi.framework._
import com.domain.osgi.scala.HelloScalaService

class HelloScalaActivator extends BundleActivator {
	var serviceRegistration:ServiceRegistration = _

	def start(bundleContext: BundleContext){
		Console.println("STARTING com.domain.osgi.scala")
		//serviceRegistration = bundleContext.registerService("com.domain.osgi.scala.HelloScalaService",new HelloScalaServiceImpl(),null)
		Console.println("REGISTERED com.domain.osgi.scala.HelloScalaService")

	}

	def stop(bundleContext: BundleContext){
		Console.println("STOPPED com.domain.osgi.scala")
		//if(serviceRegistration != null) serviceRegistration.unregister
		Console.println("UNREGISTERED com.domain.osgi.scala.HelloScalaService")
	}
}
