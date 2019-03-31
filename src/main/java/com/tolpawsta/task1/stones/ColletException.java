package com.tolpawsta.task1.stones;

public class ColletException extends Exception {

    public ColletException() {
        super();
    }

    public ColletException(String message) {
        super(message);
    }

    public ColletException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColletException(Throwable cause) {
        super(cause);
    }

    protected ColletException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
