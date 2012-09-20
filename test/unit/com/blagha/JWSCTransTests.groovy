package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCTrans)
@Build([JWSCTrans,JWSCSpares])
class JWSCTransTests {

    void testTransSave() {
        JWSCTrans trans = JWSCTrans.build(spares:JWSCSpares.build())
        assertNotNull trans.id
        assertNull trans.db
        assertNull trans.cr
        assertNull trans.bal
        assertNull trans.rem
    }
}
