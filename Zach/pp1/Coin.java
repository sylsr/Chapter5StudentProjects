package pp1;

public class Coin 
{
	private final int HEADS = 0;
	private int face;
	private boolean head;
	
	
	public Coin()
	{
		
		flip();
		
	}
	public void flip()
	{
		
		head = ((int) (Math.random() * 2)) == 1;
		
		
	}
	public boolean isHeads()
	{
		return head;
	}
	public String toString()
	{
		return (face == HEADS) ? "HEADS" : "Tails";
	}

}
