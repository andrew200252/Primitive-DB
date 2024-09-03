package main;

import entities.specificContracts.InternetContract;
import entities.specificContracts.MobileContract;
import entities.specificContracts.TelevisionContract;
import repository.Repository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Repository repo = new Repository();

        int choice1;
        int choice2;
        int choiceId;
        Scanner scan = new Scanner(System.in);
        int idCount = 1;

        do {
            System.out.println("______Menu______");
            System.out.println("1. Add contract in base");
            System.out.println("2. Delete contract by its ID");
            System.out.println("3. Get information about contract by its ID");
            System.out.println("4. Get full information from data base");
            System.out.println("5. Exit");

            System.out.print("Choose the action: ");
            choice1 = scan.nextInt();

            switch (choice1){
                case 1:
                    do {
                        System.out.println("Choose contract you want to add");
                        System.out.println("1. Mobile contract;");
                        System.out.println("2. Internet contract;");
                        System.out.println("3. TV contract;");
                        System.out.println("4. Back");
                        choice2 = scan.nextInt();

                        switch (choice2){
                            case 1:
                                MobileContract mobileContract = new MobileContract();
                                mobileContract.setContract(scan, idCount);
                                mobileContract.setMobileContract(scan);
                                repo.setContracts(repo.addContract(mobileContract));
                                idCount++;
                                break;
                            case 2:
                                InternetContract internetContract = new InternetContract();
                                internetContract.setContract(scan, idCount);
                                internetContract.setInternetContract(scan);
                                repo.setContracts(repo.addContract(internetContract));
                                idCount++;
                                break;
                            case 3:
                                TelevisionContract televisionContract = new TelevisionContract();
                                televisionContract.setContract(scan, idCount);
                                televisionContract.setTelevisionContract(scan);
                                repo.setContracts(repo.addContract(televisionContract));
                                idCount++;
                                break;
                            case 4:
                                break;
                        }


                    }while (choice2!=4);
                    break;
                case 2:
                    System.out.println("Enter contract's ID you want to delete");
                    choiceId = scan.nextInt();
                    repo.setContracts(repo.deleteContract(choiceId));
                case 3:
                    System.out.println("Enter contract's ID you want to see");
                    choiceId = scan.nextInt();
                    repo.viewContract(choiceId);
                    break;
                case 4:
                    repo.viewFull();
                    break;
                case 5:
                    break;
            }
        } while (choice1 != 5);
    }
}
