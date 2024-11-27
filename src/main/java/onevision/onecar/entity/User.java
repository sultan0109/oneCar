package onevision.onecar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String phone;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Role> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Car> cars;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RepairOrder> repairOrders;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Invoice> invoices;

    // if oneCar prefer work with -> Getters and Setters
}
