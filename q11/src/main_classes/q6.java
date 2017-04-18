
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
import data_structures.boy;
import data_structures.couple;
import data_structures.girl;
import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

/**
 *
 * @author Ronster
 */
public class q6 {
    
    public static void main(String[] args) throws IOException {
       
      
       log_util lu=new log_util();
       lu.log_init();
       Scanner sc= new Scanner(System.in);
       printk_th pk=new printk_th();
       int a,b,c,t;
       
       random_gen_util u= new random_gen_util();
       u.random_gen(800,100,1000);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       ac.alloc_init(u.b, u.g);
       ac.print_couple();
       boy bb[]  = new boy[u.b.length];
       girl gg[] = new girl[u.g.length];
       System.out.println("Enter the t-days (t=5) ");
       t=5;
  
       for(int i=0;i<t;i++)
       {    u.random_gen(800, 100, 1000);
            ac.alloc_init(u.b, u.g);
            pg.do_gift( ac.c , u.gt );
            ac.print_couple();
            ac.breakup_perform( u.b , u.g , 5 );
            
       }
  
       System.out.println("The final allocation left after which are not broken yet "+ t +" days is : \n"); 
       ac.print_couple();
       
       
       
        
    }
    
    
}
