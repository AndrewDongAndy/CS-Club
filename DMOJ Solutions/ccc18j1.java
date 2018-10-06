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
import java.util.Arrays;

/**
 * Written 10/05/2018 https://dmoj.ca/problem/ccc14j1
 *
 * @author Kevin J
 */
public class Ccc18j1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Set up BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //since there are only 4 numbers, it's OK to hardcode the length.
        int[] n = new int[4];

        //Getting the input
        for (int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }

        //if...
        if ((n[0] == 8 || n[0] == 9) //the first number is either 8 or 9 AND
                && (n[3] == 8 || n[3] == 9) // the 4th number is either 8 or 9 AND
                && (n[1] == n[2])) { //the 2nd and 3rd numbers equal each other

            System.out.println("ignore");
        } else { //if it does not qualify as a telemarketer number, then it must be a real person's number
            System.out.println("answer");
        }
    }
}
