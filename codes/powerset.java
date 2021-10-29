import java .io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;



class powerset{
	public static void main(String[] args){
		char []set = {'a', 'b', 'c'};
        printPowerSet(set);

        int[][] ticketInfo = {{25,20,25}, {25,20,25}};
        String[][] seatingInfo = {{"Jamal", "Maria"}, {"Jake", "Suzy"},{"Emma", "Luke"}};
        System.out.println(seatingInfo[2][1]);


        int[] a= {3,2,1,4,6};
        permutation(a, new int[]{});
        //System.out.println(l);


	}

	static void printPowerSet(char []set)
    {
        for(int i = 0; i < Math.pow(2, set.length); i++)
        {
            for(int j = 0; j < Math.pow(2, set.length); j++)
            {
                if((i & (1 << j)) > 0)
                    System.out.print(set[j]);
            }
            System.out.println();
        }
    }


static void permutation(int[] arr, int[] prefix) {
        if (arr.length == 0) {
            System.out.println(Arrays.toString(prefix));
        }
        for (int i = 0; i < arr.length; i++) {
            int i2 = i;
            int[] pre = IntStream.concat(Arrays.stream(prefix), IntStream.of(arr[i])).toArray();
            int[] post = IntStream.range(0, arr.length).filter(i1 -> i1 != i2).map(v -> arr[v]).toArray();
            permutation(post, pre);
        }
    }


}

//O(2^n)












