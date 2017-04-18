/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

/*The Generic object of this class represents an arbitrary gift of any type*/
public class gift {
    
    private static final int  LUXURY =  6;
    private static final int  ESSENTIAL= 7;
    private static final int  UTILITY = 8;
    
    
    public int type;
    public int price;
    public int value;
     
    public gift(int a,int b,int c)
        {
            this.price=a;
            this.value=b;
            this.type=c;
        }
    
  
}
