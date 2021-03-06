package com.sg.core.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sg.core.vo.ItemViewModel
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Message(
    @PrimaryKey
    var id: String = "",
    var email: String? = ""
) : Parcelable