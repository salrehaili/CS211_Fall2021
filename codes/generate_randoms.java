/*
 * The MIT License
 *
 * Copyright (c) 2021 Sameer Alrehaili <salrehaili@gmail.com>.
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
import java.util.ArrayList;
import java.io.*;
public class generate_randoms{
   public static void main(String[] args) throws IOException{
   		urandoms(10,1,10);		// generate 10 uniques random numbers in the range (1, 10), and write them into temp.dat file
  }
  
  public static void urandoms(int n, int min, int max) throws IOException {
  	// Create an output stream to the file
    PrintWriter writer = new PrintWriter("temp.dat", "UTF-8");

    // before generating numbers, it checks if the range less than the size.
  	if(n>(max-min)+1)
  		System.out.println("The range must be greater or equal than the size.");
  	else
  	{

  		ArrayList<Integer> arrayList = new ArrayList<Integer>();
  		int range = (max-min)+1;
  		while (arrayList.size() < n) { 
  			int r=(int)(Math.random()*range)+min;
  			if (!arrayList.contains(r))
    	        arrayList.add(r);
    	}
  		
	
	    	try {
	    		// Output values to the file
	    		for(int i=0;i<arrayList.size();i++)
	    			writer.println(arrayList.get(i));
	
	    		writer.close();
				}
				catch(Exception e) {
					System.out.println(e);
				}
	}
  }

}



