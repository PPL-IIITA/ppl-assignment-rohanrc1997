/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

import algorithm.return_giftvalue;


/*Boy Data Sub-Structure*/
public class generous extends boy{
     
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    public generous(String a,int b,int c, int d,int e,int f)
    { super(a,b,c,d,e,f);
    }
    
    public int find_gift_index(int type,gift gt[],int curr)
    {   int i=0;
        for( i=curr;i<gt.length;i++)
        {
            if(gt[i].type==type)
                break;
        }
        return i;
    }
    
    
    public void generous_gift(gift[] gt, couple cp)
   {   
        int i;
        return_giftvalue gv=new return_giftvalue();
        
       for(i=gt.length-1;i>=0;i--)
       {    
            
            if(cp.price_sum + gv.val(gt[i]) > cp.b.budget) 
                    break;
            
            cp.gift_recieve(gt[i]);
               
       }
       
       
       
       
       cp.calc_girl_hapiness();
       cp.calc_boy_hapiness();
       cp.calc_compability();
       cp.calc_hapiness();
              
    }
    
    
    public void generous_gift_alt(gift[] gt, couple cp)
        {   
       int i;
       return_giftvalue gv=new return_giftvalue();
       int a[]= new int[10];
       for(i=0;i<10;i++)
           a[i]=0;
       
       for(i=0;i<gt.length;i++)
       {    
            if(gt[i].type==LUXURY)
                a[LUXURY]++;
            else if(gt[i].type==ESSENTIAL)
                a[ESSENTIAL]++;
            else if(gt[i].type==UTILITY)
                a[UTILITY]++;
            
            cp.gift_recieve(gt[i]);
            
             if(cp.price_sum >= cp.g.main_budget) 
                    break;
               
       }
       
       if(a[LUXURY]==0)
       {   int p=this.find_gift_index(LUXURY, gt, i);
           cp.gift_recieve(gt[p]);
           if(cp.price_sum>=cp.b.budget)
               cp.b.budget+=(cp.price_sum-cp.b.budget);
       }
       
        if(a[ESSENTIAL]==0)
       {   int p=this.find_gift_index(ESSENTIAL, gt, i);
           cp.gift_recieve(gt[p]);
           if(cp.price_sum>=cp.b.budget)
               cp.b.budget+=(cp.price_sum-cp.b.budget);
       }
        
         if(a[UTILITY]==0)
       {   int p=this.find_gift_index(UTILITY, gt, i);
           cp.gift_recieve(gt[p]);
           if(cp.price_sum>=cp.b.budget)
               cp.b.budget+=(cp.price_sum-cp.b.budget);
       }
         
         
       cp.calc_girl_hapiness();
       cp.calc_boy_hapiness();
       cp.calc_compability();
       cp.calc_hapiness();
              
    }
   
}
