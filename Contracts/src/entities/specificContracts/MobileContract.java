package entities.specificContracts;

import entities.Common.Contract;

import java.util.Scanner;

public class MobileContract extends Contract {
    private int minutes;
    private int sms;
    private int gb;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public void setMobileContract(Scanner scan){
        System.out.println("Enter minutes");
        setMinutes(scan.nextInt());
        System.out.println("Enter sms");
        setSms(scan.nextInt());
        System.out.println("Enter Gb");
        setGb(scan.nextInt());
    }
}
