import java.io.*;
import java.util.*;

class ArrayRotation{
    public int[] leftRotate(int[] arr,int k){
        int n=arr.length;
        int[] temp=new int[k];
        // storing of element into temporary array
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        //shifting of the array
        for(int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }
        //appending the temp element 
        for(int i=0;i<k;i++){
            arr[i+n-k]=temp[i];
        }
        return arr;
    }
    //this method takes O(n) time complexity and space is O(d)

    //To Do method with time O(n) and space O(1)



  public void print(int[] arr){
      int n=arr.length;
      for(int i=0;i<n;i++){
          System.out.print(" "+arr[i]);
      }
  }

    public static void main(String[] args){
        ArrayRotation rotate=new ArrayRotation();
        int[] arr={ 1, 2, 3, 4, 5, 6, 7 }; 
        rotate.leftRotate(arr,3);
        rotate.print(arr);

        
    }
    
}