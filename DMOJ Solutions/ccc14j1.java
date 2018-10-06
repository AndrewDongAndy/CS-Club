/*
 * The MIT License
 *
 * Copyright 2018 Kevin Jiang <kevin51jiang (at) email.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date written: 10/05/2018
 * @author Kevin Jiang <kevin51jiang (at) email.com>
 */
public class CCC14J1 {

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Instantiate input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Instantiate an array of 3 angles. It has a fixed size since it's defined
        //in the problem.
        int[] a = new int[3];

        //Takes in the input and puts it into the array
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        if (a[0] + a[1] + a[2] != 180) { //checks to see if the angles add up to 180
            System.out.println("Error");
        } else if (a[0] == 60 //checks to see if all 3 angles are 60
                && a[1] == 60
                && a[2] == 60) {

            System.out.println("Equilateral");
        } else if (a[0] != a[1] // checks to see if all three angles are unequal to each other
                && a[1] != a[2]
                && a[0] != a[2]) {

            System.out.println("Scalene");
        } else { //If it is a triangle, isn't Equilateral, and isn't scalene, then it must be Isosceles
            System.out.println("Isosceles");
        }

    }

}
