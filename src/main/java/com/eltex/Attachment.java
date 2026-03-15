package com.eltex;

import static com.eltex.AttachmentType.IMAGE;

public record Attachment(String url, AttachmentType type) {

    public Builder builder(){
        return new Builder()
                .setUrl(url)
                .setType(type);
    }

    static class Builder{
        private String url = "";
        private AttachmentType type = IMAGE;

        public Builder setUrl(final String url) {
            this.url = url;
            return this;
        }

        public Builder setType(final AttachmentType type) {
            this.type = type;
            return this;
        }

        public Attachment build(){
            return new Attachment(url, type);
        }
    }
}