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
        JWSCVessel ves = JWSCVessel.build()
        assertNotNull ves.id
        assertNotNull ves.vessel
        assertNotNull ves.lastUpdated
        assertNotNull ves.dateCreated
    }
}
