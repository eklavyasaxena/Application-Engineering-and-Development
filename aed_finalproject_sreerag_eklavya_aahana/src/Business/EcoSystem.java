package Business;

import Business.Customer.ChildDirectory;
import Business.DiseasesDrugs.DiseasesDirectory;
import Business.DiseasesDrugs.VaccinationDirectory;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private DiseasesDirectory diseasesDirectory;
    private VaccinationDirectory vaccinationDirectory;
    private WorkQueue workQueue;
    private UserAccount currentUser;
    private ChildDirectory childDirectory;
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        vaccinationDirectory = new VaccinationDirectory();
        diseasesDirectory = new DiseasesDirectory();
        workQueue = new WorkQueue();
        currentUser = new UserAccount();
        childDirectory = new ChildDirectory();
    }

    public UserAccount getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(UserAccount currentUser) {
        this.currentUser = currentUser;
    }

    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network) {
        networkList.remove(network);
    }
    
    public Network updateNetwork(Network network){
    networkList.remove(network);
    networkList.add(network);
    return network;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public DiseasesDirectory getDiseasesDirectory() {
        return diseasesDirectory;
    }
    
    public void setDiseasesDirectory(DiseasesDirectory diseasesDirectory) {
        this.diseasesDirectory = diseasesDirectory;
    }
    
    public VaccinationDirectory getVaccinationDirectory() {
        return vaccinationDirectory;
    }
    
    public void setVaccinationDirectory(VaccinationDirectory vaccinationDirectory) {
        this.vaccinationDirectory = vaccinationDirectory;
    }

    public ChildDirectory getChildDirectory() {
        return childDirectory;
    }

    public void setChildDirectory(ChildDirectory childDirectory) {
        this.childDirectory = childDirectory;
    }
    
    
    
    public boolean checkIfUsernameIsUnique(String username) {
        
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        
        return true;
    }

    public Enterprise getEnterprise(UserAccount uc) {
        for (Network network : networkList) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua == uc) {
                            return enterprise;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Network getNetwork(UserAccount uc) {
        for (Network network : networkList) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua == uc) {
                            return network;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Organization getOrganisation(UserAccount uc) {
        for (Network network : networkList) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua == uc) {
                            return organization;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Organization getOrganisation(Employee ep) {
        for (Network network : networkList) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
                        if (emp == ep) {
                            return organization;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    
    
}
