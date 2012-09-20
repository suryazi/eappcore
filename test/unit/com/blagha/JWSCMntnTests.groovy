package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCMntn)
@Build(JWSCMntn)
class JWSCMntnTests {

    void testMntnSave() {
        JWSCMntn mntn = JWSCMntn.build()
        assertNotNull mntn.id
        assertNotNull mntn.maintenance
        assertNotNull mntn.dateCreated
        assertNotNull mntn.lastUpdated
    }
}
