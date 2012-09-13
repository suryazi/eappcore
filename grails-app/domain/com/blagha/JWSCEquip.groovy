package com.blagha

class JWSCEquip {

    String equipment
    Date dateCreated
    Date lastUpdated

    static constraints = {
        equipment(unique: true, blank: false)
    }
    
    static hasMany = [spares : JWSCSpares]
    
    static mapping = {
        spares sort:'equipment'
    }
}
