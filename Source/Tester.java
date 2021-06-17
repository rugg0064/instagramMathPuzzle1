import java.util.Random;
import java.util.ArrayList;
public class Tester 
{
	public static void main(String[] args) 
	{
		try
		{
			Random r = new Random();
			for(int i = 0; i < 100_000; i++)
			{
				MyNode<Integer> a = new MyNode<Integer>(Integer.valueOf(15));
				a.resize(r.nextInt(100));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		MySkipList.test();

		MySkipList<Integer> msl = new MySkipList<Integer>();
		msl.printList();
		Random r = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int initalsize = 1_000_000;
		for(int i = 0; i < initalsize; i++)
		{
			al.add(i);
		}
		
		while(al.size() > initalsize/4)
		{
			int index = r.nextInt(al.size());
			msl.insert(al.get(index));
			//System.out.printf("i:%d v:%s%n", index, al.get(index));
			al.remove(index);
		}
		msl.printList();
	}
}
