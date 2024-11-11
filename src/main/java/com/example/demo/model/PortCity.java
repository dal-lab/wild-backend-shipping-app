package com.example.demo.model;

public enum PortCity {
    BUSAN("Busan", "South Korea"),
    SHANGHAI("Shanghai", "China"),
    ROTTERDAM("Rotterdam", "Netherlands"),
    SINGAPORE("Singapore", "Singapore"),
    HAMBURG("Hamburg", "Germany"),
    LOS_ANGELES("Los Angeles", "USA"),
    DUBAI("Dubai", "UAE"),
    ANTWERP("Antwerp", "Belgium"),
    NEW_YORK("New York", "USA"),
    HONG_KONG("Hong Kong", "Hong Kong");

    private final String cityName;
    private final String country;

    PortCity(String cityName, String country) {
        this.cityName = cityName;
        this.country = country;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }
}

