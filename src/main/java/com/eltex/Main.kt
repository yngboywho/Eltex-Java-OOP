package com.eltex

fun main(args: Array<String>) {
        val service = WallService()
        service.like()
        println(service.post) // com.eltex.Post[content=, author=Anonymous, likes=1]
    }
