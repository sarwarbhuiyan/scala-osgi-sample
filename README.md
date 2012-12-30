scala-osgi-sample
=================

An OSGi bundle built using scala classes.  The example is a trivial example showing a Hello World Service
which is registered using Felix Annotations (@Service and @Component).  This makes it easy to write
OSGi services that would be better written using scala (especially functional programming paradigms).

My motivation for this would be in Adobe CQ5 or Sling where we often have tree recursion or map-filter
type functionality required.  