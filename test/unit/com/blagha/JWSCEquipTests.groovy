package com.blagha



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(JWSCEquip)
@Build(JWSCEquip)
class JWSCEquipTests {

    void testEquipSave() {
        JWSCEquip eqp = JWSCEquip.build()
        def foundEqp=JWSCEquip.get(eqp.id)
        assertNotNull eqp.id
        assertNotNull eqp.equipment
        assertNotNull eqp.lastUpdated
        assertNotNull eqp.dateCreated
    }
}
