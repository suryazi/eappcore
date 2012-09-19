package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCVessel)
@Build(JWSCVessel)
class JWSCVesselTests {

    void testSave() {
       def vessel = new JWSCVessel(name:'Jizan')
       assertNotNull vessel.save()
       assertNotNull vessel.id
       def foundVessel = JWSCVessel.get(vessel.id)
       assertEquals 'Jizan', foundVessel.name
       
        JWSCVessel ves = JWSCVessel.build()
        def foundves=JWSCVessel.get(ves.id)
        assertNotNull ves.id
        assertNotNull ves.name
    }
}
