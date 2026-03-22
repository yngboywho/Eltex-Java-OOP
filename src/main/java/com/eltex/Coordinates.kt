package com.eltex;

public record Coordinates(double lat, double lon) {

    public Builder builder(){
        return new Builder()
                .setLat(lat)
                .setLon(lon);
    }

    static class Builder{
        private double lat = 0.0;
        private double lon = 0.0;

        public Builder setLat(final double lat) {
            this.lat = lat;
            return this;
        }

        public Builder setLon(final double lon) {
            this.lon = lon;
            return this;
        }

        public Coordinates build(){
            return new Coordinates(lat, lon);
        }
    }
}
