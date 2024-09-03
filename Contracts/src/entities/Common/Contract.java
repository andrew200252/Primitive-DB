package entities.Common;

import java.util.Scanner;

public class Contract {
    private int id;
    private String beginDate;
    private String endDate;
    private int number;
    private Person owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", number=" + number +
                ", owner: " + owner +
                '}';
    }

    public void setContract(Scanner scan, int idCount){
        Person owner = new Person();

        owner.setId(idCount);
        scan.nextLine();
        System.out.println("Enter person's FIO");
        owner.setFio(scan.nextLine());
        System.out.println("Enter person's birthday (format dd:mm:yyyy)");
        owner.setBirthday(scan.nextLine());
        System.out.println("Enter person's sex");
        owner.setSex(scan.nextLine());
        System.out.println("Enter person's passport (format ssss nnnnnn)");
        owner.setPassport(scan.nextLine());

        setOwner(owner);

        System.out.println("Enter contract's id");
        setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter contract's begin date");
        setBeginDate(scan.nextLine());
        System.out.println("Enter contract's end date");
        setEndDate(scan.nextLine());
        System.out.println("Enter contract's number");
        setNumber(scan.nextInt());
    }
}
