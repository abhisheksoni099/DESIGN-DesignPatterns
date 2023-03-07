package com.abhisheksoni099.designpatterns.builder;

class Client {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .setBase("Double Burst")
                .setTopping("Paneer Tikka")
                .setName("Paneerza")
                .build();
        System.out.println("Created: " + pizza.getDescription());
    }
}
