package com.eltex;

import org.jetbrains.annotations.Nullable;

public record User(long id, String login, String name, @Nullable String avatar) {

    public Builder builder(){
        return new Builder()
                .setId(id)
                .setLogin(login)
                .setName(name)
                .setAvatar(avatar);
    }

    static class Builder{
        private long id = 0L;
        private String login = "";
        private String name = "";
        @Nullable
        private String avatar;

        public Builder setId(final long id) {
            this.id = id;
            return this;
        }

        public Builder setLogin(final String login) {
            this.login = login;
            return this;
        }

        public Builder setName (final String name) {
            this.name = name;
            return this;
        }

        public Builder setAvatar(final @Nullable String avatar) {
            this.avatar = avatar;
            return this;
        }

        public User build() {
            return new User(id, login, name, avatar);
        }
    }
}
