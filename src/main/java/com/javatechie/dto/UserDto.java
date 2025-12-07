package com.javatechie.dto;

public record UserDto(
        int id,
        String name,
        String username,
        String email,
        Address address,
        String phone,
        String website,
        Company company
) {
    public static record Address(
            String street,
            String suite,
            String city,
            String zipcode,
            Geo geo
    ) { }

    public static record Geo(String lat, String lng) { }

    public static record Company(String name, String catchPhrase, String bs) { }
}

