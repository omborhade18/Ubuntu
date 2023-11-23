slip16.1

interface Square
{
	int calc(int x);
}
class Squaredemo implements Square
{
	public int calc(int x)
	{
		return x*x;
	}
		
	public static void main(String []args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int a=Integer.parseInt(br.readLine());
		Squaredemo sd=new Squaredemo();
		int ans=sd.calc(a);
		System.out.println(ans);
	}

}