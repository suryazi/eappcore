package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCSpares)
@Build([JWSCSpares,JWSCEquip,JWSCLoc,JWSCMfg,JWSCMntn,JWSCVessel])
class JWSCSparesTests {

    void testSparesSave() {
        JWSCSpares spares = JWSCSpares.build(equipment:JWSCEquip.build(),loc:JWSCLoc.build(),manufacturer:JWSCMfg.build(),maintenance:JWSCMntn.build(),vessel:JWSCVessel.build())
        assertNotNull spares.id
        assertNull spares.itemNo
        assertNull spares.partNo
        assertNull spares.dsc
        assertNotNull spares.qty
        assertNull spares.rol
        assertNotNull spares.uprice
        assertNotNull spares.dateCreated
        assertNotNull spares.lastUpdated
    }
}
