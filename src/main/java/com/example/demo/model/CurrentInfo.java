package com.example.demo.model;

public record CurrentInfo(
        Status status,
        PortCity portCity
) {

    public static CurrentInfo createInitial(PortCity portCity) {
        return new CurrentInfo(Status.PENDING, portCity);
    }
}
