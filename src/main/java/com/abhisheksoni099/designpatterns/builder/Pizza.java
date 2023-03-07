package com.abhisheksoni099.designpatterns.builder;

class Pizza {
    private String base;
    private String topping;
    private String name;
    private String description;

    public String getBase() {
        return base;
    }

    public String getTopping() {
        return topping;
    }

    public String getName() {
        return name;
    }

    private Pizza(Builder builder) {
        this.base = builder.base;
        this.topping = builder.topping;
        this.name = builder.name;
        this.description = generatePizzaDescription();
    }

    private String generatePizzaDescription() {
        return name + " with base \"" + base + "\" topped with \"" + topping + "\"";
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String base;
        private String topping;
        private String name;

        public Builder setBase(String base) {
            this.base = base;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Pizza build() {
            if (base == null) {
                throw new RuntimeException("A pizza cannot be made without the base");
            }
            return new Pizza(this);
        }
    }
}
