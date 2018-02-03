package Business;

import Business.DiseasesDrugs.Diseases;
import Business.DiseasesDrugs.Vaccination;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() throws UnsupportedEncodingException {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("Sreerag");

        String pswd = system.getUserAccountDirectory().hash_SHA_512_SecurePassword("sysadmin", "ALERT");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", pswd, employee, new SystemAdminRole(), system);

        String pswd1 = system.getUserAccountDirectory().hash_SHA_512_SecurePassword("BosD1", "ALERT");
        DoctorRole dr = new DoctorRole();
        system.getUserAccountDirectory().createUserAccount("BosD1", pswd1, employee, dr, system);

        Diseases dis = system.getDiseasesDirectory().addDiseases();
        dis.setName("ChickenPox");
        Vaccination vac = system.getVaccinationDirectory().addVaccination();
        vac.setName("Varicella");
        vac.addInterval(0);
        vac.addInterval(1);
        dis.addVaccination(vac);


        Diseases dis1 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac1 = system.getVaccinationDirectory().addVaccination();
        dis1.setName("Diphtheria,\n" + "tetanus, and\n" + "whooping cough");
        vac1.setName("(pertussis" + "& DTaP)");
        vac1.addInterval(0);
        vac1.addInterval(1);
        vac1.addInterval(2);
        vac1.addInterval(3);
        vac1.addInterval(4);
        dis1.addVaccination(vac1);

        
        Diseases dis2 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac2 = system.getVaccinationDirectory().addVaccination();
        dis2.setName("Haemophilus\n" + "influenzae\n" + "type b");
        vac2.setName("Hib");
        vac2.addInterval(0);
        vac2.addInterval(1);
        vac2.addInterval(2);
        dis2.addVaccination(vac2);

        
        Diseases dis3 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac3 = system.getVaccinationDirectory().addVaccination();
        dis3.setName("Hepatitis A");
        vac3.setName("Hib");
        vac3.addInterval(0);
        vac3.addInterval(1);
        dis3.addVaccination(vac3);

        
        
        Diseases dis4 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac4 = system.getVaccinationDirectory().addVaccination();
        dis4.setName("Hepatitis B");
        vac4.setName("HepB");
        vac4.addInterval(0);
        vac4.addInterval(1);
        vac4.addInterval(2);
        vac4.addInterval(3);
        dis4.addVaccination(vac4);

        

        Diseases dis5 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac5 = system.getVaccinationDirectory().addVaccination();
        dis5.setName("Influenza");
        vac5.setName("Flu");
        vac5.addInterval(0);
        vac5.addInterval(1);
        dis5.addVaccination(vac5);
        
        
        

        Diseases dis6 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac6 = system.getVaccinationDirectory().addVaccination();
        dis6.setName("Measles, mumps,\n" + "rubella");
        vac6.setName("MMR");
        vac6.addInterval(0);
        vac6.addInterval(1);
        dis6.addVaccination(vac6);
        

        Diseases dis7 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac7 = system.getVaccinationDirectory().addVaccination();
        dis7.setName("Meningococcal");
        vac7.setName("(MenACWY\n" + "[MCV4], MenB)");
        vac7.addInterval(0);
        dis7.addVaccination(vac7);
        
        
        Diseases dis8 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac8 = system.getVaccinationDirectory().addVaccination();
        dis8.setName("Pneumococcal");
        vac8.setName("(Prevnar [con-\n" + "jugate vaccine,\n" + "\n" + "PCV], Pneumovax\n" + "[polysaccharide\n" + "vaccine, PPSV])");
        vac8.addInterval(0);
        vac8.addInterval(1);
        vac8.addInterval(2);
        vac8.addInterval(3);
        dis8.addVaccination(vac8);
        
        
        
        Diseases dis9 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac9 = system.getVaccinationDirectory().addVaccination();
        dis9.setName("Polio");
        vac9.setName("IPV");
        vac9.addInterval(0);
        vac9.addInterval(1);
        vac9.addInterval(2);
        vac9.addInterval(3);
        dis9.addVaccination(vac9);
        

        Diseases dis10 = system.getDiseasesDirectory().addDiseases();
        Vaccination vac10 = system.getVaccinationDirectory().addVaccination();
        dis10.setName("Rotavirus");
        vac10.setName("RV");
        vac10.addInterval(0);
        vac10.addInterval(1);
        dis10.addVaccination(vac10);
        
        
        

//        Network net = system.createAndAddNetwork();
//        net.setName("Kerala");
//        Enterprise ent= net.getEnterpriseDirectory().createAndAddEnterprise("kh1", Enterprise.EnterpriseType.Hospital);
//        ent.getEmployeeDirectory()
//        Organization orgdoc = ent.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
//        orgdoc.setName("Doctor");
//        Employee kh1d1 = orgdoc.getEmployeeDirectory().createEmployee("kh1d1");
//        String ps = system.getUserAccountDirectory().hash_SHA_512_SecurePassword("kh1d1", "ALERT");
//        DoctorRole dr= new DoctorRole();
//        orgdoc.getUserAccountDirectory().createUserAccount("kh1d1", ps, kh1d1, dr , system);
//           Diseases dis = system.getDiseasesDirectory().addDiseases();
//           dis.setName("Name of disease");
//           
//           
//           Vaccination vac = system.getVaccinationDirectory().addVaccination();
//           vac.setName("Vaccine name");
        return system;
    }

}
