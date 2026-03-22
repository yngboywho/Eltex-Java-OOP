package com.eltex

import java.time.Instant

data class Post(
    val id: Long = 0L,
    val authorId: Long = 0L,
    val content: String = "",
    val author: String = "",
    val likes: Int = 0,
    val link: String = "",
    val authorJob: String? = null,
    val authorAvatar: String? = null,
    val published: Instant = Instant.now(),
    val mentionedMe: Boolean = false,
    val likedByMe: Boolean = false,
    val coords: Coordinates? = null,
    val attachment: Attachment? = null,
) 