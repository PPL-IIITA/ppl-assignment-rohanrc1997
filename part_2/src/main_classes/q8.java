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
import algorithm.perform_gift_alt;
import algorithm.printk_th;
import algorithm.search_boy;
import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

/**
 *
 * @author Ronster
 */
public class q8 {
     
    public static void main(String[] args) throws IOException {
       
      
       log_util lu=new log_util();
       lu.log_init();
       Scanner sc= new Scanner(System.in);
       printk_th pk=new printk_th();
       int d=1;
       random_gen_util u= new random_gen_util();
       u.random_gen(800,100,1000);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       perform_gift_alt pga=new perform_gift_alt();
       ac.alloc_init(u.b, u.g);
       ac.print_couple();
       System.out.println("Enter:  1.Default Gift Allocation || 2. Alternate Gift System (Q8) :");
       d=sc.nextInt();
       if(d==2)
           pg.do_gift(ac.c, u.gt);
       else
           pga.do_gift(ac.c, u.gt);
    
        
    }
}
