package onevision.onecar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameRole;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // if oneCar prefer work with -> Getters and Setters
}
