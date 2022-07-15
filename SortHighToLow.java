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
public class SortHighToLow {
    public static void selectionSort(ArrayList<String> x) {
        //Selection Sort
        for (int i = 4; i < x.size(); i = i + 5) {
            int maximumIndex = i;
            for (int j = i + 5; j < x.size(); j = j + 5) {;
                String max = x.get(maximumIndex);
                int maxPosition = Integer.parseInt(max);
                if (maxPosition < Integer.parseInt(x.get(j))) {
                    maximumIndex = j;
                }
            }
            //Sorting in ArrayList
            if (maximumIndex != i) {
                String price =  x.get(i);
                x.set(i, x.get(maximumIndex));
                x.set(maximumIndex, price);

                String rating = x.get(i - 1);
                x.set(i - 1, x.get(maximumIndex-1));
                x.set(maximumIndex - 1, rating);

                String phone_num = x.get(i - 2);
                x.set(i - 2, x.get(maximumIndex-2));
                x.set(maximumIndex - 2, phone_num);

                String location = x.get(i - 3);
                x.set(i - 3, x.get(maximumIndex-3));
                x.set(maximumIndex - 3, location);

                String hotel_name = x.get(i - 4);
                x.set(i - 4, x.get(maximumIndex-4));
                x.set(maximumIndex - 4, hotel_name);

            }
        }
    }
}
