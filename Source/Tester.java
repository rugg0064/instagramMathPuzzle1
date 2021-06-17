
public class Tester 
{
	public static void main(String[] args) 
	{
		for(int a = 1; a < 10; a++)
		{
			for(int b = 1; b < 10; b++)
			{
				for(int c = 1; c < 10; c++)
				{
					if(c %2 == 0)
					{
						continue;
					}
					for(int d = 1; d < 10; d++)
					{
						if(a == b || a == c || a == d ||
						   b == c || b == d ||
						   c == d)
						{
							continue;
						}
						if(((a*100 + b*10 + c) * 3) == (d*100 + d*10 + d))
						{
							System.out.printf("A: %d; B: %d; C: %d; D: %d%n", a, b, c, d);
						}
					}
				}
			}
		}
	}
}
