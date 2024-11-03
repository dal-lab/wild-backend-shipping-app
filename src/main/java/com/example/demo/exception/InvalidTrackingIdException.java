package com.example.demo.exception;

public class InvalidTrackingIdException extends RuntimeException {
    public InvalidTrackingIdException(){
        super("존재하지 않는 Tracking Id 입니다.");
    }
}
