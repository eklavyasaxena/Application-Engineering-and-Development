/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Market.Customer;
import Business.Market.Market;
import Business.Market.MarketCatalog;
import Business.MarketOffers.MarketOffer;
import Business.MarketOffers.MarketOfferCatalog;
import Business.UserAccountPackage.UserAccountDirectory;
import Business.UserAccountPackage.UserAccount;
import Business.PersonPackage.Person;
import Business.PersonPackage.PersonDirectory;
import Business.PersonPackage.SalesPerson;
import Business.Sales.Order;
import Business.Sales.OrderCatalog;
import Business.Sales.OrderItem;
import Business.SupplierPackage.Product;
import Business.SupplierPackage.Supplier;
import Business.SupplierPackage.SupplierDirectory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 *
 * @author eklav
 */
public class Business {
    
    PersonDirectory personDirectory;
    UserAccountDirectory userAccountDirectory;
    SupplierDirectory supplierDirectory;
    MarketOfferCatalog marketOfferCatalog;
    MarketCatalog marketCatalog;
    OrderCatalog orderCatalog;
    SalesPerson salesPerson;
    
    
    
    
    public Business() throws UnsupportedEncodingException{
        
        this.personDirectory = new PersonDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.supplierDirectory = new SupplierDirectory();
        this.marketOfferCatalog = new MarketOfferCatalog();
        this.marketCatalog = new MarketCatalog();
        this.orderCatalog = new OrderCatalog();
        this.salesPerson = new SalesPerson();
                
        populateUsers();
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }
    
    

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }
    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public MarketCatalog getMarketCatalog() {
        return marketCatalog;
    }

    public void setMarketCatalog(MarketCatalog marketCatalog) {
        this.marketCatalog = marketCatalog;
    }

    public OrderCatalog getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(OrderCatalog orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    
    
    
    public void populateUsers() throws UnsupportedEncodingException{
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        String csvPerson = "person_data.csv";
        String csvSupplier = "supplier_data.csv";
        String csvMarketOffer = "marketOffer_data.csv";
        String csvUserAccount = "userAccount_data.csv";
        String csvOrder = "order_data.csv";
        
        try {
            br = new BufferedReader(new FileReader(csvPerson));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] personElement = line.split(csvSplitBy);
                
                Person person = new Person();
                personDirectory.getPersonList().add(person);
                String firstName = personElement[0];
                String lastName = personElement[1];
                String email = personElement[2];
                
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setEmail(email);
            }
            int i=1;
            for(Person p : personDirectory.getPersonList()){
                System.out.println(i+":PersonID-->"+p.getPersonID()+"\tFirstName-->"+p.getFirstName()+"\tLastName-->"+p.getLastName()
                    +"\tEmail-->"+p.getEmail());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
        try {
            br = new BufferedReader(new FileReader(csvSupplier));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] supplierElement = line.split(csvSplitBy);
                
                Supplier supplier = new Supplier();
                supplierDirectory.getSupplierlist().add(supplier);
                
                String supplierName = supplierElement[0];
                supplier.setSupplierName(supplierName);
                
                Product product1 = new Product();
                supplier.getProductCatalog().getProductList().add(product1);
                String prodName1 = supplierElement[1];
                String prodCostPrice1 = supplierElement[2];
                String availNum1 = supplierElement[3];
                product1.setProdName(prodName1);
                product1.setCostPrice(Double.parseDouble(prodCostPrice1));
                product1.setAvailNum(Integer.parseInt(availNum1));
                
                Product product2 = new Product();
                supplier.getProductCatalog().getProductList().add(product2);
                String prodName2 = supplierElement[4];
                String prodCostPrice2 = supplierElement[5];
                String availNum2 = supplierElement[6];
                product2.setProdName(prodName2);
                product2.setCostPrice(Double.parseDouble(prodCostPrice2));
                product2.setAvailNum(Integer.parseInt(availNum2));
                
                Product product3 = new Product();
                supplier.getProductCatalog().getProductList().add(product3);
                String prodName3 = supplierElement[7];
                String prodCostPrice3 = supplierElement[8];
                String availNum3 = supplierElement[9];
                product3.setProdName(prodName3);
                product3.setCostPrice(Double.parseDouble(prodCostPrice3));
                product3.setAvailNum(Integer.parseInt(availNum3));
                
                Product product4 = new Product();
                supplier.getProductCatalog().getProductList().add(product4);
                String prodName4 = supplierElement[10];
                String prodCostPrice4 = supplierElement[11];
                String availNum4 = supplierElement[12];
                product4.setProdName(prodName4);
                product4.setCostPrice(Double.parseDouble(prodCostPrice4));
                product4.setAvailNum(Integer.parseInt(availNum4));
                
                Product product5 = new Product();
                supplier.getProductCatalog().getProductList().add(product5);
                String prodName5 = supplierElement[13];
                String prodCostPrice5 = supplierElement[14];
                String availNum5 = supplierElement[15];
                product5.setProdName(prodName5);
                product5.setCostPrice(Double.parseDouble(prodCostPrice5));
                product5.setAvailNum(Integer.parseInt(availNum5));
                
            }
            int i=1;
            for(Supplier p : supplierDirectory.getSupplierlist()){
                System.out.println(i+":SupplierID-->"+p.getSupplierID()+"\tSupplierName-->"+p.getSupplierName());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
        try {
            br = new BufferedReader(new FileReader(csvMarketOffer));
            int count = 0;
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] marketOfferElement = line.split(csvSplitBy);
                
                MarketOffer marketOffer = new MarketOffer();
                marketOfferCatalog.getMarketOfferList().add(marketOffer);
                
                String floor = marketOfferElement[0];
                String target = marketOfferElement[1];
                String ceiling = marketOfferElement[2];
                
                marketOffer.setCeilingPercentage(Integer.parseInt(ceiling));
                marketOffer.setTargetPercentage(Integer.parseInt(target));
                marketOffer.setFloorPercentage(Integer.parseInt(floor));
                
                count++;
                
                if(count == 1){
                    Market market = new Market();
                    marketCatalog.getMarketList().add(market);
                    market.setMarketType("HigherEducation");
                    
                    for(int i=0; i<5; i++){
                        Customer customer = new Customer();
                        market.getCustomerDirectory().add(customer);
                        if(i==0){
                            customer.setCustomerName("Northeastern");
                        }
                        if(i==1){
                            customer.setCustomerName("MIT");
                        }
                        if(i==2){
                            customer.setCustomerName("BU");
                        }
                        if(i==3){
                            customer.setCustomerName("Cambridge");
                        }
                        if(i==4){
                            customer.setCustomerName("NYU");
                        }
                    }
                    
                    marketOffer.setMarket(market);
                }
                
                if(count == 2){
                    Market market = new Market();
                    marketCatalog.getMarketList().add(market);
                    market.setMarketType("Finance");
                    
                    for(int i=0; i<5; i++){
                        Customer customer = new Customer();
                        market.getCustomerDirectory().add(customer);
                        if(i==0){
                            customer.setCustomerName("HDFC");
                        }
                        if(i==1){
                            customer.setCustomerName("ICICI");
                        }
                        if(i==2){
                            customer.setCustomerName("Axis");
                        }
                        if(i==3){
                            customer.setCustomerName("SBI");
                        }
                        if(i==4){
                            customer.setCustomerName("Canara");
                        }
                    }
                    
                    marketOffer.setMarket(market);
                }
                
                if(count == 3){
                    Market market = new Market();
                    marketCatalog.getMarketList().add(market);
                    market.setMarketType("Health");
                    
                    for(int i=0; i<5; i++){
                        Customer customer = new Customer();
                        market.getCustomerDirectory().add(customer);
                        if(i==0){
                            customer.setCustomerName("Apollo");
                        }
                        if(i==1){
                            customer.setCustomerName("MissionHospital");
                        }
                        if(i==2){
                            customer.setCustomerName("Leelavati");
                        }
                        if(i==3){
                            customer.setCustomerName("Medanta");
                        }
                        if(i==4){
                            customer.setCustomerName("PentaNursing");
                        }
                        marketOffer.setMarket(market);
                    }
                }
            } 
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
        
        UserAccount userAccount = new UserAccount();
        
        userAccountDirectory.getUserList().add(userAccount);
        for (Person person : personDirectory.getPersonList()){
            if((person.getFirstName().compareTo("Eklavya")==0)){
                userAccount.setPerson(person);
            }
        }
        userAccount.setUserName("admin");
        
        String pswd = userAccount.hash_SHA_512_SecurePassword("admin", "COEXIST");
        userAccount.setPassword(pswd);
        userAccount.setRole("System Admin");
        userAccount.setStatus("Active");
        
        
        UserAccount userAccount1 = new UserAccount();
        
        userAccountDirectory.getUserList().add(userAccount1);
        for (Person person : personDirectory.getPersonList()){
            if((person.getFirstName().compareTo("Sachin")==0)){
                userAccount1.setPerson(person);
            }
        }
        userAccount1.setUserName("smadmin");
        
        String smpswd = userAccount1.hash_SHA_512_SecurePassword("smadmin", "COEXIST");
        userAccount1.setPassword(smpswd);
        userAccount1.setRole("S&M Admin");
        userAccount1.setStatus("Active");
        
        
        
        UserAccount userAccount2 = new UserAccount();
        
        userAccountDirectory.getUserList().add(userAccount2);
        for (Person person : personDirectory.getPersonList()){
            if((person.getFirstName().compareTo("Jeff")==0)){
                userAccount2.setPerson(person);
            }
        }
        userAccount2.setUserName("salesperson");
        
        String salespswd = userAccount2.hash_SHA_512_SecurePassword("salesperson", "COEXIST");
        userAccount2.setPassword(salespswd);
        userAccount2.setRole("Sales Person");
        userAccount2.setStatus("Active");
        
        
        
        UserAccount userAccount3 = new UserAccount();
        
        userAccountDirectory.getUserList().add(userAccount3);
        for (Supplier supplier : supplierDirectory.getSupplierlist()){
            if((supplier.getSupplierName().compareTo("HP")==0)){
                userAccount3.setSupplier(supplier);
            }
        }
        userAccount3.setUserName("supplier");
        
        String supplierpswd = userAccount3.hash_SHA_512_SecurePassword("supplier", "COEXIST");
        userAccount3.setPassword(supplierpswd);
        userAccount3.setRole("Supplier");
        userAccount3.setStatus("Active");
        
        int j = 1;
        for (UserAccount u : userAccountDirectory.getUserList()){
            if(u.getPerson()!=null){
                System.out.println(j+":UserID-->"+u.getUserID()+"\tUserName-->"+u.getUserName()+
                        "\tPassword-->"+u.getPassword()+"\tRole"+u.getRole()+"\tStatus-->"+u.getStatus()
                            +"\nPersonID-->"+u.getPerson().getPersonID()+"\tFirstName--->"+u.getPerson().getFirstName()+
                            "\tLastName-->"+u.getPerson().getLastName()+"\tEmail-->"+u.getPerson().getEmail());
            }
            else{
                System.out.println(j+":UserID-->"+u.getUserID()+"\tUserName-->"+u.getUserName()+
                        "\tPassword-->"+u.getPassword()+"\tRole"+u.getRole()+"\tStatus-->"+u.getStatus()
                            +"\nSupplierID-->"+u.getSupplier().getSupplierID()+"\tSupplierName--->"+u.getSupplier().getSupplierName());
            }
            j++;
        }
        
        try {
            br = new BufferedReader(new FileReader(csvUserAccount));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] userAccountElement = line.split(csvSplitBy);
                
                UserAccount userAccount4 = new UserAccount();
                userAccountDirectory.getUserList().add(userAccount4);
                
                String userName = userAccountElement[0];
                String userPswd = userAccountElement[1];
                String userStatus = userAccountElement[2];
                String userRole = userAccountElement[3];
                
                Person person = new Person();
                personDirectory.getPersonList().add(person);
                
                String fName = userAccountElement[4];
                String lName = userAccountElement[5];
                String eMail = userAccountElement[6];
                
                person.setFirstName(fName);
                person.setLastName(lName);
                person.setEmail(eMail);
                
                userAccount4.setPerson(person);
                userAccount4.setUserName(userName);
                userAccount4.setStatus(userStatus);
                
                String hashPswd = userAccount.hash_SHA_512_SecurePassword(userPswd, "COEXIST");
                
                userAccount4.setPassword(hashPswd);
                userAccount4.setRole(userRole);
            }
            int k = 1;
            for (UserAccount u : userAccountDirectory.getUserList()){
                if(u.getPerson()!=null){
                    System.out.println(k+":UserID-->"+u.getUserID()+"\tUserName-->"+u.getUserName()+
                            "\tPassword-->"+u.getPassword()+"\tRole"+u.getRole()+"\tStatus-->"+u.getStatus()
                                +"\nPersonID-->"+u.getPerson().getPersonID()+"\tFirstName--->"+u.getPerson().getFirstName()+
                                "\tLastName-->"+u.getPerson().getLastName()+"\tEmail-->"+u.getPerson().getEmail());
                }
                else{
                    System.out.println(k+":UserID-->"+u.getUserID()+"\tUserName-->"+u.getUserName()+
                            "\tPassword-->"+u.getPassword()+"\tRole"+u.getRole()+"\tStatus-->"+u.getStatus()
                                +"\nSupplierID-->"+u.getSupplier().getSupplierID()+"\tSupplierName--->"+u.getSupplier().getSupplierName());
                }
                k++;
            }
            
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
        try {
            br = new BufferedReader(new FileReader(csvOrder));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] orderElement = line.split(csvSplitBy);
                
                
                
                Order order = new Order();
                orderCatalog.getOrderList().add(order);
                
                Market market = marketCatalog.searchMarket(orderElement[28]);
                order.setMarket(market);
                
                Customer customer = market.searchCustomer(orderElement[33]);
                order.setCustomer(customer);
                
                Person person = personDirectory.searchPerson(Integer.parseInt(orderElement[35]));
                order.setPerson(person);
                
                
                
                OrderItem orderItem1 = new OrderItem();
                order.getOrderItemList().add(orderItem1);
                
                Supplier supplier1 = supplierDirectory.searchSupplier(orderElement[39]);
                Product product1 = supplier1.getProductCatalog().searchProduct(orderElement[0]);
                orderItem1.setProduct(product1);
                System.out.println(product1.getProdName());
                orderItem1.setQuantity(Integer.parseInt(orderElement[8]));
                orderItem1.setSellingPrice(Double.parseDouble(orderElement[9]));
                orderItem1.setSoldItemBelowTarget(Integer.parseInt(orderElement[41]));
                
                
                OrderItem orderItem2 = new OrderItem();
                order.getOrderItemList().add(orderItem2);
                
                Supplier supplier2 = supplierDirectory.searchSupplier(orderElement[40]);
                Product product2 = supplier2.getProductCatalog().searchProduct(orderElement[11]);
                orderItem2.setProduct(product2);
                System.out.println(product2.getProdName());
                orderItem2.setQuantity(Integer.parseInt(orderElement[19]));
                orderItem2.setSellingPrice(Double.parseDouble(orderElement[20]));
                orderItem2.setSoldItemBelowTarget(Integer.parseInt(orderElement[42]));

                order.setRewardsEarned(Double.parseDouble(orderElement[27]));
                order.setSoldBelowTarget(Integer.parseInt(orderElement[26]));
                order.setTotalCostPrice(Double.parseDouble(orderElement[25]));
                order.setTotalSellingPrice(Double.parseDouble(orderElement[23]));
                order.setTotalTargetPrice(Double.parseDouble(orderElement[24]));
                
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
    }
    
    
//    public void simulateSales(Business business,int i){
//        for(int k=0;k<i;k++){
//            Random rand = new Random();
//            int randSupplier = rand.nextInt(5);
//            int randMarket = rand.nextInt(3);
//            int randCustomer = rand.nextInt(5);
//            int randUser = rand.nextInt(20);
//
//            
//            Supplier supplier = business.getSupplierDirectory().getSupplierlist().get(randSupplier);
//            
//            Market market = business.getMarketCatalog().getMarketList().get(randMarket);
//            
//            Customer customer = market.getCustomerDirectory().get(randCustomer);
//            
//            MarketOffer mo = business.getMarketOfferCatalog().searchMarket(market);
//            
//            Order order = new Order();
//            business.getOrderCatalog().addOrder(order);
//            
//            System.out.println(order);
//            
//            UserAccount userAccount = business.getUserAccountDirectory().getUserList().get(randUser);
//            
//            System.out.println(userAccount.getPerson().getFirstName());
//            
//            order.setCustomer(customer);
//            order.setMarket(market);
//            order.setPerson(userAccount.getPerson());
//            
//            System.out.println(order);
//            System.out.println(order.getCustomer().getCustomerName());
//            System.out.println(order.getMarket().getMarketType());
//            System.out.println(order.getPerson().getFirstName());
//            
//            double compensationEarned = 0;
//            
//            for(int n = 0; n < rand.nextInt(5) ; n++){
//                Product product = supplier.getProductCatalog().getProductList().get(n);
//                OrderItem oi = order.addOrderItem();
//                
//                double targetPrice = product.getCostPrice()*(((mo.getTargetPercentage())/100)+1);
//                double ceilingPrice = product.getCostPrice()*(((mo.getCeilingPercentage())/100)+1);
//                double floorPrice = product.getCostPrice()*(((mo.getFloorPercentage())/100)+1);
//
//                
//                product.setAvailNum(40);
//                
//                int itemsQuantity = rand.nextInt(40);
//                oi.setQuantity(itemsQuantity);
//                
//                
//                oi.setProduct(product);
//                
//                if(rand.nextBoolean()){
//                    double range = ceilingPrice - targetPrice;
//                    oi.setSellingPrice(targetPrice + rand.nextInt((int)range));
//                    compensationEarned += oi.getQuantity()
//                                        * (((oi.getSellingPrice()
//                                        - (oi.getProduct().getCostPrice()*(((mo.getTargetPercentage())/100)+1)))*0.1)
//                                        + ((oi.getProduct().getCostPrice()*(((mo.getTargetPercentage())/100)+1))*0.05));
//                }
//                
//                else{
//                    double range = targetPrice - floorPrice;
//                    oi.setSellingPrice(targetPrice - rand.nextInt((int)range));
//                    compensationEarned += oi.getQuantity()
//                                        * (((oi.getSellingPrice()
//                                        - (oi.getProduct().getCostPrice()*(((mo.getTargetPercentage())/100)+1)))*0.1)); 
//                }
//            }
//            
//            
//            order.setRewardsEarned(compensationEarned);
//            
//            
//            double totalSellingPrice = 0;
//            for(OrderItem orderItem : order.getOrderItemList()){
//                totalSellingPrice += orderItem.getQuantity()*orderItem.getSellingPrice();
//            }
//            order.setTotalSellingPrice(totalSellingPrice);
//            System.out.println("totalSellingPrice"+ totalSellingPrice); 
//
//            
//            double totalTargetPrice = 0;
//            for(OrderItem orderItem : order.getOrderItemList()){
//                totalTargetPrice += orderItem.getQuantity()*(orderItem.getProduct().getCostPrice()*(((mo.getTargetPercentage())/100)+1));
//            }
//            order.setTotalTargetPrice(totalTargetPrice);
//            System.out.println("totalTargetPrice "+totalTargetPrice);
// 
//            
//            double totalCostPrice = 0;
//            for(OrderItem orderItem : order.getOrderItemList()){
//                totalCostPrice += orderItem.getQuantity()*(orderItem.getProduct().getCostPrice());
//            }
//            order.setTotalCostPrice(totalCostPrice);
// 
//            
//            if(totalTargetPrice>totalSellingPrice){
//                order.setSoldBelowTarget(1);
//            }
//        }
//        for(Order order : orderCatalog.getOrderList()){
//            System.out.println(order.getCustomer());
//            System.out.println(order.getMarket());
//            System.out.println(order.getPerson().getFirstName());
//            System.out.println(order.getRewardsEarned());
//            System.out.println(order.getSoldBelowTarget());
//            System.out.println(order.getTotalCostPrice());
//            System.out.println(order.getTotalSellingPrice());
//            System.out.println(order.getTotalTargetPrice());
//        }
    
}

