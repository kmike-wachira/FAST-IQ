/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastiq;

import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author kmike
 */
class Tclass extends TimerTask {

    public static int i = 0;

     private int no1;
      private int no2;
      
     public void Setterno1(int a){       
        this.no1=a;     
       }
     public void Setterno2(int b){       
        this.no1=b;     
       }
     
     public int getNumber1()
     {
       return this.no1;  
     }
     
     public int getNumber()
     {
       return this.no2;  
     }
    @Override
    public void run() {
        
        Random random=new Random();
        System.out.println(this.no1=random.nextInt(10));
         System.out.println(this.no2=random.nextInt(10));
       
       
                

    }

}

