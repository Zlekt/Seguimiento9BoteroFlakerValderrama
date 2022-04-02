import java.util.*;

public class HighestAverage{
	public static void main(String[] args)
	{
		ArrayList<String> input=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			input.add(sc.nextLine());
		}
		sc.close();
		int n=Integer.parseInt(input.get(0));
		String[] values=input.get(1).split(" ");
		List<Integer> arr=new ArrayList<>();
		for(String h: values)
		{
			arr.add(Integer.parseInt(h));
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<Integer.parseInt(input.get(2)); i++) 
		{
			for(int c=0; c<n; c++)
			{
				int sum=0;
				int num=0;
				for(int d=0; d<=c; d++)
				{
					sum+=arr.get(d);
					num=d+1;
				}
				int highest=sum/num;
				if(highest>=Integer.parseInt(input.get(i+3)))
				{
					System.out.println(c);
					break;
				}
				else if(c==n-1)
				{
					System.out.println(n);
				}
			}
		}
	}
}