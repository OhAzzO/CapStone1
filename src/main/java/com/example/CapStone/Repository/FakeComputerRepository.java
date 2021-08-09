package com.example.CapStone.Repository;

import com.example.CapStone.Entity.Computer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class fakeComputerRepository implements ComputerRepository{

    //create dataBase
    private static List<Computer> ComputerDataBase = new ArrayList<>();

    @Override
    public int insertComputer(Computer computer) {
        ComputerDataBase.add(new Computer(computer.getId(),computer.getName(), computer.getOverview(),computer.getSystemComponents(),computer.getPrice()));
        return 1;
    }

    @Override
    public List<Computer> getAllComputers() {
        return ComputerDataBase;
    }
}