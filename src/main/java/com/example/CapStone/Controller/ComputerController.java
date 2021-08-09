package com.example.CapStone.Controller;

import com.example.CapStone.Entity.Computer;
import com.example.CapStone.Services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComputerController {

    @Autowired
    ComputerService computerService;

    public ComputerController(ComputerService computerService){
        this.computerService = computerService;
    }

    public int addToDataBase(Computer computer){
        return computerService.addComputerToDataBase(computer);
    }

    public List<Computer> getFromDataBase() {
        return computerService.getAllComputerFromDataBase();
    }

}
