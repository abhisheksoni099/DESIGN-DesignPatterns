package com.abhisheksoni099.designpatterns.singleton;

class Client {
    public static void main(String[] args) {
        LoggerService loggerService1 = LoggerService.getInstance();
        LoggerService loggerService2 = LoggerService.getInstance();
        System.out.println(loggerService1 == loggerService2);
    }
}
