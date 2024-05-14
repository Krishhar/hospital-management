package dev.hospital.management.controller;

import dev.hospital.management.model.Patient;
import dev.hospital.management.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping("/patient")
    public String get() {
        return "addPatient";
    }
    @PostMapping("/addPatient")
    public String save(@Validated @ModelAttribute Patient patient) {
        patientService.save(patient);
        return "displayPatient";
    }

    @GetMapping("/displayPatient")
    public String get(Model model) {
        model.addAttribute("patients",patientService.get());
        return "displayPatient";
    }

    @PostMapping("/deletePatient/{id}")
    public String delete(@PathVariable Long id,Model model) {
        patientService.delete(id);
        model.addAttribute("doctors",patientService.get());
        return "displayPatient";
    }
}
