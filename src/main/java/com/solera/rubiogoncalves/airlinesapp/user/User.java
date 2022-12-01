package com.solera.rubiogoncalves.airlinesapp.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    String name;
    String surname;
    String nationality;
    @Id String nif;
    int age;
}
