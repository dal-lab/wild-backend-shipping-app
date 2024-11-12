package com.example.demo.model;

public record ShippingInfo (
        Sender sender,
        Receiver receiver,
        Address address
) {
}
