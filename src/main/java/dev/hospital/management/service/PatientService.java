package dev.hospital.management.service;

import dev.hospital.management.model.Patient;
import dev.hospital.management.repositary.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public Iterable<Patient> get() {
        return patientRepository.findAll();
    }

    public void delete(Long id) {
        patientRepository.deleteById(id);
    }
    
}
