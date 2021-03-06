package com.example.risogelato.domain.entity

import com.google.gson.annotations.SerializedName

data class Order(
    @SerializedName("id") val id: String,
    @SerializedName("storeId") val storeId: Int,
    @SerializedName("userId") val userId: String,
    @SerializedName("address") val address: String,
    @SerializedName("phoneNumber") val phoneNumber: String,
    @SerializedName("menuName") val menuName: String,
    @SerializedName("state") val state: State
) {

    override fun equals(other: Any?): Boolean {
        if (other !is Order) return false

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}

enum class State {
    @SerializedName("NOT_STARTED") NOT_STARTED,
    @SerializedName("STARTED") STARTED,
    @SerializedName("FINISHED") FINISHED,
}

data class OrderList(
    @SerializedName("orders") val orders: List<Order>
)
