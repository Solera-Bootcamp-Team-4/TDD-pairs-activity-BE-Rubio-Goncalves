package com.solera.rubiogoncalves.airlinesapp.user;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    String name;
    String surname;
    String nationality;
    String nif;
    int age;
    int[] bookings;
}
