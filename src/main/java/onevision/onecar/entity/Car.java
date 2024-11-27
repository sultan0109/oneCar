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
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String vin;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<RepairOrder> repairOrders;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Invoice> invoices;

    // if oneCar prefer work with -> Getters and Setters
}
