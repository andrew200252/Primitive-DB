package entities.specificContracts;

import entities.Common.Contract;

import java.util.Scanner;

public class InternetContract extends Contract {
    private int internetSpeed;

    public int getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(int internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public void setInternetContract(Scanner scan){
        System.out.println("Enter internet speed");
        setInternetSpeed(scan.nextInt());
    }
}
