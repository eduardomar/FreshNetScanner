package com.freshsoftwareconcepts.freshnetscanner.pojo

class ManifestDetail {
    public var id: Int
        get() = field
        set(value) {
            field = value
        }

    public var productDesc: String
        get() = field
        set(value) {
            field = value
        }

    public var pkgsMan: Int
        get() = field
        set(value) {
            field = value
        }

    public var pkgsRec: Int
        get() = field
        set(value) {
            field = value
        }

    constructor(id: Int, productDesc: String, pkgsMan: Int, pkgsRec: Int) {
        this.id = id
        this.productDesc = productDesc
        this.pkgsMan = pkgsMan
        this.pkgsRec = pkgsRec
    }
}