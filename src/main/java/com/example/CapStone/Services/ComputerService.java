package com.example.CapStone.Services;

import com.example.CapStone.Entity.Computer;
import com.example.CapStone.Repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ComputerService{

    @Autowired
    ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {

        this.computerRepository = computerRepository;
    }


    public void addComputerToDataBase(Computer computer) {

        computerRepository.save(computer);
    }

    public List<Computer> getAllComputerFromDataBase() {

        return computerRepository.findAll();
    }
}

