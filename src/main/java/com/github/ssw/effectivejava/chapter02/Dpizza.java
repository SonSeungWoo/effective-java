package com.github.ssw.effectivejava.chapter02;

public class Dpizza extends Pizza {

    private final boolean sauceInside;

    private Dpizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauseInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauseInside = false;

        public Builder sauceInde(boolean sauseInside) {
            this.sauseInside = sauseInside;
            return this;
        }

        @Override
        public Dpizza build() {
            return new Dpizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
