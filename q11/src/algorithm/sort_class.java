/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.boy;
import data_structures.couple;
import data_structures.gift;
import data_structures.girl;

/*Contains Methods To sort the gift, girls, boys and couples based on different criterias*/
public class sort_class {
    
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    void sort( gift gt[] )
    {      
         
         int n = gt.length;  
         gift temp;  
         
         try{
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(  gt[j].value >  gt[j].value )  
                          {     
                                 temp = gt[j-1];  
                                 gt[j-1] = gt[j];  
                                 gt[j] = temp;  
                          }  
                 }
        
       }}       catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Gift List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of Gift object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
                
    }
    
    void sort_happy(couple c[])
    {
         int n = c[0].arr_size;  
         couple temp;  
         
         try{
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(  c[j-1].hapiness <  c[j].hapiness )  
                          {     
                                 temp = c[j-1];  
                                 c[j-1] = c[j];  
                                 c[j] = temp;  
                          }  
                 }
         }}
                catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
        
       
    }
    
    void sort_comp(couple c[])
    {        
            int n = c[0].arr_size;  
            couple temp;  
            try{
            for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++)
                     {  
                              if(  c[j-1].compability >  c[j].compability )  
                              {     
                                     temp = c[j-1];  
                                     c[j-1] = c[j];  
                                     c[j] = temp;  
                              }  
                     }

           } }  catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
        
    }
    
    void sort_leasthappy(couple c[])
    {
         int n = c[0].arr_size;  
         couple temp;  
         
         try{
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(  c[j-1].hapiness >  c[j].hapiness )  
                          {     
                                 temp = c[j-1];  
                                 c[j-1] = c[j];  
                                 c[j] = temp;  
                          }  
                 }
        
       } }      catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
    }
    
    public void sort_girl_by_mntnc(girl g[])
    {
         girl temp;  
         
         try{
         for(int i=0; i < g.length; i++){  
                 for(int j=1; j < g.length; j++)
                 {  
                          if( g[j-1].main_budget < g[j].main_budget )  
                          {     
                                 temp = g[j-1];  
                                 g[j-1] = g[j];  
                                 g[j] = temp;  
                          }  
                 }
        
       }}       catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Girl List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of Girl object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
    }
    
    public void sort_boy_by_attrct(boy g[])
    {
         boy temp;  
         
         try{
             
         for(int i=0; i < g.length; i++){  
                 for(int j=1; j < g.length; j++)
                 {  
                          if( g[j-1].attractivens < g[j].attractivens )  
                          {     
                                 temp = g[j-1];  
                                 g[j-1] = g[j];  
                                 g[j] = temp;  
                          }  
                 }
        
       }}       catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Boy List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of Boy object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
    }
    
    
    
    void sort_boy_by_attrct(couple c[],int s)
    {
         couple temp;  
         
         try{
         for(int i=0; i < s-1; i++){  
                 for(int j=i+1; j < s-1; j++)
                 {      if(c[j-1]!=null && c[j]!=null)
                          if( c[j-1].b.attractivens < c[j].b.attractivens )  
                          {     
                                 temp = c[j-1];  
                                 c[j-1] = c[j];  
                                 c[j] = temp;  
                          }  
                 }
        
       }}       catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
    }
    
    
    public void sort_gift_by_val(gift gt[])
    {
         gift temp;  
         try{
         for(int i=0; i < gt.length; i++){  
                 for(int j=i+1; j < gt.length; j++)
                 {      if(gt[j-1]!=null && gt[j]!=null)
                          if( gt[j-1].value < gt[j].value )  
                          {     
                                 temp = gt[j-1];  
                                 gt[j-1] = gt[j];  
                                 gt[j] = temp;  
                          }  
                 }
        
       }}
                catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Gift List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of Gift object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
        
    }
    
    
    
   
    
}
