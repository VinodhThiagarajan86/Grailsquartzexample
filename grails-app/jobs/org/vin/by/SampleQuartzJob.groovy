package org.vin.by



class SampleQuartzJob {
    static triggers = {
      simple repeatInterval: 5000// execute job once in 5 seconds
    }

    def execute() {
        // execute job
		println "Tested"
		def action = context.mergedJobDataMap.get('action')
		def email = context.mergedJobDataMap.get('email')
    }
}
