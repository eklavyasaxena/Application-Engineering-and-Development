/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author eklav
 */
public class Account {
    private String routingNum;
    private String accountNum;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    public Account(){
        this.createdOn = new Date();
    }

    public String getRoutingNum() {
        return routingNum;
    }
    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }

    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    
    @Override
    public String toString(){
        return bankName;
    }
}
