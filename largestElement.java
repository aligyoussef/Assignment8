//This program will display the location of the largest value in a user inputted double array. 
/*The input of the array must be entered as shown: 1 1 1  (enter)
				                   3 1 5  (enter)
						   4 1 2 */                    
import java.util.Scanner;
public class largestElement
{
	static int rows = 0;
	static int columns = 0;
	static double[][] array = new double[rows][columns];
	
	public static void main(String[] args)
	{
		getInput();
		
		array = createArray(rows, columns);
		int[] array2 = locateLargest(array);
		System.out.println("Location of largest value at (" + array2[0] + ", " + array2[1] + ")");
	}

	public static void getInput()
	{
		System.out.println("Enter number of rows: ");
		Scanner input = new Scanner(System.in);
		rows = input.nextInt();

		System.out.println("Enter number of columns: ");
		columns = input.nextInt();
		
	}
	public static double[][] createArray(int row, int col)
	{
		double[][] arrayholder = new double[rows][columns];
		System.out.println("Enter array: ");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print("");
				arrayholder[i][j] = input.nextDouble(); 
				//System.out.print(array[i][j]);
			}
			System.out.println("");
		}
		return arrayholder;
	}
	public static int[] locateLargest(double[][] a)
	{
		double max = 0;
		int storeI = 0;
		int storeJ = 0;
		int[] array2 = new int[2];
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				if(a[i][j] > max)
				{
					max = a[i][j];
				        array2[0]=i;
					array2[1]=j;
				}
			}
		}
		return array2;
	}
	
}