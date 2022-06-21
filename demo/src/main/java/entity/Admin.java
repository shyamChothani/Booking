package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Admin {

    @Id
    @GeneratedValue
    private long adminId;
    private String firstName;
    private String lastName;
    private boolean isAdmin = true;
    private String email;

    @OneToMany
    private List<Flight> flights = new ArrayList<>();

    @OneToMany
    private List<Aircraft> aircrafts = new ArrayList<>();

    @OneToMany
    private List<Airport> airports = new ArrayList<>();
}
