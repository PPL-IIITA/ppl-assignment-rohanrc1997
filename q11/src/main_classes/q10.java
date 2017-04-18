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
import data_structures.random;
import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

/**
 *
 * @author Ronster
 */
public class q10 {
    
    
     public static void main(String[] args) throws IOException {
       
       random ds=new random(); 
       log_util lu=new log_util();
       lu.log_init();
       Scanner sc= new Scanner(System.in);
       random_gen_util u= new random_gen_util();
       u.random_gen(800,100,1000);
       ds.randomize(u.b);
       ds.randomize(u.g);
       ds.randomize(u.gt);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       ac.alloc_init(u.b, u.g);
       ac.print_couple();
       pg.do_gift(ac.c,u.gt);
       printk_th pt=new printk_th();
       pt.printk(ac.c);
       
       
        
    }
}
