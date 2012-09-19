package com.blagha

class JWSCMfg {

    String manufacturer
    Date dateCreated
    Date lastUpdated

    static constraints = {
        manufacturer (unique: true, blank: false)
    }
    
    static hasMany = [spares : JWSCSpares]
    
    static mapping ={
        spares sort: 'manufacturer'
    }
}
