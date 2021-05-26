package Entities;

import Abstract.Entity;

public class CorporateCustomer extends Customer implements Entity {
    private String companyName;
    private double taxNumber;
    private String adress;



    public CorporateCustomer(){

    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(double taxNumber) {
        this.taxNumber = taxNumber;
    }
}
