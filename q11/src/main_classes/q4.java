/*
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package main_classes;


import algorithm.alloc_couple;
import algorithm.perform_gift;
import algorithm.printk_th;
import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

import data_structures.*;
import dataitem.*;
import utilities.*;

public class q4 {

/*Program for Question 4*/


   
    public static void main(String[] args) throws IOException {
       
       log_util lu=new log_util();
       lu.log_init();
       Scanner sc= new Scanner(System.in);
       printk_th pk=new printk_th();
       random_gen_util u= new random_gen_util();
       u.random_gen(800, 100, 1000);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       ac.alloc_init(u.b, u.g);
       ac.print_couple();
       pg.do_gift(ac.c,u.gt);
       System.out.println("Enter the value of k=5");
       pk.printk(ac.c);
       ac.breakup_perform(u.b, u.g, 5);
       
       
       
        
    }
    
}


