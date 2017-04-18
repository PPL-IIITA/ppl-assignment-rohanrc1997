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
import algorithm.search_boy;
import data_structures.boy;
import data_structures.girl;
import java.io.IOException;
import java.util.Scanner;
import utilities.log_util;
import utilities.random_gen_util;

/**
 *
 * @author Ronster
 */
public class q7 {
    
    
    public static void main(String[] args) throws IOException {
       
      
       log_util lu=new log_util();
       lu.log_init();
       Scanner sc= new Scanner(System.in);
       printk_th pk=new printk_th();
       int t,ch;
       random_gen_util u= new random_gen_util();
       u.random_gen(800,100,1000);
       alloc_couple ac=new alloc_couple();
       perform_gift pg= new perform_gift();
       ac.alloc_init(u.b, u.g);
       ac.print_couple();
       System.out.println("\n Enter the number of boys in the list : = 3 ");
       t=3;
       System.out.println("Enter the method to be used: 1.Array/Linked list (Default) ||  2. Sorted array  ||  3.Hash Table ");
       ch=1; 
       System.out.println("Enter the boy's name and attractiveness respectively : ");
       while(t-->0)
       {   search_boy sb=new search_boy();
           String s;
           int att,res=-1,size=0;
           s=sc.next();
           att=sc.nextInt();
           for(int i=0;i<ac.c.length;i++)
               size++;
           if(ch==2)
           {   
               sb.sort_couple(ac.c,size);
               res=sb.search_srt_array(ac.c, s, att,0,size-1);
           }
           else if(ch==3)
               res=sb.search_hash(ac.c, s,att,size);
           else
               res=sb.search_array(ac.c, s, att);
           
           if(res!=-1)
           System.out.println("The boy is committed");
              else
           System.out.println("The boy is not committed");
              
        }
    
        
    }
}
