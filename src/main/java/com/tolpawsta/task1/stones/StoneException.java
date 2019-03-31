package com.tolpawsta.task1.stones;

public class StoneException extends Exception {

    public StoneException() {
    }

    public StoneException(String s) {
        super(s);
    }

    public StoneException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StoneException(Throwable throwable) {
        super(throwable);
    }

    public StoneException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
