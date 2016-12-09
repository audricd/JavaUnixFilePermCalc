/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunixfilepermissions;
import java.util.Scanner; 

/**
 *
 * @author audric
 */
public class Javaunixfilepermissions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int read = 4;
        int write = 2;
        int execute = 1;
        
        
        Scanner permission = new Scanner(System.in);
        System.out.println("enter permission:");
        int permissioninput = permission.nextInt();
        
        if(permissioninput == read + write + execute){
            System.out.println("Permission is read+write+execute");}
        
        if(permissioninput == read + write){
            System.out.println("Permission is read+write");}
        
        if(permissioninput == read + execute){
            System.out.println("Permission is read+execute");}
        
        if(permissioninput == write + execute){
            System.out.println("Permission is write+execute");}
        
        if(permissioninput == write){
            System.out.println("Permission is write");}
        
        if(permissioninput == execute){
            System.out.println("Permission is execute");}
        
        else{
            System.out.println("wrong permission number");}
        }
    
    }
            
    
    

