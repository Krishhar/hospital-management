package dev.hospital.management.controller;

import dev.hospital.management.model.Doctor;
import dev.hospital.management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class DoctorController {
    
    @Autowired
    private  DoctorService doctorService;

    @GetMapping("/")
    public String index(){
        return "addDoctor";
    }

    @PostMapping("/addDoctor")
    public String save(@Validated @ModelAttribute Doctor doctor) {
        doctorService.save(doctor);
        return "displayDoctor";
    }

    @GetMapping("/displayDoctor")
    public String get(Model model) {
        model.addAttribute("doctors",doctorService.get());
        return "displayDoctor";
    }

    @PostMapping("/deleteDoctor/{id}")
    public String delete(@PathVariable Long id,Model model) {
        doctorService.delete(id);
        model.addAttribute("doctors",doctorService.get());
        return "displayDoctor";
    }

}
