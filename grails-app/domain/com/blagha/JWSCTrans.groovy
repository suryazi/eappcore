package com.blagha

class JWSCTrans {

    Integer db
    Integer cr
    Integer bal
    String rem
    Date dateCreated
    Date lastUpdated

    static constraints = {
        spares()
        db(nullable:true, min:1)
        cr(nullable:true, min:1)
        rem(nullable:true)
        bal(nullable:true, min:0)
    }
    
    static belongsTo = [spares:JWSCSpares]
    
    static mapping = {
        sort dateCreated: "desc"
    }
}
