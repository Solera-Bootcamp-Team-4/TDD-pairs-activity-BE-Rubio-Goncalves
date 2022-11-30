package com.solera.rubiogoncalves.airlinesapp.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    String name;
    String surname;
    String nationality;
    @Id String nif;
    int age;
    int[] bookings;
}
