/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.geeks;
import data_structures.generous;
import data_structures.miser;
import data_structures.couple;
import data_structures.gift;

/*Q8 : To perform alternate gifting among all couples*/
public class perform_gift_alt {
    
    private static final int MISER = 3;
    private static final int GENEROUS=4;
    private static final int GEEKS = 5;
    
    public void do_gift(couple cmtnt[], gift gt[])
        {   sort_class v=new sort_class();
            v.sort(gt);
            int n=cmtnt[0].arr_size;
            System.out.println( "THE GIFT EXCAHNGE DETAILS ARE AS :" );
            for(int i=0; i<n; i++)
                {
                    try{
                    if(cmtnt[i].b.commit_type==MISER)
                        {
                            miser m= new miser(cmtnt[i].b.name,cmtnt[i].b.attractivens,cmtnt[i].b.budget,cmtnt[i].b.min_attrct,cmtnt[i].b.intell_lvl,cmtnt[i].b.commit_type);
                            m.miser_gift_alt(gt, cmtnt[i]);
                        }
                    else
                    if(cmtnt[i].b.commit_type==GENEROUS)
                        {
                            generous g= new generous(cmtnt[i].b.name,cmtnt[i].b.attractivens,cmtnt[i].b.budget,cmtnt[i].b.min_attrct,cmtnt[i].b.intell_lvl,cmtnt[i].b.commit_type);
                            g.generous_gift_alt(gt, cmtnt[i]);
                        }
                    else
                    if(cmtnt[i].b.commit_type==GEEKS)
                        {
                            geeks k=new geeks (cmtnt[i].b.name,cmtnt[i].b.attractivens,cmtnt[i].b.budget,cmtnt[i].b.min_attrct,cmtnt[i].b.intell_lvl,cmtnt[i].b.commit_type);
                            k.geeks_gift_alt(gt, cmtnt[i]);
                        }
                       
                    }  catch(ArrayIndexOutOfBoundsException e) { throw new ArrayIndexOutOfBoundsException("Couple List out of bounds");    } 
                       catch(ArrayStoreException e) { throw new ArrayStoreException("Invalid assignment of boy sub-type");    } 
                    }
                }
        

}

