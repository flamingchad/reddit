package com.example.reddit.exceptions;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exMessage) {
        super(exMessage);
    }

    // Add this constructor
    public SpringRedditException(String exMessage, Throwable cause) {
        super(exMessage, cause);
    }
}
