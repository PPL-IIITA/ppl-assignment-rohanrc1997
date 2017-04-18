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

/**
 *
 * @author Ronster
 */


public class search_boy {
    
    // Class to search for a given boy using a list, sorted list and a hash table
    public int search_array( couple c[], String s, int attrct )
    {
        int index=-1;
        try{
        for(int i=0;i<c.length;i++)
            {   if(c[i]!=null)
                if(c[i].b.name.equals(s))
                    index=i;
            }}
                catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of couple object");    } 
                catch(NullPointerException e) { throw new NullPointerException("Invalid use of a null referance ");    }
                
        
        if(index==-1)
            return -1;
        else
            return 1;
    }
    
    public int search_srt_array( couple c[], String s, int attr, int l, int r )
    {
       int m=(l+r)/2;
       if(l>=r)
           return -1;
       
           if(c[m].b.budget > attr)
               return this.search_srt_array(c, s, attr, l, m);
           else if( c[m].b.budget <attr)
               return this.search_srt_array(c, s, attr, m, r);
          
               return m;
       
       
       
       
       
       
    }
    
    public void sort_couple(couple c[],int size)
    {
        sort_class sc=new sort_class();
        sc.sort_boy_by_attrct(c,size);
    }
    
    
    public int search_hash(couple c[],String s,int attr,int size)
    {
        int hash[]=new int[10000];
        
        for(int i=0;i<10000;i++)
            hash[i]=0;
        
        try{
        for(int i=0;i<size;i++)
            hash[c[i].b.budget]++;
            }
         catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("The max hash table exceeded");    } 
             
        
        if(hash[attr]>=1)
            return 1;
        else 
            return -1;
        
    }
}
