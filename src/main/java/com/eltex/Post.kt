package com.eltex;

import org.jetbrains.annotations.Nullable;
import java.time.Instant;

public record Post(
        long id,
        long authorId,
        String content,
        String author,
        int likes,
        String link,
        @Nullable
        String authorJob,
        @Nullable
        String authorAvatar,
        Instant published,
        boolean mentionedMe,
        boolean likedByMe,
        @Nullable
        Coordinates coords,
        @Nullable
        Attachment attachment
) {

    public Builder builder() {
        return new Builder()
                .setAuthor(author)
                .setContent(content)
                .setLikes(likes)
                .setId(id)
                .setAuthorId(authorId)
                .setLink(link)
                .setAuthorJob(authorJob)
                .setAuthorAvatar(authorAvatar)
                .setPublished(published)
                .setMentionedMe(mentionedMe)
                .setLikedByMe(likedByMe)
                .setCoords(coords);
    }

    static class Builder {
        // Обязательно указываем начальные значения полей
        private long id = 0;
        private long authorId = 0;
        private String content = "";
        private String author = "";
        private String link = "";
        @Nullable
        private String authorJob;
        @Nullable
        private String authorAvatar;
        private Instant published = Instant.now();
        private boolean mentionedMe = false;
        private boolean likedByMe = false;
        private int likes;
        @Nullable
        private Coordinates coords;
        @Nullable
        private Attachment attachment;


        // Каждый метод строителя запоминает данные и возвращает сам себя
        public Builder setContent(final String content) {
            this.content = content;
            return this;
        }

        public Builder setAuthor(final String author) {
            this.author = author;
            return this;
        }

        public Builder setLikes(final int likes) {
            this.likes = likes;
            return this;
        }

        public Builder setId(final long id) {
            this.id = id;
            return this;
        }

        public Builder setAuthorId(final long authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder setAuthorJob(final @Nullable String authorJob) {
            this.authorJob = authorJob;
            return this;
        }

        public Builder setAuthorAvatar(final @Nullable String authorAvatar) {
            this.authorAvatar = authorAvatar;
            return this;
        }

        public Builder setPublished(final Instant published) {
            this.published = published;
            return this;
        }

        public Builder setLink(final String link) {
            this.link = link;
            return this;
        }

        public Builder setMentionedMe(final boolean mentionedMe) {
            this.mentionedMe = mentionedMe;
            return this;
        }

        public Builder setLikedByMe(final boolean likedByMe) {
            this.likedByMe = likedByMe;
            return this;
        }

        public Builder setCoords(final @Nullable Coordinates coords) {
            this.coords = coords;
            return this;
        }

        public Builder setAttachment(final @Nullable Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        // В финале вызываем build, чтобы получить результат
        public Post build() {
            return new Post(id, authorId, content, author, likes, authorJob, authorAvatar, link, published, mentionedMe, likedByMe, coords, attachment);
        }
    }
}