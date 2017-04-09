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
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.log_util;
import utilities.random_gen_util;

/**
 *
 * @author Ronster
 */
public class q5 {
    
      public static void main(String[] args) throws IOException {
       
       log_util lu=new log_util();
       lu.log_init(); 
       Scanner sc= new Scanner(System.in);
       int ch=4;
       random_gen_util u= new random_gen_util();
       u.random_gen(800, 100, 1000);
       perform_gift pg=new perform_gift();
       System.out.println("Enter the Technique to be used for allocation: 1.Girl's Choice(Q1)    2. Alternate choice(Q4)");
       alloc_couple ac=new alloc_couple();
       ch=sc.nextInt();
       if(ch==1)
            ac.alloc_init(u.b, u.g);
       else
            ac.alloc_alt(u.b, u.g);
       ac.print_couple();
       pg.do_gift(ac.c,u.gt);
       printk_th pt=new printk_th();
       pt.printk_happy(ac.c);
       
    
     }
    
}
