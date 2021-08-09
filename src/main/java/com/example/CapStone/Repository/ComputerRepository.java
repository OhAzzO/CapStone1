package com.example.CapStone.Repository;

import com.example.CapStone.Entity.Computer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository {

    // Define methods
    int insertComputer(Computer computer);
    List<Computer> getAllComputers();
}