package com.example.summery_4

data class ItemClass(
    val id: Int,
    val image: Int,
    val owner: String,
    val lastMessage: String,
    val lastActive: String,
    val unreadMessages: Int,
    val isTyping: Boolean,
    val lastMessageType: LastMessageType()
)

 enum class LastMessageType(
     text,
     file,
     voice
 )
