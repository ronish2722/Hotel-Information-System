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
public class SortLowToHigh {
    public static void selectionSort(ArrayList<String> x) {
        //Selection Sort
        for (int i = 4; i < x.size(); i = i + 5) {
            int minimumIndex = i;
            for (int j = i + 5; j < x.size(); j = j + 5) {
                String minimum = x.get(minimumIndex);
                int minimumValue = Integer.parseInt(minimum);
                if (minimumValue > Integer.parseInt(x.get(j))) {
                    minimumIndex = j;
                }
            }
            //Sorting in ArrayList
            if (minimumIndex != i) {
                String price =  x.get(i);
                x.set(i, x.get(minimumIndex));
                x.set(minimumIndex, price);

                String rating = x.get(i - 1);
                x.set(i - 1, x.get(minimumIndex-1));
                x.set(minimumIndex - 1, rating);

                String phone_num = x.get(i - 2);
                x.set(i - 2, x.get(minimumIndex-2));
                x.set(minimumIndex - 2, phone_num);

                String location = x.get(i - 3);
                x.set(i - 3, x.get(minimumIndex-3));
                x.set(minimumIndex - 3, location);

                String hotel_name = x.get(i - 4);
                x.set(i - 4, x.get(minimumIndex-4));
                x.set(minimumIndex - 4, hotel_name);

            }
        }
    }
}
