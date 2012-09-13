package com.blagha

class JWSCMntn {

    String maintenance

    static constraints = {
        
        maintenance(unique: true, blank: false)
    }
    
    static hasMany = [spares : JWSCSpares]
    
    static mapping ={
        spares sort: 'maintenance'
    }
}
