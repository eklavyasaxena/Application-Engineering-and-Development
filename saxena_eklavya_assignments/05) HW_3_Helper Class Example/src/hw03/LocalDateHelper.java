/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.time.format.DateTimeFormatter;


/**
 *
 * @author fanzhonghao
 */
public class LocalDateHelper {
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm:ss");
    public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");    
}
