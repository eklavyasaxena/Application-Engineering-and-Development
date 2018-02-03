/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.util.ArrayList;

/**
 *
 * @author fanzhonghao
 */
public class Airplane {
    private String name;
    
    public Airplane(String a) {
        name = a;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
