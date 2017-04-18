/*
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Ronster
 */

   // Class to implement random choosing of boys, girls and gifst while couple formation and gift transfer
public class random {
  
    // Implementing Fisher–Yates random shuffle
  public void randomize(girl[] ar)
  {
   
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      girl a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
  
  public void randomize(gift ar[])
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      gift a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
  
  public void randomize(boy ar[])
  {
       Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      boy a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
  }
  
}
}

