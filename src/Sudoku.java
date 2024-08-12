import java.util.HashMap;

public class Sudoku {

	public static void main(String[] args) {
		int[][]arr= {{7,3,5,6,1,4,8,9,2},
				     {8,4,2,9,7,3,5,6,1},
				     {9,6,1,2,8,5,3,7,4},
				     {2,8,6,3,4,9,1,5,7},
				     {4,1,3,8,5,7,9,2,6},
				     {5,7,9,1,2,6,4,3,8},
				     {1,5,7,4,9,2,6,8,3},
				     {6,9,4,7,3,8,2,1,5},
				     {3,2,8,5,6,1,7,4,9},
		};
		int res=0;
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer>matrix1=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer>matrix2=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer>matrix3=new HashMap<Integer,Integer>();
		
		for(int t=1;t<=9;++t)
		{
		    map.put(t, 0);
		    matrix1.put(t,0);
		    matrix2.put(t, 0);
		    matrix3.put(t, 0);
		}
		
		    outerloop:
			for(int i=0;i<9;++i)
			{
				System.out.println(i+"th loop");
				System.out.println();
				for(int j=0;j<9;++j)
				{
					
					if(map.containsKey(arr[i][j]))
					{
						int value=map.get(arr[i][j]);
						value=value+1;
						map.put(arr[i][j], value);
						System.out.println("map "+arr[i][j]+"=="+value);
						if(value>1)
						{
							System.out.println("Not a sudoku");
							res++;
							break outerloop;
						}
					}
					if(j<3 && matrix1.containsKey(arr[i][j]))
					{
						int value=matrix1.get(arr[i][j]);
						value=value+1;
						matrix1.put(arr[i][j], value);
						System.out.println("matrix1 "+arr[i][j]+"=="+value);
						if(value>1)
						{
							System.out.println("Not a sudoku");
							res++;
							break outerloop;
						}
					}
					if(j>2 && j<6 && matrix2.containsKey(arr[i][j]))
					{
						int value=matrix2.get(arr[i][j]);
						value=value+1;
						matrix2.put(arr[i][j], value);
						System.out.println("matrix2 "+arr[i][j]+"=="+value);
						if(value>1)
						{
							System.out.println("Not a sudoku");
							res++;
							break outerloop;
						}
					}
					if(j>5 && matrix3.containsKey(arr[i][j]))
					{
						int value=matrix3.get(arr[i][j]);
						value=value+1;
						matrix3.put(arr[i][j], value);
						System.out.println("matrix3 "+arr[i][j]+"=="+value);
						if(value>1)
						{
							System.out.println("Not a sudoku");
							res++;
							break outerloop;
						}
					}
				}
				for(int t=1;t<=9;++t)
				{
				    map.put(t, 0);
				    if((i+1)%3==0)
				    {
				    matrix1.put(t,0);
				    matrix2.put(t, 0);
				    matrix3.put(t, 0);
				    }
				}
				System.out.println();
			}
		
		if(res==0)
       System.out.println("SUDOKU");
		else
			System.out.println("Not a sudoku");
	}

}
