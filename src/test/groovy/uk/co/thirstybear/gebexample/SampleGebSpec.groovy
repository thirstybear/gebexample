package uk.co.thirstybear.gebexample

import geb.spock.GebSpec

class SampleGebSpec extends GebSpec{
    def "Can hit Google main page" () {
        when:
        go '/'

        then:
        title == 'Google'
    }
}
