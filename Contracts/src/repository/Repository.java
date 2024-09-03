package repository;

import entities.Common.Contract;

public class Repository {
    private Contract[] contracts;

    public Contract[] getContracts() {
        return contracts;
    }

    public void setContracts(Contract[] contracts) {
        this.contracts = contracts;
    }

    public Contract[] addContract(Contract contract){
        Contract[] newContracts;
        if (contracts != null){
            newContracts = new Contract[contracts.length + 1];
            System.arraycopy(contracts, 0, newContracts,
                    0, newContracts.length);
            newContracts[contracts.length] = contract;
        } else {
            newContracts = new Contract[1];
            newContracts[0] = contract;
        }
        return newContracts;
    }

    public Contract[] deleteContract(int id){
        int place;
        boolean isNotEmpty = false;

        if (contracts!=null){
            for (int i=0; i < contracts.length; i++){
                if (contracts[i].getId() == id){
                    place = i;
                    isNotEmpty = true;
                    if (place==0) {
                        for (int j = 1; j < contracts.length; j++){
                            contracts[j-1]=contracts[j];
                        }
                    } else if (place == contracts.length-1){
                        contracts[contracts.length-1] = null;
                    } else {
                        for (int j=place; j<contracts.length; j++){
                            contracts[j]=contracts[j+1];
                        }
                    }
                    break;
                }
            }
        } else System.out.println("List is empty");
        if (isNotEmpty){
            Contract[] newContracts = new Contract[contracts.length-1];
            System.arraycopy(contracts, 0, newContracts,
                    0, newContracts.length);
            return newContracts;
        }else return contracts;

    }

    public void viewContract(int id){
        if (contracts!=null){
            for (Contract el: contracts){
                if (el.getId() == id){
                    System.out.println(el);
                    break;
                }
            }
        } else System.out.println("List is empty");

    }

    public void viewFull(){
        if (contracts!=null){
            for (Contract el: contracts){
                System.out.println(el);
            }
        } else System.out.println("List is empty");
    }
}
