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
public class geeks extends boy{
    
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    public geeks(String a,int b,int c, int d,int e,int f)
    { super(a,b,c,d,e,f);
    }
    
    
    public void geeks_gift(gift[] gt, couple cp)
   {    
        int i,lux_index=0;
        return_giftvalue gv=new return_giftvalue();
        
       for(i=0;i<gt.length;i++)
       {    
            cp.gift_recieve(gt[i]);
            
             if(cp.price_sum >= cp.g.main_budget) 
                        break;
               
       }
    
         for(i=0;i<=gt.length;i++)
            if(gt[i].type==LUXURY)
                {       lux_index=i;  
                        break;
                }
         
         if(cp.b.budget-cp.price_sum>=gv.val(gt[lux_index]))
                cp.gift_recieve(gt[lux_index]);
         
         
       cp.calc_girl_hapiness();
       cp.calc_boy_hapiness();
       cp.calc_compability();
       cp.calc_hapiness();
              
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
    
      
    public void geeks_gift_alt(gift[] gt, couple cp)
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
