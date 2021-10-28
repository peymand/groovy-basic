package com.behsa.groovy.oop

class Computer { //outer

    Cpu cpu
    String owner
    Computer(String cpuBrand){
        cpu = new Cpu(brand: cpuBrand)
    }

    def turnOn(){
        this.cpu.swichToOperate()
    }


    private class Cpu{ //inner or nested class non-static inner class
        int hertz
        int price
        String brand
        Date garanty

        def calc(){

        }

        def swichToOperate(){
            Computer.this.owner
        }

    }


}
