package com.eltex;

public class Main {
    public static void main(String[] args) {
        final var service = new WallService();
        service.like();
        System.out.println(service.getPost()); // com.eltex.Post[content=, author=Anonymous, likes=1]
    }
}
