package com.eltex

class WallService {
    var post: Post = Post()

    fun like() {
        post = post.copy(likes = post.likes + 1)
    }

    fun setContent(content: String) {
        post = post.copy(content = content)
    }

    fun setAuthor(author: String) {
        post = post.copy(author = author)
    }
}