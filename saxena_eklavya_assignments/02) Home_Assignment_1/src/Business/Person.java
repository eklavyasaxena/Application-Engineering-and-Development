/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import javax.swing.ImageIcon;
/**
 *
 * @author eklav
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int mobileNum;
    
    private LicenseData licenseData;
    private CreditCard creditCard;
    private Address address;
    private FinancialAccounts checkingAccount;
    private FinancialAccounts savingsAccount;
    
    ImageIcon image;
    
    public Person spouse;
            
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMobileNum() {
        return mobileNum;
    }

    public void setMobileNumber(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    public LicenseData getLicenseData() {
        return licenseData;
    }

    public void setLicenseData(LicenseData licenseData) {
        this.licenseData = licenseData;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public FinancialAccounts getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(FinancialAccounts checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public FinancialAccounts getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(FinancialAccounts savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
    
}
