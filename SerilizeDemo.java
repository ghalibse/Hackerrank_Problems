/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilizedemo;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class SerilizeDemo {
    
    
     public static void main(String[] args){
         
         Scanner inp = new Scanner(System.in);
         
         int N = inp.nextInt();
         
         int [] arr = new int[N];
         
         for (int k = 0; k < N ; k++)
              arr[k] = inp.nextInt();
         
        int i;
        
        for( i = 1 ; i < arr.length ;i++){
            
               int leftSum =  sum(Arrays.copyOfRange(arr, 0, i));
               int rightSum =  sum(Arrays.copyOfRange(arr, (i+1), arr.length));
               
               if (leftSum == rightSum) break;
        }
        System.out.println(i);
    }
    public static int sum( int[] arr){
        int tot =  0;
        for(int i : arr)
            tot += i;
        return tot;
    }
}
