package com.abhisheksoni099.designpatterns.singleton;

class LoggerService {
    private static LoggerService loggerService;

    private LoggerService() {
    }

    public static LoggerService getInstance() {
        if (loggerService == null) {
            loggerService = createInstance();
        }
        return loggerService;
    }

    private synchronized static LoggerService createInstance() {
        if (loggerService != null) {
            return loggerService;
        }
        return new LoggerService();
    }
}
