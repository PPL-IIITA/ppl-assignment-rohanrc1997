/*
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

import algorithm.sort_class;


    // Class to find the best the data items with best value according to a given criteria
public class best_value {
      
    gift gt[];
    girl g[];
    boy b[];
    
    public void best_girl_by_maint(girl g[])
    
    {
        sort_class sc=new sort_class();
        sc.sort_girl_by_mntnc(g);
    }
    
    public void best_gift_by_val(gift gt[])
    {
        sort_class sc=new sort_class();
        sc.sort_gift_by_val(gt);
    }
    
    public void best_boy_by_attr(boy b[])
    {
        sort_class sc=new sort_class();
        sc.sort_boy_by_attrct(b);
    }
    
}
