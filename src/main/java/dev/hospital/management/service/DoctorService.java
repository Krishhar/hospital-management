package dev.hospital.management.service;

import dev.hospital.management.model.Doctor;
import dev.hospital.management.repositary.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Iterable<Doctor> get() {
        return doctorRepository.findAll();
    }

    public void delete(Long id) {
        doctorRepository.deleteById(id);
    }

}
