/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package dataitem;

import data_structures.gift;

/*Used to represent a utility gift entity*/
public class utility_gift extends gift {
    
    public int utility_value;
    public int utility_class;
    
    
    public utility_gift (int a, int b, int c, int d)
        {
            super(a,b,8);
            this.utility_value=c;
            this.utility_class=d;
            
        }
}
