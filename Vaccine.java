// joy was 5 years old has to get vaccinated cost is 5000 rupees + 5% GST display the total bill.
class Vaccine
{
	static void bill()
	{
		String name = "Joy";
		int age = 5;
		int price = 5000;
		String gst ="5%";
		double total = price + (price *5*0.01);
		System.out.println("The child name     : "+name);
		System.out.println(" Age	           : "+age);
		System.out.println("Price of vaccine   : "+price);
		System.out.println(" Gst        	   : "+gst);
		System.out.println("Total Amount       : "+total);
	}
	public static void main(String[] args)
	{
		bill();
	}


}