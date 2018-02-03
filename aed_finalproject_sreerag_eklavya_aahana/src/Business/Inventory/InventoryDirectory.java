/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author sreer
 */
public class InventoryDirectory {
    ArrayList<InventoryItem> inventoryDirectory;
    
    public InventoryDirectory (){
        inventoryDirectory = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(ArrayList<InventoryItem> inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
    public void deleteInventoryItem(InventoryItem inventoryItem){
    inventoryDirectory.remove(inventoryItem);
    
    }
    public InventoryItem addItem(){
        InventoryItem item = new InventoryItem();
        inventoryDirectory.add(item);
        return item;
    }
    
    public void removeItem(InventoryItem item){
        inventoryDirectory.remove(item);
    }
    
}
