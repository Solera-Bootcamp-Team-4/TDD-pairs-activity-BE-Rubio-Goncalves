package com.solera.rubiogoncalves.airlinesapp.booking;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Booking {
    int bookingID;
    String userNIF;
    String flightID;
}
