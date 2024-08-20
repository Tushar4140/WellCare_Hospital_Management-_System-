package com.HMSAPP.Hospital.Management.System.controller;

import com.HMSAPP.Hospital.Management.System.entity.patient;
import com.HMSAPP.Hospital.Management.System.repository.PatientRepositiry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {

    private final PatientRepositiry patientRepository;

    public PatientController(PatientRepositiry patientRepository) {
        this.patientRepository = patientRepository;
    }

    @PostMapping("/insert")
    public patient createPatient(@RequestBody patient patient) {
        return patientRepository.save(patient);
    }

    @GetMapping("/patients")
    public List<patient> getPatients() {
        return patientRepository.findAll();
    }
    
    @GetMapping("/patients/{id}")
    public ResponseEntity<patient> getPatientById(@PathVariable Long id) {
        Optional<patient> patientOptional = patientRepository.findById(id);
        if (patientOptional.isPresent()) {
            return ResponseEntity.ok(patientOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePatient(@PathVariable Long id) throws Exception {
        patient appointment = patientRepository.findById(id)
            .orElseThrow(() -> new Exception("Patient not found with id: " + id));
        patientRepository.delete(appointment);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<patient> updatePatient(@PathVariable Long id, @RequestBody patient patientDetails) {
        Optional<patient> patientOptional = patientRepository.findById(id);
        if (!patientOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        patient existingPatient = patientOptional.get();
        existingPatient.setName(patientDetails.getName());
        existingPatient.setAge(patientDetails.getAge());
        existingPatient.setBlood(patientDetails.getBlood());
        existingPatient.setPrescription(patientDetails.getPrescription());
        existingPatient.setDose(patientDetails.getDose());
        existingPatient.setFees(patientDetails.getFees());
        existingPatient.setUrgency(patientDetails.getUrgency());

        patient updatedPatient = patientRepository.save(existingPatient);
        return ResponseEntity.ok(updatedPatient);
    }
}