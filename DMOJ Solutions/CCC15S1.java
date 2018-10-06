/*
 * The MIT License
 *
 * Copyright 2018 Kevin J.
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
import java.util.ArrayList;

/**
 * CCC15S1 https://dmoj.ca/problem/ccc15s1
 *
 * @author Kevin J October 5, 2018
 */
public class Ccc15s1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Instantiate the BufferedReader to accept input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<Integer>(); //'a', short for accumulator. Takes in and keeps track of everything
        int k = Integer.parseInt(br.readLine()); //Gets the number of lines of input

        //For loop goes over each time, up until it reaches 'k'
        for (int i = 0; i < k; i++) {
            String s = br.readLine();//takes in one line
            //Checks to see if that line contains an instruction to remove, 
            //and that I'm safely able to remove an item from the accumulator 
            //without breaking the code
            if (s.equals("0") && !a.isEmpty()) {
                a.remove(a.size() - 1);
            } else { //If everything is safe and not 0, I'll just tack it onto the accumulator to deal with later
                a.add(Integer.parseInt(s));
            }
        }

        //initalizes the sum at 0, then proceeds to sum up the array.
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }

        //outputs the sum
        System.out.println(sum);
    }
}
