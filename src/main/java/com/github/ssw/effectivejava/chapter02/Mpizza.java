package com.github.ssw.effectivejava.chapter02;

import java.util.Objects;

public class Mpizza extends Pizza {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    private Mpizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public Mpizza build() {
            return new Mpizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
