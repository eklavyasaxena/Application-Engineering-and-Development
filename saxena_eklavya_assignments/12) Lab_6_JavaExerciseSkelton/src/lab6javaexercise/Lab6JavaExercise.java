/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6javaexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author User
 */
public class Lab6JavaExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrDuplicateRemoval = {3, 4, 5, 9, 10, 7, 5, 5, 10, 10};
        System.out.println("****************Removal Of Dulicate Value Removal*******************");
        System.out.println("Integer list without removal of duplicate" + Arrays.toString(arrDuplicateRemoval));
        System.out.println("Integer list with removal of duplicate using two for loops" + Arrays.toString(removeDuplicate(arrDuplicateRemoval)));
        
        System.out.println("Integer list with removal using Sets");
        removeDuplicateHashSet(arrDuplicateRemoval);
        
        String text = "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean";
        System.out.println("****************Word frequency count*******************");
        countFrequency(text);

        int swapA = 10;
        int swapB = 20;
        System.out.println("****************Number Swapping*******************");
        swap(swapA, swapB);
        
        System.out.println("****************Number Without temp Swapping*******************");
        swapWithoutTemp(swapA, swapB);
        
        System.out.println("****************Reversal of String*******************");
        String reverseMe = "ReverseMe";
        System.out.println("Un reversed String-->" + reverseMe);
        reverseMe = reverse(reverseMe);
        System.out.println("Reversed String-->" + reverseMe);
        
        int[] sortData = {76, 89, 100, 54, 1, 9, 8, 45, 87};
        System.out.println("****************Sorting of Integer Array*******************");
        System.out.println("Unsorted Data-->" + Arrays.toString(sortData));
        sortData = bubbleSort(sortData);
        System.out.println("Sorted Data-->" + Arrays.toString(sortData));
        
        ArrayList<Animal> animalList = new ArrayList<>();
        String[] animalName = {"Dog", "Cat", "Girrafe", "Elephant"};
        List<String> names = Arrays.asList(animalName);
        Collections.shuffle(names);
        for (String name : names) {
            Animal animal = new Animal();
            animal.setName(name);
            Random r = new Random();
            int minAge = 10;
            int maxAge = 40;
            int age = r.nextInt(maxAge - minAge) + minAge;
            animal.setAge(age);
            animalList.add(animal);
        }
        System.out.println("****************Sorting of Objects using Age Factor*******************");
        System.out.println("Animals without Sorting of Age-->" + Arrays.toString(animalList.toArray()));
        Collections.sort(animalList, Animal.ASCENDING_COMPARATOR);
        System.out.println("Animals with sorting on Age-->" + Arrays.toString(animalList.toArray()));
        System.out.println("****************Filtering Objects*******************");
        System.out.println("Get animals between age 10 and 20" + getAnimalBetweenRange(animalList, 10, 20));
        
        System.out.println("****************Fibbonacci Series*******************");
        int count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1    
        printFibonacci(count - 2);//n-2 because 2 numbers are already printed
        
        System.out.println("\n****************Prime Number Series*******************");
        int largestNumber = 100; 
        printPrimeNumbers(largestNumber);
        
        System.out.println("\n****************Reverse A Number*******************");
        int number = 12130425; 
        reverseNumber(number);

    }

    //Method to remove the duplicate values from an integer array
    public static int[] removeDuplicate(int[] arrayWithDuplicates) {
        int[] arrayWithoutDuplicates = new int[arrayWithDuplicates.length];
        
        arrayWithoutDuplicates[0]=arrayWithDuplicates[0];
        
        int k = 1;
        boolean checkEquality = false;
        
        for(int i = 1; i < arrayWithDuplicates.length; i++){
            for(int j = i-1; j >= 0; j--){
                if((arrayWithDuplicates[i]==arrayWithDuplicates[j])){
                    checkEquality = true;
                    break;
                }
                
            }
            if(checkEquality==true){
                checkEquality=false;
                break;
            }
            arrayWithoutDuplicates[k]=arrayWithDuplicates[i];
            k++;
        }
        
        int[] arrayWithoutDuplicatesAndZeroes = new int[k];
        
        for(int i=0; i < k; i++){
            arrayWithoutDuplicatesAndZeroes[i] = arrayWithoutDuplicates[i];
        }
        
        return arrayWithoutDuplicatesAndZeroes;
    }
    
    
    public static void removeDuplicateHashSet(int[] input) {
        HashSet<Integer> output = new HashSet<>();
        for(int i = 0; i < input.length; i++){
            output.add(input[i]);
        }
        System.out.println(output);
    }

    //Method to count the frequency of words in the Text
    public static void countFrequency(String text) {
        //Use HashMap
        String[] splittedText = text.split("[\\s,;.]+");
        
        Map<String, Integer> hm = new HashMap<>();
        
        int contains;
        for(int i = 0; i < splittedText.length; i++){
            if(hm.containsKey(splittedText[i])){
                contains = hm.get(splittedText[i]);
                hm.put(splittedText[i], contains + 1);
            }
            else{
                hm.put(splittedText[i], 1);
            }
        }
        
        for(String key : hm.keySet()){
            System.out.println(key+": "+hm.get(key));
        }
    }

    //Method to Swap with temp
    public static void swap(int a, int b) {
        System.out.println("Numbers before swapping "+a+" "+b);
        
        int temp = 0;
        temp = a;
        a=b;
        b=temp;
        
        System.out.println("Numbers after swapping "+a+" "+b);
    }

    //Method to Swap without temp
    public static void swapWithoutTemp(int a, int b) {
       //Use maths
       System.out.println("Numbers before swapping "+a+" "+b);
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("Numbers after swapping "+a+" "+b);
    }

    //Method to reverse a String
    public static String reverse(String input) {
        //Use char array
        //Compare the 1st and last character and swap it keep on doing that
        char[] chr = input.toCharArray();
        int lengthOfChr = chr.length;
        int halfLength = (lengthOfChr)/2;
        char temp;
        for(int i = 0; i < halfLength; i++){
            temp = chr[i];
            chr[i] = chr[(lengthOfChr - 1) - i];
            chr[(lengthOfChr - 1) - i] = temp;
        }
        
        String output = new String(chr);
        return output;
    }

    //Method to Sort data
    public static int[] bubbleSort(int[] input) {
        //for all elements of list
        /* compare the adjacent elements */ 
        /* swap them */
        int temp = 0;
        
        for(int i = 0; i < input.length; i++){
            for(int j = 1;j < (input.length - i); j++){
                if(input[j-1]>input[j]){
                    temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    //Method to Search values between range
    public static ArrayList<Animal> getAnimalBetweenRange(ArrayList<Animal> animalList, int range1, int range2) {
        ArrayList<Animal> temp = new ArrayList();
        //Simple For each loop and use if condition
        for(Animal animal : animalList){
            if(range1<animal.getAge()&&animal.getAge()<range2){
                temp.add(animal);
            }
        }
        return temp;
    }
    
    
    //Method to generate Fibbonacci series
    static int n1 = 0, n2 = 1, n3 = 0;
    static void printFibonacci(int count) {
        for(int i=0; i < count; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
    
    //Method to generate Prime Numbers
    static void printPrimeNumbers(int largestNumber){
        for(int i = 2; i <= largestNumber; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if( i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.print(" " + i);
            }
        }   
    }
    
    //Method to reverse a Number
    static void reverseNumber(int number){
        int reverseNum = 0;
        
        while((number !=0)){
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + (number%10);
            number = number/10;
        }
        
        System.out.println(reverseNum);
    }
}
