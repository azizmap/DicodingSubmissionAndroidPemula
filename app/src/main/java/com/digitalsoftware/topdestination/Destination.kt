package com.digitalsoftware.topdestination

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Destination(
    var name: String = "",
    var loc: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Parcelable