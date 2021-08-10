package com.example.CapStone.Services;

import com.example.CapStone.Entity.Computer;
import com.example.CapStone.Repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ComputerService{

    @Autowired
    ComputerRepository ComputerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.ComputerRepository = computerRepository;
    }


    public int addComputerToDataBase(Computer computer) {
        return ComputerRepository.insertComputer(computer);
    }

    public List<Computer> getAllComputerFromDataBase() {
        return ComputerRepository.getAllComputers();
    }
}

