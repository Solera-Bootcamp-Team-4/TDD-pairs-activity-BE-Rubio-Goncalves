package com.solera.rubiogoncalves.airlinesapp.airport;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Airport {
    String country;
    String name;
    String identifier;
}
