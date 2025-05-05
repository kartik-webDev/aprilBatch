package package04;


public class Coaching {
	
	public Coaching()
	{
		this("h1", "h2");
		System.out.println("this is default constructor");
	}
	public Coaching(String a)
	{
		System.out.println("this is one parameterized constructor");
	}
	public Coaching(String a, String b)
	{
		this("h3");
		System.out.println("this is two parameterized constructor");
	}

	public static void main(String[] args) {
		Coaching obj = new Coaching();
		System.out.println("hello new changes");
	}

}
