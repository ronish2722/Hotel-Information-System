/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.is;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BinarySearch {
    static int binarySearch(ArrayList x, int min, int max, int num){
        //Checking odd or even
        if ((max/5+min/5) % 2 == 0){
            if (min > max){
                return -1;
            }

            int mid = (min + max) / 2;
            //Binary Searching
            if(num < Integer.parseInt((String)x.get(mid))){
                return binarySearch(x, min, mid-5, num);
            }
            else if(num > Integer.parseInt((String)x.get(mid))){
                return binarySearch(x, mid + 5, max, num);
            }
            else{
                return mid;
            }
        }
        else{
            if (min > max){
                return -1;
            }

            int mid = (min + max-5) / 2;
            //Binary Searching
            if(num < Integer.parseInt((String)x.get(mid))){
                return binarySearch(x, min, mid - 5, num);
            }
            else if(num > Integer.parseInt((String)x.get(mid))){
                return binarySearch(x, mid + 5, max, num);
            }
            else{
                return mid;
            }

        }}
}
