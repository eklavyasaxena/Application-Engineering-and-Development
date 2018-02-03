/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class ChildDirectory {
    private ArrayList<ChildPortfolio> childPortfolioList;
    
    public ChildDirectory(){
        childPortfolioList = new ArrayList<>();
    }

    public ArrayList<ChildPortfolio> getChildPortfolioList() {
        return childPortfolioList;
    }
    public void setChildPortfolioList(ArrayList<ChildPortfolio> childPortfolioList) {
        this.childPortfolioList = childPortfolioList;
    }
    
    public void createChildPortfolio(ChildPortfolio childPortfolio){
        childPortfolioList.add(childPortfolio);
    }
    
    public boolean checkIfCustomerUsernameIsUnique(String username) {
        for (ChildPortfolio childPortfolio : childPortfolioList) {
            if (childPortfolio.getFather().getUserName().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
