/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.couple;
import java.util.Scanner;

/*To find and print the k-most happiest and compatible couples*/
public class printk_th {
        
        public void printk(couple c[])
        {   
            int t;
            sort_class st=new sort_class();
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the value of k =  5 ");
            int k=5;
            System.out.println("\n The k-th Most Happiest Couples are:(in decreasing order) ");
            st.sort_happy(c);
            System.out.println("|| BOY NAME | GIRL NAME | HAPPINESS ||");
            t=0;
            while(c[t]!=null && t<k )
            {
                try{
                if(c[t].hapiness<0)
                    c[t].hapiness=0;
                System.out.println(c[t].b.name+" "+c[t].g.name+" "+c[t].hapiness);
                t++;
                }
            
                catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
                catch(UnsupportedOperationException e) { throw new UnsupportedOperationException("An unsupported operation was attempted on couple list ");    }
                catch(ArithmeticException e) { throw new ArithmeticException("Invalid operation on the data in the couple list ");    }
                
            }
                
           
       
            t=0;
            st.sort_comp(c);
            System.out.println(" \n \n The k-th Most Happiest Couples are:(in decreasing order): ");
            System.out.println("|| BOY NAME | GIRL NAME | COMPATIBILITY ||");
            while(t<k)
                {    System.out.println(c[t].b.name+" "+c[t].g.name+" "+c[t].compability);
                     t++;
                }
            }
        
        public void printk_happy(couple c[])
        {
            int t;
            sort_class st=new sort_class();
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the value of k: =5");
            int k= 5;
            System.out.println("\n The k-th Most Happiest Couples are:(in decreasing order) ");
            st.sort_happy(c);
            System.out.println("|| BOY NAME | GIRL NAME | HAPPINESS ||");
            t=0;
            try {
            while(t<k)
            {   if(c[t].hapiness<0)
                    c[t].hapiness=0;
                System.out.println(c[t].b.name+" "+c[t].g.name+" "+c[t].hapiness);
                t++;
            }
        }     catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
                catch(UnsupportedOperationException e) { throw new UnsupportedOperationException("An unsupported operation was attempted on couple list ");    }
                catch(ArithmeticException e) { throw new ArithmeticException("Invalid operation on the data in the couple list ");    }
            
        }
}
