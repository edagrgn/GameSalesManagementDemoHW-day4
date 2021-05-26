package Entities;

import Abstract.Entity;

public class IndividualCustomer extends Customer implements Entity {

    private String firstName;
    private String lastName;
    private String nationalityId;
    private int dateOfBirth;
    private String cardNo;


    public IndividualCustomer(){


    }
    public IndividualCustomer(String firstName,String lastName,String nationalityId,int dateOfBirth,String cardNo){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.dateOfBirth = dateOfBirth;
        this.cardNo = cardNo;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

}
