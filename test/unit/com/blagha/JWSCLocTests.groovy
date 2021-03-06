package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCLoc)
@Build(JWSCLoc)
class JWSCLocTests {

    void testLocSave() {
        JWSCLoc loc = JWSCLoc.build()
        assertNotNull loc.id
        assertNotNull loc.loc
        assertNotNull loc.lastUpdated
        assertNotNull loc.dateCreated
    }
}
