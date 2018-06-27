package com.github.ssw.effectivejava.chapter02;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {

    public enum Topping {
        HAM, MUSHROOM, ONION, PEEPER, SAUSAGE
    }

    final EnumSet<Topping> toppings;

    Pizza(Pizza.Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        //Pizza 하위타입 리턴
        abstract Pizza build();

        protected abstract T self();
    }

}
