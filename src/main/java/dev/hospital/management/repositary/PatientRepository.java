package dev.hospital.management.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.hospital.management.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
