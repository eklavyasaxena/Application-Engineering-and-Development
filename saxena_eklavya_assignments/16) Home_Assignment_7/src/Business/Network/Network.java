/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author eklav
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private WorkQueue workQueue;
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
        
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
