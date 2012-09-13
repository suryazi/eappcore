package com.blagha

class JWSCSpares {

    String itemNo
    String partNo
    String dsc
    Integer qty
    Integer rol
    Long uprice
    Date dateCreated
    Date lastUpdated

    static constraints = {
        itemNo(nullable:true)
        partNo(nullable:true)
        dsc(nullable:true)
        qty(blank:false,min:0)
        rol(nullable:true,min:0)
        uprice(blank:false,min:0L)
    }
    
    static belongsTo = [equipment : JWSCEquip, loc : JWSCLoc, maintenance : JWSCMntn, manufacturer : JWSCMfg, vessel : JWSCVessel]
    
    static hasMany = [trans : JWSCTrans]
    
    static mapping = {
        sort dateCreated: "desc"
    }
}
