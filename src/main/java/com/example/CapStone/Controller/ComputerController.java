package com.example.CapStone.Controller;

import com.example.CapStone.Entity.Computer;
import com.example.CapStone.Services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ComputerController {

    @Autowired
    ComputerService computerService;

    public ComputerController(ComputerService computerService){

        this.computerService = computerService;
    }
    @PostMapping("/add")
    public void addToDataBase(Computer computer){

        computerService.addComputerToDataBase(computer);
    }

    public List<Computer> getFromDataBase() {

        return computerService.getAllComputerFromDataBase();
    }

}
