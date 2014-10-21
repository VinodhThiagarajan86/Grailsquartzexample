package org.vin.by

class TesController {

    def index() { 
		
		SampleQuartzJob.triggerNow([action:"Save", email:"vinodh@vinodhthiagarajan.info"] )
	}
}
