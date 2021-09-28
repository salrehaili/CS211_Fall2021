import java .io.*;

class powerset{
	public static void main(String[] args){
		char []set = {'a', 'b', 'c'};
        printPowerSet(set);

        int[][] ticketInfo = {{25,20,25}, {25,20,25}};
        String[][] seatingInfo = {{"Jamal", "Maria"}, {"Jake", "Suzy"},{"Emma", "Luke"}};
        System.out.println(seatingInfo[2][1]);
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
}

//O(2^n)






int a=4;
int b=2;
int 




[1,3,4,5]











T(N)= Ci C(N)
1    * 2
2   *   n

T(n) = 2+2n

O(n)

O(2^n)