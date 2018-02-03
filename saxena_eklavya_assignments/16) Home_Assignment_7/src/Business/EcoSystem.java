/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DiseaseVaccine.DiseaseCatalog;
import Business.DiseaseVaccine.VaccineCatalog;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.EcoSystemAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    private DiseaseCatalog diseaseCatalog;
    private VaccineCatalog vaccineCatalog;
    private WorkQueue workQueue;
    
    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
    
    private EcoSystem(){
        //Super Cosntructor upon Inheritance
        super(null);
        networkList = new ArrayList<>();
        diseaseCatalog = new DiseaseCatalog();
        vaccineCatalog = new VaccineCatalog();
        workQueue = new WorkQueue();
    }
    
    //Define the abstract method of Organization
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new EcoSystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }
    
    //Add, Search / Update Functions for NETWORK
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    //Function (String username), Check if USERNAME is Unique
    public Enterprise getEnterprise(UserAccount uc){
        for(Network network : networkList){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua:organization.getUserAccountDirectory().getUserAccountList()){
                        if(ua ==uc){
                            return enterprise;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    
    public Network getNetwork(UserAccount uc){
        for(Network network : networkList){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua:organization.getUserAccountDirectory().getUserAccountList()){
                        if(ua ==uc){
                            return network;
                        }
                    }
                }
            }
        }
        return null;
    }

    
}
