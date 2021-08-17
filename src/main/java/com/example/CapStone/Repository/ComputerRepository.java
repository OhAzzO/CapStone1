package com.example.CapStone.Repository;

import com.example.CapStone.Entity.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ComputerRepository extends CrudRepository<Computer, Long> {
    List<Computer> findAll();
}