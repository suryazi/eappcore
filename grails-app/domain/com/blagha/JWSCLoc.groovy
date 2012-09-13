package com.blagha

class JWSCLoc {

    String loc

    static constraints = {
        loc (unique: true, blank: false)
    }
    
    static hasMany = [spares : JWSCSpares]
    
    static mapping = {
        spares sort: 'loc'
    }
}
