package com.blagha

class JWSCVessel {

    String name

    static constraints = {
        
        name (unique: true, blank: false)
    }
    
    static hasMany = [spares : JWSCSpares]
    
    static mapping ={
        spares sort: 'name'
    }
}
