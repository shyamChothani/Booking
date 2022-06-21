package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Flight {

    @Id
    @GeneratedValue
    private long flightId;
    private String flightNumber;

    @ManyToOne
    private Airport departureAirport;

    @ManyToOne
    private Airport destinationAirport;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date departureDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date arrivalDate;
    private double flightCharge;
    private int aircraft_id;
    private int departure_airport_id;
    private int destination_airport_id;

    @ManyToOne
    Aircraft aircraft;

    @OneToMany(mappedBy = "flight")
    List<Passenger> passenger = new ArrayList<>();
}
