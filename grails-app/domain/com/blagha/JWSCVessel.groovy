package com.blagha

class JWSCVessel {

    String vessel

    static constraints = {
        
        vessel (unique: true, blank: false)
    }
    
    static hasMany = [spares : JWSCSpares]
    
    static mapping ={
        spares sort: 'vessel'
    }
}
