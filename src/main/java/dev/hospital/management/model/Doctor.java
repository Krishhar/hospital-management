package dev.hospital.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long doctorId;
    @NonNull
    private String name;
    private String specialization;
}
