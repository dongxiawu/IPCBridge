package com.dongxiawu.ipcbridge

import android.os.Parcel
import android.os.Parcelable

class Call() : Parcelable {
    lateinit var service: ServiceWrapper
    lateinit var method: MethodWrapper
    var parameters: Array<ParameterWrapper>? = null

    constructor(parcel: Parcel) : this() {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Call> {
        override fun createFromParcel(parcel: Parcel): Call {
            return Call(parcel)
        }

        override fun newArray(size: Int): Array<Call?> {
            return arrayOfNulls(size)
        }
    }
}