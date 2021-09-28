import java.util.Arrays;

class matrices{
	public static void main(String[] args){
		int[][] a={{1, 2}, {3, 4}};
		int[][] b={{5, 6}, {7, 8}};

		
		int[][] c = add(a, b);
		for(int i=0;i<c.length;i++)
			for(int j=0;j<c[0].length;j++)
				System.out.print(c[i][j] +" ");
			System.out.println();

	}

	public static int[][]  add(int[][] a, int[][] b) {
		int row = a.length;
        int column = a[0].length;
        int[][] c = new int[row][column];
 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}