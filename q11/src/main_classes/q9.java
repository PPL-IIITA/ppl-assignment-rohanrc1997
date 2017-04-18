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
import data_structures.best_value;
import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

/**
 *
 * @author Ronster
 */
public class q9 {
    
      public static void main(String[] args) throws IOException {
       
       best_value vb= new best_value();
       log_util lu=new log_util();
       lu.log_init();
       Scanner sc= new Scanner(System.in);
       random_gen_util u= new random_gen_util();
       u.random_gen(800,100,1000);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       vb.best_boy_by_attr(u.b);
       vb.best_girl_by_maint(u.g);
       ac.alloc_init(u.b, u.g);
       ac.print_couple();
       vb.best_gift_by_val(u.gt);
       pg.do_gift(ac.c,u.gt);
       printk_th pt=new printk_th();
       pt.printk(ac.c);
       
       
        
    }
}
