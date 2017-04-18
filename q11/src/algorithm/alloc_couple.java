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
import data_structures.girl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.log_util;

/* To allocate couples */

public class alloc_couple {
    
    private static final int ATTRACTIVE = 0;
    private static final int INTELLIGENT = 1;
    private static final int RICH = 2;
    
    public couple c[];
    public int size;
    
    
    public void alloc_init(boy b[] , girl g[]) throws IOException
        {   
            c= new couple[g.length];
            int avl[]=new int[b.length];
            int i,j,k=0,tmp=0,ind=0;
            
            for(i=0;i<b.length;i++)
                avl[i]=1;
            
            log_util u=new log_util();
            
            try{
            for( i=0 ; i<g.length ; i++ )
               if(g[i]!=null) {   if(g[i].criteria==RICH)
                    { 
                        for(j=0; j< b.length;j++)
                        {   if(avl[j]!=0 && b[i]!=null)
                            if(b[j].budget>=g[i].main_budget && b[j].budget>tmp )
                            {       ind=j;
                                    tmp=b[j].budget;
                            }
                            }     
                            if(avl[ind]==1)    
                            {    c[k]=new couple(b[ind],g[i]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[ind]=0;
                                tmp=0;
                            }
                    }
                    else if(g[i].criteria==INTELLIGENT)
                    { 
                        for(j=0; j< b.length;j++)
                        {   if(avl[j]!=0 && b[i]!=null )
                            if(b[j].budget>=g[i].main_budget && b[j].intell_lvl>tmp )
                            {       ind=j;
                                    tmp=b[j].intell_lvl;
                            }
                            }    
                            if(avl[ind]==1)
                            {   c[k]=new couple(b[ind],g[i]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[ind]=0;
                                tmp=0;
                            }
                    }
                    else if(g[i].criteria==ATTRACTIVE)
                        {   
                            for(j=0; j< b.length;j++)
                            {   if(avl[j]!=0 && b[i]!=null )
                                if(b[j].budget>=g[i].main_budget && b[j].attractivens>tmp )
                                {       ind=j;
                                        tmp=b[j].attractivens;
                                }
                                }   
                                    if(avl[ind]==1)
                                    {   c[k]=new couple(b[ind],g[i]);
                                        u.log_util_alloc(c[k]);
                                        k++;
                                        avl[ind]=0;
                                    }
                        }
                }  }
            catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Girl or Boy List out of bounds");    }
              // if(this.size==0)
                    for(i=0;i<k;i++)
                    c[i].arr_size=k; 
                    this.size=k;
        }
    
    
     public void alloc_alt(boy b[] , girl g[]) throws IOException
        {   sort_class s=new sort_class();
            s.sort_boy_by_attrct(b);
            s.sort_girl_by_mntnc(g);
            c= new couple[g.length];
            int avl[]=new int[b.length];
            int avlg[]=new int[g.length];
            int i,k=0,tmp=0,ind=0,j=0,t=0;
            
            for(i=0;i<b.length;i++)
                 avl[i]=1;
            for(i=0;i<g.length;i++)
                 avlg[i]=1;
            log_util u=new log_util();
            i=0; 
            
            try{
            while(i<g.length && k<g.length)
            {
            if(t%2==0)
            {   t++;
                if(g[i]!=null) {  
                tmp=0;
                int l=0;
                if(g[i].criteria==RICH)
                    { 
                        for(l=0; l< b.length;l++)
                        {   if(avl[l]!=0 && b[l]!=null)
                            if(b[l].budget>=g[i].main_budget && b[l].budget>tmp )
                            {       ind=l;
                                    tmp=b[l].budget;
                            }
                            }     
                            if(avl[ind]==1)    
                            {   c[k]=new couple(b[ind],g[i]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[ind]=0;
                                avlg[i]=0;
                                tmp=0;
                            }
                    }
                    else if(g[i].criteria==INTELLIGENT)
                    { 
                        for(l=0; l< b.length;l++)
                        {   if(avl[l]!=0 && b[l]!=null )
                            if(b[l].budget>=g[i].main_budget && b[l].intell_lvl>tmp )
                            {       ind=l;
                                    tmp=b[l].intell_lvl;
                            }
                            }    
                            if(avl[ind]==1)
                            {   c[k]=new couple(b[ind],g[i]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[ind]=0;
                                avlg[i]=0;
                                tmp=0;
                            }
                    }
                    else if(g[i].criteria==ATTRACTIVE)
                        {   
                            for(l=0; l< b.length;l++)
                            {   if(avl[l]!=0 && b[l]!=null )
                                if(b[l].budget>=g[i].main_budget && b[l].attractivens>tmp )
                                {       ind=l;
                                        tmp=b[l].attractivens;
                                }
                                }   
                                    if(avl[ind]==1)
                                    {   c[k]=new couple(b[ind],g[i]);
                                        u.log_util_alloc(c[k]);
                                        k++;
                                        avl[ind]=0;
                                        avlg[i]=0;
                                        
                                    }
                        }
                    }  i++; 
                }
            else 
            {   t++;
                if(b[j]!=null && avl[j]==1 && k<g.length) {  
                        tmp=Integer.MIN_VALUE;
                        for(int p=0; p< g.length;p++)
                        { 
                            if(b[j].budget>=g[p].main_budget && g[p].attractivens>tmp && avlg[p]==1)
                            {       ind=p;
                                    tmp=g[p].attractivens;
                            }
                            }     
                                c[k]=new couple(b[j],g[ind]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[j]=0;
                                avlg[ind]=0;
                                
                            
                    } j++; t++;
                
            }
            }
            }  catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Girl or Boy List out of bounds");    }
                  
              // if(this.size==0)
                    for(i=0;i<k;i++)
                    c[i].arr_size=k; 
                    this.size=k;
        }
    
    
    
    public void print_couple()
    {   String sp="|";
        System.out.println("|| BOY NAME | BOY BUDGET | GIRL NAME | GIRL BUDGET ||");
        try{
        for(int i=0; i<size; i++)
             System.out.println( sp+sp+"  "+  c[i].b.name    +" "+sp+" "+
                                              c[i].b.budget  +" "+sp+" "+
                                              c[i].g.name    +" "+sp+" "+
                                              c[i].g.main_budget 
                                 +" "+sp+sp);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
             throw new  ArrayIndexOutOfBoundsException("The couples allocated are out of bound \n");
                                }
           
    }
    
    public void breakup_perform(boy b[], girl g[],int k)
    {   
       
        sort_class sc= new sort_class();
        sc.sort_leasthappy(c);
        String sp="|";
        System.out.println("\n The couples that broke up are as follows: \n ");
        System.out.println("|| BOY NAME | BOY BUDGET | GIRL NAME | GIRL BUDGET ||");
        for(int i=0;i<k;i++)
            {      
                  System.out.println( sp+sp+"  "+  c[i].b.name    +" "+sp+" "+
                                              c[i].b.budget  +" "+sp+" "+
                                              c[i].g.name    +" "+sp+" "+
                                              c[i].g.main_budget 
                                 +" "+sp+sp);
            }
      
        for(int i=0;i<k;i++)
        {   for(int j=0;j<b.length;j++)    
                if(b[i]==c[i].b)
                    b[i]=null;
        }
        
        for(int i=0;i<k;i++)
        {   g[i]=c[i].g;
        }
        
        for(int i=k;i<g.length;i++)
        { g[i]=null;
        }
        try {
            this.alloc_init(b, g);
        } catch (IOException ex) {
            Logger.getLogger(alloc_couple.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("The NEWLY formed couples formed after break-ups are: \n");
        this.print_couple();
    }
}
