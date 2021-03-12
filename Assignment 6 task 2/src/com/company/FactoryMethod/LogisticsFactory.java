package com.company.FactoryMethod;

public interface LogisticsFactory {
    static LogisticsFactory createMachineBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("road")){
            return new RoadLogisticsFactory();
        }
        if (speciality.equalsIgnoreCase("sea")){
            return new SeaLogisticsFactory();
        }
        else {
            throw new RuntimeException(speciality + "in unknown speciality.");
        }
    }
    Logistics createMachine();

}


