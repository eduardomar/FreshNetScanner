package com.freshsoftwareconcepts.freshnetscanner.pojo

class PalletsDetail {
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

    public var pallet: String
        get() = field
        set(value) {
            field = value
        }

    public var qty: Int
        get() = field
        set(value) {
            field = value
        }

    constructor(id: Int, productDesc: String, pallet: String, qty: Int) {
        this.id = id
        this.productDesc = productDesc
        this.pallet = pallet
        this.qty = qty
    }
}