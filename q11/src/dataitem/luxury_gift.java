/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package dataitem;

import data_structures.gift;

/*Used to represent a luxury gift entity*/
public class luxury_gift extends gift {
    
    public int luxury_rating;
    public int difficulty_obtain;
    
    
    public luxury_gift(int a, int b, int c, int d)
        {  
            super(a,b,6);
            this.luxury_rating=c;
            this.difficulty_obtain=d;
           
        }
}
