/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package main_classes;

import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

import algorithm.alloc_couple;
import algorithm.perform_gift;
import algorithm.printk_th;

/*Program for Question 2*/
public class q2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       
       log_util lu=new log_util();
       lu.log_init();
       random_gen_util u= new random_gen_util();
       u.random_gen(1000,100,10000);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       ac.alloc_init(u.b, u.g);
       pg.do_gift(ac.c,u.gt);
       printk_th pt=new printk_th();
       pt.printk(ac.c);
       
       
        
    }
    
}
