package com.example.Hospital_vm.repository;

import com.example.Hospital_vm.model.Paciente;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface PacienteRepository extends JpaRepository <Paciente, Integer> {

}
