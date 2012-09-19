package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCMfg)
@Build(JWSCMfg)
class JWSCMfgTests {

    void testMfgSave() {
        JWSCMfg mfg = JWSCMfg.build()
        def foundmfg=JWSCMfg.get(mfg.id)
        assertNotNull mfg.id
        assertNotNull mfg.manufacturer
    }
}
