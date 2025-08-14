class YouTube_v1
{
	void quality()
	{
		System.out.println("720p");
	}
}
class YouTube_v2 extends YouTube_v1
{
	
	void quality()
	{
		System.out.println("1080p 4k");
		super.quality();
	}
	
}
class MainClas4
{
	public static void main(String[] args) 
	{
		YouTube_v2 i2= new YouTube_v2();
		i2.quality();
	}
}
