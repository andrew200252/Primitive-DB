package entities.specificContracts;

import entities.Common.Contract;

import java.util.Scanner;

public class TelevisionContract extends Contract {
    String[] chanPack;

    public String[] getChanPack() {
        return chanPack;
    }

    public void setChanPack(String[] chanPack) {
        this.chanPack = chanPack;
    }

    public void setTelevisionContract(Scanner scan){
        System.out.println("Enter the channels separated by a space");
        String input = scan.nextLine();
        setChanPack(input.split("\\s+"));
    }

}
