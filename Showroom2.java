package Showroom2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Showroom2  implements Booking2{
	private String name;
	private String location;
	private long phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void getBook() {
		System.out.println("name:"+name);
		System.out.println("LOCATION:"+location);
		System.out.println("PHONE NO:"+phone);
	}
	public static void main(String args[])
	{
      Showroom2 show=new Showroom2();
      show.vehicle();
	
	}
	static
	{
		System.out.println("WELCOME TO Showroom");
	}
	public void vehicle()
	{
		System.out.println("ENTER 1 for two wheeler");
		System.out.println("ENTER 2 for Four wheeler");
		try {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("WELCOME TO THE TWO WHEELER SECTION");
		Showroom2 s1=new Twowheeler();//upcasting
		Twowheeler t1=(Twowheeler)s1;//downcasting operator
		t1.twowheeler();
		
		break;
		case 2: System.out.println("WELCOME TO THE FOUR WHEELER SECTION");
		Showroom2 s2=new Fourwheeler();
		Fourwheeler t2=(Fourwheeler)s2;
		t2.fourwheeler();
		
		break;
		
	    default:System.out.println("wrong input");
	    break;
		}
		}catch(InputMismatchException s)
		{
			System.out.println("MISMATCHED INPUT");
			Showroom2 show=new Showroom2();
			show.vehicle();
		}
	}
class Twowheeler extends Showroom2{
	   public void twowheeler() {
		System.out.println("SELECT WHICH TYPE OF TWO WHEELER YOU WANT");
		System.out.println("ENTER 1 FOR BIKE");
		System.out.println("ENTER 2 FOR SCOOTY");
		System.out.println("ENTER 3 FOR BICYCLE");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED BIKE");
		Twowheeler t1=new Bike();//upcasting
		Bike b1=(Bike)t1;//downcasting opertor
		b1.bike();
		break;
		case 2: System.out.println("YOU SELECTED SCOOTY");
		Twowheeler t2= new Scooty();
		Scooty s1=(Scooty)t2;
		s1.scooty();
		break;
		case 3: System.out.println("YOU SELECTED BICYCLE");
		break;
	    default:System.out.println("wrong input");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 show=new Showroom2();
		         show.vehicle();
		}
	    break;
		}
		}
	   public void book() {
		   Booking t1 =new Booking();
		   t1.booking();
		   System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner sc=new Scanner(System.in);
		   int b= sc.nextInt();
		   switch(b) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		   }
	   }
	   
}
class Bike extends Twowheeler
{
	public void bike()
	{
		System.out.println("SELECT WHICH COMPANY BIKE YOU WANT");
		System.out.println("ENTER 1 FOR HONDA");
		System.out.println("ENTER 2 FOR SUZUKI");
		System.out.println("ENTER 3 FOR BAJAJ");
		System.out.println("ENTER 4 FOR YAMAHA");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED HONDA");
		Bike b1=new Honda();
		Honda h=(Honda)b1;
		h.honda();
		break;
		case 2: System.out.println("YOU SELECTED SUZUKI");
		Bike b2=new Gixxer1();
		Gixxer1 g=(Gixxer1)b2;
		g.suzuki();
		break;
		case 3: System.out.println("YOU SELECTED BAJAJ");
		Bike b3=new Bajaj();
		Bajaj bj=(Bajaj)b3;
		bj.bajaj();
		break;
		case 4:System.out.println("YOU SELECTED YAMAHA");
		Bike b4=new Yamaha();
		Yamaha y1=(Yamaha)b4;
		y1.yamaha();
		break;
	    default:System.out.println("wrong input");
	    System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 show=new Showroom2();
		         show.vehicle();
		}
	    break;
		}
		
		
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
class Honda extends Bike
{
	public void honda()
	{
		System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN HONDA");
		System.out.println("1.SHINE, 2.UNICORN, 3.LIVO 4.HORNET 5.CB 300R");
		System.out.println("ENTER 1 FOR SHINE");
		System.out.println("ENTER 2 FOR UNICORN");
		System.out.println("ENTER 3 FOR LIVO");
		System.out.println("ENTER 4 FOR HORNET");
		System.out.println("ENTER 5 FOR CB 300R");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED SHINE");
		Honda h1=new Shine();
		Shine s1=(Shine)h1;
		s1.shine();
		break;
		case 2: System.out.println("YOU SELECTED UNICORN");
		Honda h3=new Unicorn();
		Unicorn u1=(Unicorn)h3;
		u1.unicorn();
		break;
		case 3: System.out.println("YOU SELECTED LIVO");
		Honda h4=new Livo();
		Livo l1=(Livo)h4;
		l1.livo();
		break;
		case 4:System.out.println("YOU SELECTED HORNET");
		Honda h5=new Hornet();
		Hornet h11=(Hornet)h5;
		h11.hornet();
		break;
		case 5:System.out.println("YOU SELECTED CB 300R");
		Honda h6=new Cb300r();
		Cb300r c=(Cb300r)h6;
		c.cb300r();
	    break;
		default:System.out.println("wrong input");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
	    break;
		}
		
	}
}
class Shine extends Honda
{
	public void shine()
	{
		System.out.println("SELECT color");
		System.out.println("1.black 2.grey 3.blue");
		System.out.println("ENTER 1 FOR Black");
		System.out.println("ENTER 2 FOR Grey");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED Black color");
		black();
		break;
		case 2: System.out.println("YOU SELECTED Grey color");
		Grey();
		break;
		case 3: System.out.println("YOU SELECTED Blue color");
		Blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = SHINE");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		 System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA SHINE ");
		            break;
		             }
		   
	}
		           


	
	public void Grey()
	{
		System.out.println("COMPANY NAME = SHINE");
		System.out.println("COLOR = Grey");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		 System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA SHINE ");
		            break;
		             }
		
	}
	public void Blue()
	{
		System.out.println("COMPANY NAME = SHINE");
		System.out.println("COLOR = Blue");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		 System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA SHINE ");
		            break;
		             }
		
	}
}

class Unicorn extends Honda
{
	public void unicorn()
	{
		System.out.println("SELECT color");
		System.out.println("1.black 2.Matt grey 3.blue");
		System.out.println("ENTER 1 FOR Black");
		System.out.println("ENTER 2 FOR Grey");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED Black color");
		black();
		break;
		case 2: System.out.println("YOU SELECTED Matt Grey color");
		Grey();
		break;
		case 3: System.out.println("YOU SELECTED Blue color");
		Blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = UNICORN");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 105000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA UNICORN ");
		            break;
		             }
		
	}
	public void Grey()
	{
		System.out.println("COMPANY NAME = UNICORN");
		System.out.println("COLOR = Grey");
		System.out.println("PRICE = 105000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA UNICORN ");
		            break;
		             }

		
	}
	public void Blue()
	{
		System.out.println("COMPANY NAME = UNICORN");
		System.out.println("COLOR = Blue");
		System.out.println("PRICE = 105000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA UNICORN ");
		            break;
		             }	
	}
}


class Livo extends Honda
{
	public void livo()
	{
		System.out.println("SELECT color");
		System.out.println("1.black 2.Matt grey");
		System.out.println("ENTER 1 FOR Black");
		System.out.println("ENTER 2 FOR Grey");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED Black color");
		black();
		break;
		case 2: System.out.println("YOU SELECTED Matt Grey color");
		mattGrey();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = LIVO");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 85000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA LIVO ");
		            break;
		             }

		
	}
	public void mattGrey()
	{
		System.out.println("COMPANY NAME = LIVO");
		System.out.println("COLOR = Matt Grey");
		System.out.println("PRICE = 85000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA LIVO ");
		            break;
		             }
	}
}
class Hornet extends Honda
{
	public void hornet()
	{
		System.out.println("SELECT color");
		System.out.println("1.Mars Orange  2.Red 3.Blue ");
		System.out.println("ENTER 1 FOR Mars Orange");
		System.out.println("ENTER 2 FOR Red");
		System.out.println("ENTER 3 FOR blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED Mars Orange color");
		MarsOrange();
		break;
		case 2: System.out.println("YOU SELECTED Red color");
		Red();
		break;
		case 3: System.out.println("YOU SELECTED blue color");
		Blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	    public void MarsOrange()
	{
		System.out.println("COMPANY NAME = HORNET");
		System.out.println("COLOR = MARS ORANGE");
		System.out.println("PRICE = 85000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA HORNET ");
		            break;
		             }
		
	}
	   public void Red()
	{
		System.out.println("COMPANY NAME = HORNET");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 85000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA HORNET ");
		            break;
		             }
	}
		public void Blue()
		{
			System.out.println("COMPANY NAME = HORNET");
			System.out.println("COLOR = BLUE");
			System.out.println("PRICE = 85000");
			System.out.println("AVERAGE=60Kmpl");
			System.out.println("TO BOOK THE VEHICLE PRESS 1");
			   Scanner s=new Scanner(System.in);
			   int c= s.nextInt();
			   switch(c) {
			   case 1:  Booking d1 =new Booking();
			            d1.booking();
			            Payment p= new Payment();
			       	    p.payment();
			          
			            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA HPRNET ");
			            break;
			             }	
	}
}
 class Cb300r extends Honda
{
	 public void cb300r()
		{
			System.out.println("SELECT color");
			System.out.println("1.Mars Orange  2.Red 3.MattBlack ");
			System.out.println("ENTER 1 FOR Mars Orange");
			System.out.println("ENTER 2 FOR Red");
			System.out.println("ENTER 2 FOR blue");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			switch(a)
			{
			case 1: System.out.println("YOU SELECTED Mars Orange color");
			MarsOrange();
			break;
			case 2: System.out.println("YOU SELECTED Red color");
			Red();
			break;
			case 3: System.out.println("YOU SELECTED blue color");
			Blue();
			break;
			default:System.out.println("WRONG INPUT");
			System.out.println("REATURN TO MAIN MENU PRESS 1");
			Scanner s=new Scanner(System.in);
			int b=s.nextInt();
			switch(b)
			{
			case 1: Showroom2 df=new Showroom2();
			         df.vehicle();
			}
			break;
			}
		}
		    public void MarsOrange()
		{
			System.out.println("COMPANY NAME = CB300R");
			System.out.println("COLOR = MARS ORANGE");
			System.out.println("PRICE = 85000");
			System.out.println("AVERAGE=60Kmpl");
			System.out.println("TO BOOK THE VEHICLE PRESS 1");
			   Scanner s=new Scanner(System.in);
			   int c= s.nextInt();
			   switch(c) {
			   case 1:  Booking d1 =new Booking();
			            d1.booking();
			            Payment p= new Payment();
			       	    p.payment();
			          
			            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA CB300R ");
			            break;
			             }
			
		}
		   public void Red()
		{
			System.out.println("COMPANY NAME = CB300R");
			System.out.println("COLOR = RED");
			System.out.println("PRICE = 85000");
			System.out.println("AVERAGE=60Kmpl");
			System.out.println("TO BOOK THE VEHICLE PRESS 1");
			   Scanner s=new Scanner(System.in);
			   int c= s.nextInt();
			   switch(c) {
			   case 1:  Booking d1 =new Booking();
			            d1.booking();
			            Payment p= new Payment();
			       	    p.payment();
			          
			            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA CB300R ");
			            break;
			             }
		}
			public void Blue()
			{
				System.out.println("COMPANY NAME = CB300R");
				System.out.println("COLOR = BLUE");
				System.out.println("PRICE = 85000");
				System.out.println("AVERAGE=60Kmpl");
				System.out.println("TO BOOK THE VEHICLE PRESS 1");
				   Scanner s=new Scanner(System.in);
				   int c= s.nextInt();
				   switch(c) {
				   case 1:  Booking d1 =new Booking();
				            d1.booking();
				            Payment p= new Payment();
				       	    p.payment();
				          
				            System.out.println("CONGRATULATION YOU HAVE BOOK HONDA CB300R ");
				            break;
				             }	
		}
}
 class Suzuki extends Bike
{
		public void suzuki()
		{
			System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN SUZUKI");
			System.out.println("1.GIXXER 150, 2.GIXXER SF 250, 3.HAYABUSA 4.V-STORM SX ");
			System.out.println("ENTER 1 FOR GIXXER 150");
			System.out.println("ENTER 2 FOR GIXXER SF 250");
			System.out.println("ENTER 3 FOR HAYABUSA");
			System.out.println("ENTER 4 FOR V-STORM SX");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			switch(a)
			{
			case 1: System.out.println("YOU SELECTED GIXXER 150");
			Suzuki s1=new Gixxer1();
			Gixxer1 g1=(Gixxer1)s1;
			g1.gixxer1();
			break;
			case 2: System.out.println("YOU SELECTED GIXXER SF 250");
			Suzuki s2=new Gixxersf();
			Gixxersf gsf=(Gixxersf)s2;
			gsf.gixxersf();
			break;
			case 3: System.out.println("YOU SELECTED HAYABUSA");
			Suzuki s3=new Hayabusa();
			Hayabusa h=(Hayabusa)s3;
			h.hayabusa();
			break;
			case 4:System.out.println("YOU SELECTED V-STORM SX");
			Suzuki s4=new Vstorm();
			Vstorm v=(Vstorm)s4;
			v.vstorm();
			break;
			default:System.out.println("wrong input");
			System.out.println("REATURN TO MAIN MENU PRESS 1");
			Scanner s=new Scanner(System.in);
			int b=s.nextInt();
			switch(b)
			{
			case 1: Showroom2 df=new Showroom2();
			         df.vehicle();
			}
		    break;
			}}}
class Gixxer1 extends Suzuki
{
	public void gixxer1()
	{
		System.out.println("SELECT color");
		System.out.println("1.black 2.grey 3.blue");
		System.out.println("ENTER 1 FOR Black");
		System.out.println("ENTER 2 FOR Red");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED Black color");
		black();
		break;
		case 2: System.out.println("YOU SELECTED Red color");
		Red();
		break;
		case 3: System.out.println("YOU SELECTED Blue color");
		Blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = GIXXER");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI GIXXER");
		            break;
		             }
		
	}
	public void Red()
	{
		System.out.println("COMPANY NAME = GIXXER");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI GIXXER");
		            break;
		             }
		
	}
	public void Blue()
	{
		System.out.println("COMPANY NAME = GIXXER");
		System.out.println("COLOR = Blue");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI GIXXER");
		            break;
		             }
		
	}
}
class Gixxersf extends Suzuki
{
	public void gixxersf()
	{
		System.out.println("SELECT color");
		System.out.println("1.black 2.grey 3.blue");
		System.out.println("ENTER 1 FOR Black");
		System.out.println("ENTER 2 FOR Red");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED Black color");
		black();
		break;
		case 2: System.out.println("YOU SELECTED Red color");
		Red();
		break;
		case 3: System.out.println("YOU SELECTED Blue color");
		Blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = GIXXER SF250");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI GIXXERSF");
		            break;
		             }
		
	}
	public void Red()
	{
		System.out.println("COMPANY NAME = GIXXER SF250");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI GIXXERSF");
		            break;
		             }
		
	}
	public void Blue()
	{
		System.out.println("COMPANY NAME = GIXXER SF250");
		System.out.println("COLOR = Blue");
		System.out.println("PRICE = 95000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI GIXXERSF");
		            break;
		             }
		
	}
}
class Hayabusa extends Suzuki
{
	public void hayabusa()
	{
		System.out.println("SELECT color");
		System.out.println("1.white 2.black 3.Grey 4.Burnt Gold");
		System.out.println("ENTER 1 FOR white");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Grey");
		System.out.println("ENTER 3 FOR Burnt Gold");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED white");
		white();
		break;
		case 2: System.out.println("YOU SELECTED black");
		black();
		break;
		case 3: System.out.println("YOU SELECTED Grey");
		grey();
		case 4: System.out.println("YOU SELECTED Burnt Gold");
		burntgold();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = HAYABUSA");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,59,5000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI HAYABUSA");
		            break;
		             }
		
	}
	public void white()
	{
		System.out.println("COMPANY NAME = HAYABUSA");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 15,95,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI HAYABUSA");
		            break;
		             }
		
	}
	public void grey()
	{
		System.out.println("COMPANY NAME = HAYABUSA");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 15,95,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI HAYABUSA");
		            break;
		             }
		
	}
	public void burntgold()
	{
		System.out.println("COMPANY NAME = HAYABUSA");
		System.out.println("COLOR = BURNT GOLD");
		System.out.println("PRICE = 15,95,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI HAYABUSA");
		            break;
		             }
		
	}
}
class Vstorm extends Suzuki
{
	public void vstorm()
	{
		System.out.println("SELECT color");
		System.out.println("1.white 2.black 3.Yellow");
		System.out.println("ENTER 1 FOR white");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Yellow");
		System.out.println("ENTER 3 FOR Burnt Gold");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED White");
		white();
		break;
		case 2: System.out.println("YOU SELECTED Black");
		black();
		break;
		case 3: System.out.println("YOU SELECTED Yellow");
		yellow();
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void black()
	{
		System.out.println("COMPANY NAME = V-STORM SX");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,59,5000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI VSTROM-SX");
		            break;
		             }
		
	}
	public void white()
	{
		System.out.println("COMPANY NAME = V-STORM SX");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 3,95,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI VSTROM-SX");
		            break;
		             }
		
	}
	public void yellow()
	{
		System.out.println("COMPANY NAME = V-STORM SX");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 3,95,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SUZUKI VSTROM-SX");
		            break;
		             }
		
	}
	
}
class Bajaj extends Bike
{
	public void bajaj()
{
	System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN BAJAJ");
	System.out.println("1.PULSUR 200NS, 2.PULSUR 220, 3.PULSUR 180 4.PLATINA 5.DISCOVER 150");
	System.out.println("ENTER 1 FOR PULSUR 200NS");
	System.out.println("ENTER 2 FOR PULSUR 220");
	System.out.println("ENTER 3 FOR PULSUR 180");
	System.out.println("ENTER 4 FOR PLATINA");
	System.out.println("ENTER 5 FOR DISCOVER 150");
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
	case 1: System.out.println("YOU SELECTED PULSUR 200NS");
	Bajaj b1=new Pulsur1();
	Pulsur1 p1=(Pulsur1)b1;
	p1.pulsur1();
	break;
	case 2: System.out.println("YOU SELECTED PULSUR 220");
	 Bajaj b2=new Pulsur2();
	 Pulsur2 p2=(Pulsur2)b2;
	 p2.pulsur2(); 
	break;
	case 3: System.out.println("YOU SELECTED PULSUR 180");
	 Bajaj b3=new Pulsur3();
	 Pulsur3 p3=(Pulsur3)b3;
	 p3.pulsur3();
	 break;
	case 4:System.out.println("YOU SELECTED PLATINA");
	Bajaj b4=new Platina();
	Platina p4=(Platina)b4;
	p4.platina();
	break;
	case 5:System.out.println("YOU SELECTED DISCOVER 150");
	Bajaj b5=new Discover();
	Discover d1=(Discover)b5;
	d1.discover();
	
    break;
	default:System.out.println("wrong input");
	System.out.println("REATURN TO MAIN MENU PRESS 1");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	switch(b)
	{
	case 1: Showroom2 df=new Showroom2();
	         df.vehicle();
	}
    break;
	}
}}
class Pulsur1 extends Bajaj
{
	public void pulsur1()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR BLACK");
		System.out.println("ENTER 3 FOR BLUE");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = PULSUR 200NS");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 1,35,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 200NS");
		            break;
		             }
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = PULSUR 200NS");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,35,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 200NS");
		            break;
		             }
		
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = PULSUR 200NS");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,35,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 200NS");
		            break;
		             }
		
	}
}
class Pulsur2 extends Bajaj
{
	public void pulsur2()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = PULSUR 220");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 1,20,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 220");
		            break;
		             }
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = PULSUR 220");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,20,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 220");
		            break;
		             }
		
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = PULSUR 220");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,20,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 220");
		            break;
		             }
		
	}
}
class Pulsur3 extends Bajaj
{
	public void pulsur3()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = PULSUR 180");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 98,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 180");
		            break;
		             }
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = PULSUR 180");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 98,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 180");
		            break;
		             }
		
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = PULSUR 180");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 98,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PULSUR 180");
		            break;
		             }
		
	}
}
class Platina extends Bajaj
{
	public void platina()
	{
		System.out.println("SELECT color");
		System.out.println("1.RED 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR RES");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void red()
	{
		System.out.println("COMPANY NAME = PLATINA");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 1,20,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PLATINA");
		            break;
		             }
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = PLATINA");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,20,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PLATINA");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = PLATINA");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,20,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ PLATINA");
		            break;
		             }
	}
}
class Discover extends Bajaj
{
	public void discover()
	{
		System.out.println("SELECT color");
		System.out.println("1.RED 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void red()
	{
		System.out.println("COMPANY NAME = DISCOVER 180");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 85,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ DISCOVER 180");
		            break;
		             }
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = DISCOVER 180");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 85,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ DISCOVER 180");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = DISCOVER 180");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 85,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BAJAJ DISCOVER 180");
		            break;
		             }
	}
}
class Yamaha extends Bike
{
	public void yamaha()
	{
		System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN yamaha");
		System.out.println("1.YAMAHA R15 V3, 2.YAMAHA FZ200, 3.YAMAHA RX100 4.YAMAHA MT200");
		System.out.println("ENTER 1 FOR YAMAHA R15 V3");
		System.out.println("ENTER 2 FOR YAMAHA FZ200");
		System.out.println("ENTER 3 FOR YAMAHA RX100");
		System.out.println("ENTER 4 FOR YAMAHA MT200");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED YAMAHA R15 V3");
		Yamaha y1=new R15v3();
		R15v3 p1=(R15v3)y1;
		p1.r15v3();
		break;
		case 2: System.out.println("YOU SELECTED YAMAHA FZ200");
		 Yamaha y2=new Fz200();
		 Fz200 p2=(Fz200)y2;
		 p2.fz200(); 
		break;
		case 3: System.out.println("YOU SELECTED YAMAHA RX100");
		 Yamaha y3=new Rx100();
		 Rx100 p3=(Rx100)y3;
		 p3.rx100();
		 break;
		case 4:System.out.println("YOU SELECTED YAMAHA MT200");
		Yamaha y4=new Mt200();
		Mt200 p4=(Mt200)y4;
		p4.mt200();
		break;
		default:System.out.println("wrong input");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
	    break;
		}	
}}
class R15v3 extends Yamaha
{
	public void r15v3()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = YAMAHA R15 V3");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA R15 V3");
		            break;
		             }
		
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = YAMAHA R15 V3");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA R15 V3");
		            break;
		             }
		
		
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = YAMAHA R15 V3");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA R15 V3");
		            break;
		             }
		
		
	}
}
class Fz200 extends Yamaha
{
	public void fz200()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}

	public void mattgrey()
	{
		System.out.println("COMPANY NAME = YAMAHA FZ200");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA FZ200");
		            break;
		             }
		
	}
	public void black()
	{
		System.out.println("COMPANY NAME = YAMAHA FZ200");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA FZ200");
		            break;
		             }
		
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = YAMAHA FZ200");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA FZ200");
		            break;
		             }
	}
}

class Rx100 extends Yamaha
{
	public void rx100()
	{
		System.out.println("SELECT color");
		System.out.println("1.BLUE 2.RED 3.SILVER");
		System.out.println("ENTER 1 FOR BLUE");
		System.out.println("ENTER 2 FOR RED");
		System.out.println("ENTER 3 FOR SILVER");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED BLUE");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED RED");
		black();
		break;
		case 3: System.out.println("YOU SELECTED SILVER");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = YAMAHA RX100");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA RX100");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = YAMAHA RX100");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA RX100");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = YAMAHA RX100");
		System.out.println("COLOR = SILVER");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA RX100");
		            break;
		             }
	}
}
class Mt200 extends Yamaha
{
	public void mt200()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.BLACK 3.BLUE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR black");
		System.out.println("ENTER 3 FOR Blue");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = YAMAHA MT200");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA MT200");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = YAMAHA MT200");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA MT200");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = YAMAHA MT200");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 1,25,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK YAMAHA MT200");
		            break;
		             }
	}
}


//////////////////////////////////////////////////////////////////////////////////////////////////////



class Scooty extends Twowheeler
{
	public void scooty()
	{
		System.out.println("SELECT WHICH COMPANY BIKE YOU WANT");
		System.out.println("ENTER 1 FOR HONDA");
		System.out.println("ENTER 2 FOR SUZUKI");
		System.out.println("ENTER 3 FOR HERO");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED HONDA");
		Scooty s1=new Honda1();
		Honda1 h1=(Honda1)s1;
		h1.honda1();
		break;
		case 2: System.out.println("YOU SELECTED SUZUKI");
		Scooty s2=new Suzuki1();
		Suzuki1 h2=(Suzuki1)s2;
		h2.suzuki1();
		break;
		case 3: System.out.println("YOU SELECTED HERO");
		Scooty s3=new Hero1();
		Hero1 h3=(Hero1)s3;
		h3.hero1();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
              }
          }}
class Honda1 extends Scooty
{
	public void honda1()
	{
		System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN HONDA");
		System.out.println("1.ACTIVA 6G, 2.ACTIVA i 3.AVIATOR 4.DIO 125 5.CB 300R");
		System.out.println("ENTER 1 FOR ACTIVA 6G");
		System.out.println("ENTER 2 FOR ACTIVA i");
		System.out.println("ENTER 3 FOR AVIATOR");
		System.out.println("ENTER 4 FOR DIO 125");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED ACTIVA 6G");
		Honda1 h1=new Activa6g();
		Activa6g a1=(Activa6g)h1;
		a1.activa6g();
		break;
		case 2: System.out.println("YOU SELECTED ACTIVA i");
		Honda1 h2=new Activai();
		Activai a2=(Activai)h2;
		a2.activai();
		break;
		case 3: System.out.println("YOU SELECTED AVIATOR");
		Honda1 h3=new Aviator();
		Aviator a3=(Aviator)h3;
		a3.aviator();	
		break;
		case 4: System.out.println("YOU SELECTED DIO 125");
		Honda1 h4=new Dio125();
		Dio125 d1=(Dio125)h4;
		d1.dio125();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;}
}
}
class Activa6g extends Honda1
{
	public void activa6g()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.RED 3.BLUE 4.BLACK");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR WHITE");
		System.out.println("ENTER 3 FOR RED");
		System.out.println("ENTER 4 FOR BLUE");
		System.out.println("ENTER 5 FOR BLACK");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED WHITE");
		white();
		break;
		case 3: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 4: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		case 5: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = ACTIVA 6G");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA 6G");
		            break;
		             }
	}
	public void white()
	{
		System.out.println("COMPANY NAME = ACTIVA 6G");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA 6G");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = ACTIVA 6G");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA 6G");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = ACTIVA 6G");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA 6G");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = ACTIVA 6G");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA 6G");
		            break;
		             }
	}
}
class Activai extends Honda1
{
	public void activai()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.RED 3.BLUE 4.BLACK 5.WHITE");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR RED");
		System.out.println("ENTER 3 FOR BLUE");
		System.out.println("ENTER 4 FOR BLACK");
		System.out.println("ENTER 5 FOR WHITE");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		case 4: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 5: System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = ACTIVA i");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA i");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = ACTIVA i");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA i");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = ACTIVA i");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA i");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = ACTIVA i");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA i");
		            break;
		             }
	}
	public void white()
	{
		System.out.println("COMPANY NAME = ACTIVA i");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACTIVA i");
		            break;
		             }
	}
}

class Aviator extends Honda1
{
	public void aviator()
	{
		System.out.println("SELECT color");
		System.out.println("1.ORANGE 2.RED 3.BLACK");
		System.out.println("ENTER 1 FOR ORANGE");
		System.out.println("ENTER 2 FOR RED");
		System.out.println("ENTER 3 FOR BLACK");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED ORANGE");
		orange();
		break;
		case 2: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 3: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void orange()
	{
		System.out.println("COMPANY NAME = AVIATOR");
		System.out.println("COLOR = ORANGE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVIATOR");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = AVIATOR");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVIATOR");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = AVIATOR");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVIATOR");
		            break;
		             }
	}
	
}
class Dio125 extends Honda1
{
	public void dio125()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.RED 3.BLUE 4.DAZZLE YELLOW");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR RED");
		System.out.println("ENTER 3 FOR BLUE");
		System.out.println("ENTER 4 FOR DAZZLE YELLOW");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		blue();
		break;
		case 4: System.out.println("YOU SELECTED DAZZLE YELLOW");
		dazzleyellow();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = DIO 125");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK DIO 125");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = DIO 125");
		System.out.println("COLOR = RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK DIO 125");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = DIO 125");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK DIO 125");
		            break;
		             }
	}
	public void dazzleyellow()
	{
		System.out.println("COMPANY NAME = DIO 125");
		System.out.println("COLOR = DAZZLE YELLOW");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK DIO 125");
		            break;
		             }
	}
}

class Suzuki1 extends Scooty
{
	public void suzuki1()
	{
		System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN SUZUKI");
		System.out.println("1.ACCESS125 2.BERGMAN, 3.AVENIS");
		System.out.println("ENTER 1 FOR ACCESS 125");
		System.out.println("ENTER 2 FOR BERGMAN");
		System.out.println("ENTER 3 FOR AVENIS");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED ACCESS 125");	
		Suzuki1 s1=new Access();
		Access a1=(Access)s1;
		a1.access();
		break;
		case 2: System.out.println("YOU SELECTED BERGMAN");
		Suzuki1 s2=new Bergman();
		Bergman b1=(Bergman)s2;
		b1.bergman();
		break;
		case 3: System.out.println("YOU SELECTED AVENIS");
		Suzuki1 s3=new Avenis();
		Avenis a2=(Avenis)s3;
		a2.avenis();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;}
}
}
class Access extends Suzuki1
{
	public void access()
	{
		System.out.println("SELECT color");
		System.out.println("1.MATT GREY 2.MATT RED 3.BLUE 4.BLACK");
		System.out.println("ENTER 1 FOR MATT GREY");
		System.out.println("ENTER 2 FOR WHITE");
		System.out.println("ENTER 3 FOR MATT RED");
		System.out.println("ENTER 4 FOR BLUE");
		System.out.println("ENTER 5 FOR BLACK");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED MATT GREY");
		mattgrey();
		break;
		case 2: System.out.println("YOU SELECTED WHITE");
		white();
		break;
		case 3: System.out.println("YOU SELECTED MATT RED");
		red();
		break;
		case 4: System.out.println("YOU SELECTED BLUE");
		black();
		break;
		case 5: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void mattgrey()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = MATT GREY");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void white()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = MATT RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
}
class Bergman extends Suzuki1
{
	public void bergman()
	{
		System.out.println("SELECT color");
		System.out.println("1.WHITE 2.RED 3.BLUE 4.BLACK");
		System.out.println("ENTER 1 FOR WHITE");
		System.out.println("ENTER 2 FOR RED");
		System.out.println("ENTER 3 FOR BLUE");
		System.out.println("ENTER 4 FOR BLACK");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("YOU SELECTED WHITE");
		white();
		break;
		case 2: System.out.println("YOU SELECTED RED");
		red();
		break;
		case 3: System.out.println("YOU SELECTED BLUE");
		black();
		break;
		case 4: System.out.println("YOU SELECTED BLACK");
		black();
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;
		}
	}
	public void white()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR =  RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = ACCESS 125");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ACCESS 125");
		            break;
		             }
	}
}
class Avenis extends Suzuki1
{
	public void avenis()
	{
	System.out.println("SELECT color");
	System.out.println("1.WHITE 2.RED 3.BLUE 4.BLACK");
	System.out.println("ENTER 1 FOR WHITE");
	System.out.println("ENTER 2 FOR RED");
	System.out.println("ENTER 3 FOR BLUE");
	System.out.println("ENTER 4 FOR BLACK");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
	case 1: System.out.println("YOU SELECTED WHITE");
	white();
	break;
	case 2: System.out.println("YOU SELECTED RED");
	red();
	break;
	case 3: System.out.println("YOU SELECTED BLUE");
	black();
	break;
	case 4: System.out.println("YOU SELECTED BLACK");
	black();
	break;
	default:System.out.println("WRONG INPUT");
	System.out.println("REATURN TO MAIN MENU PRESS 1");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	switch(b)
	{
	case 1: Showroom2 df=new Showroom2();
	         df.vehicle();
	}
	break;
	}
}
	public void white()
	{
		System.out.println("COMPANY NAME = AVENIS");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVENIS");
		            break;
		             }
	}
	public void red()
	{
		System.out.println("COMPANY NAME = AVENIS");
		System.out.println("COLOR =  RED");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVENIS");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = AVENIS");
		System.out.println("COLOR = BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVENIS");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = AVENIS");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK AVENIS");
		            break;
		             }
	}
}
class Hero1 extends Scooty
{
	public void hero1()
	{
		System.out.println("WE HAVE DEFFERENT TYPES OF MODELS IN HERO");
		System.out.println("1.MAESTRO, 2.PLEASURE");
		System.out.println("ENTER 1 FOR MAESTRO");
		System.out.println("ENTER 2 FOR PLEASURE");

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED MAESTRO");		
		break;
		case 2: System.out.println("YOU SELECTED PLEASURE");		
		break;
		default:System.out.println("WRONG INPUT");
		System.out.println("REATURN TO MAIN MENU PRESS 1");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b)
		{
		case 1: Showroom2 df=new Showroom2();
		         df.vehicle();
		}
		break;}
}
}
class Meastro extends Hero1
{
	public void meastro()
	{
	System.out.println("SELECT color");
	System.out.println("1.WHITE 2.BLUE 3.BLACK");
	System.out.println("ENTER 1 FOR WHITE");
	System.out.println("ENTER 2 FOR BLUE");
	System.out.println("ENTER 3 FOR BLACK");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
	case 1: System.out.println("YOU SELECTED WHITE");
	white();
	break;
	case 2: System.out.println("YOU SELECTED BLUE");
	blue();
	break;
	case 3: System.out.println("YOU SELECTED BLACK");
	black();
	break;
	default:System.out.println("WRONG INPUT");
	System.out.println("REATURN TO MAIN MENU PRESS 1");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	switch(b)
	{
	case 1: Showroom2 df=new Showroom2();
	         df.vehicle();
	}
	break;
	}
}
	public void white()
	{
		System.out.println("COMPANY NAME = MEASTRO");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MEASTRO");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = MEASTRO");
		System.out.println("COLOR =  BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MEASTRO");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = MEASTRO");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MEASTRO");
		            break;
		             }
	}	
}
class Pleasure extends Hero1
{
	public void pleasure()
	{
	System.out.println("SELECT color");
	System.out.println("1.WHITE 2.BLUE 3.BLACK");
	System.out.println("ENTER 1 FOR WHITE");
	System.out.println("ENTER 2 FOR BLUE");
	System.out.println("ENTER 3 FOR BLACK");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
	case 1: System.out.println("YOU SELECTED WHITE");
	white();
	break;
	case 2: System.out.println("YOU SELECTED BLUE");
	blue();
	break;
	case 3: System.out.println("YOU SELECTED BLACK");
	black();
	break;
	default:System.out.println("WRONG INPUT");
	System.out.println("REATURN TO MAIN MENU PRESS 1");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	switch(b)
	{
	case 1: Showroom2 df=new Showroom2();
	         df.vehicle();
	}
	break;
	}
}
	public void white()
	{
		System.out.println("COMPANY NAME = PLEASURE");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK PLEASUE");
		            break;
		             }
	}
	public void blue()
	{
		System.out.println("COMPANY NAME = PLEASURE");
		System.out.println("COLOR =  BLUE");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=25Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK PLEASUE");
		            break;
		             }
	}
	public void black()
	{
		System.out.println("COMPANY NAME = PLEASURE");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 87,000");
		System.out.println("AVERAGE=60Kmpl");
		System.out.println("ENGINE TYPE = BS6");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK PLEASUE");
		            break;
		             }
	}	
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Fourwheeler extends Showroom2 {
	public void fourwheeler() {
		System.out.println("SELECT WHICH TYPE OF FOUR WHEELER YOU WANT");
		System.out.println("ENTER 1 FOR SUV");
		System.out.println("ENTER 2 FOR MUV");
		System.out.println("ENTER 3 FOR HATCHBACK");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("YOU SELECTED SUV");
			Fourwheeler t1 = new Suv();// upcasting
			Suv b1 = (Suv) t1;// downcasting opertor
			b1.suv();

		break;
		case 2:
			System.out.println("YOU SELECTED MUV");
			Fourwheeler t2 = new Muv();// upcasting
			Muv b2 = (Muv) t2;// downcasting opertor
			b2.muv();

		break;
		case 3:
			System.out.println("YOU SELECTED HATCHBACK");
			Fourwheeler t3 = new Hatchback();// upcasting
			Hatchback b3 = (Hatchback) t3;// downcasting opertor
			b3.hatchback();

		break;
		default:
			System.out.println("wrong input");
			System.out.println("RETURN TO MAIN MENU PRESS 1");
			Scanner s = new Scanner(System.in);
			int b = s.nextInt();
			switch (b) {
			case 1:
				Showroom2 df = new Showroom2();
				df.vehicle();
			}
			break;
		    }
}
}

class Suv extends Fourwheeler{
	public void suv() {
		System.out.println("SELECT WHICH COMPANY SUV YOU WANT");
		System.out.println("ENTER 1 FOR MAHINDRA");
		System.out.println("ENTER 2 FOR TOYOTA");
		System.out.println("ENTER 3 FOR HYUNDAI");
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED MAHINDRA");
		Suv b1 = new Mahindra();
		Mahindra h= (Mahindra) b1;
		h.mahindra();
		break;
		case 2: System.out.println("YOU SELECTED TOYOTA");
		Suv b2 = new Toyota();
		Toyota h1= (Toyota) b2;
		h1.toyota();
		break;
		case 3: System.out.println("YOU SELECTED HYUNDAI");
		Suv b3 = new Hyundai();
		Hyundai h3= (Hyundai) b3;
		h3.hyundai();
		break;
		default :System.out.println("wrong input");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1:
		   Showroom2 show = new Showroom2();
		   show.vehicle();
		}
		   break;
		}
		
        }
	}
class Mahindra extends Suv{
	public void mahindra() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN MAHINDRA");
		System.out.println("1.THAR,2.BOLERO,3.SCORPIO");
		System.out.println("ENTER 1 FOR THAR ");
		System.out.println("ENTER 2 FOR BOLERO");
		System.out.println("ENTER 3 FOR SCORPIO");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED THAR");
		Mahindra h1 = new Thar();
		Thar d1 =(Thar) h1;
		d1.thar();
		break;
		case 2:System.out.println("YOU SELECTED BOLERO");
		Mahindra h2 = new Bolero();
		Bolero d2 =(Bolero) h2;
		d2.bolero();
		break;
		case 3:System.out.println("YOU SELECTED SCORPIO");
		Mahindra h3 = new Scorpio();
		Scorpio d3 =(Scorpio) h3;
		d3.scorpio();
		break;
		
		}
		
	}
}

class Thar extends Mahindra{
	public void thar() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = THAR");
		System.out.println("ENGINE = 2184cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1353000 rs");
		System.out.println("AVERAGE = 15.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MAHINDRA THAR");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = THAR");
		System.out.println("ENGINE = 2184cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1353000 rs");
		System.out.println("AVERAGE = 15.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MAHINDRA THAR");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = THAR");
		System.out.println("ENGINE = 2184cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1353000 rs");
		System.out.println("AVERAGE = 15.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MAHINDRA THAR");
		            break;
		             }
      }
}
	
class Bolero extends Mahindra{
	public void bolero() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = BOLERO");
		System.out.println("ENGINE = 1498cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 952000 rs");
		System.out.println("AVERAGE = 17 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BOLERO");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = BOLERO");
		System.out.println("ENGINE = 1498cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 952000 rs");
		System.out.println("AVERAGE = 17 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BOLERO");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = BOLERO");
		System.out.println("ENGINE = 1498cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 952000 rs");
		System.out.println("AVERAGE = 17 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BOLERO");
		            break;
		             }
      }
	}
class Scorpio extends Mahindra{
	public void scorpio() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = SCORPIO");
		System.out.println("ENGINE = 2198cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1200000 rs");
		System.out.println("AVERAGE = 14 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SCORPIO");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = SCORPIO");
		System.out.println("ENGINE = 2198cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1200000 rs");
		System.out.println("AVERAGE = 14 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SCORPIO");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = SCORPIO");
		System.out.println("ENGINE = 2198cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1200000 rs");
		System.out.println("AVERAGE = 14 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SCORPIO");
		            break;
		             }
      }
	}
class Toyota extends Suv{
	public void toyota() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN TOYOTA");
		System.out.println("1.FORTUNER ,2.URBAN CRUISER,3.GLANZA");
		System.out.println("ENTER 1 FOR FORTUNER");
		System.out.println("ENTER 2 FOR URBAN CRUISER");
		System.out.println("ENTER 3 FOR GLANZA");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED FORTUNER");
		Toyota e1 = new Fortuner();
		Fortuner c1 =(Fortuner) e1;
		c1.fortuner();
		break;
		case 2:System.out.println("YOU SELECTED URBAN CRUISER");
		Toyota f2 = new Urbancruiser();
		Urbancruiser k2 =(Urbancruiser) f2;
		k2.urbancruiser();
		break;
		case 3:System.out.println("YOU SELECTED GLANZA");
		Toyota e3 = new Glanza();
		Glanza c3 =(Glanza) e3;
		c3.glanza();
		break;
		}}
}

class Fortuner extends Toyota{
	public void fortuner() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = FORTUNER");
		System.out.println("ENGINE = 2755cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 3200000 rs");
		System.out.println("AVERAGE = 14.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK FORTUNER");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = FORTUNER");
		System.out.println("ENGINE = 2755cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 3200000 rs");
		System.out.println("AVERAGE = 14.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK FORTUNER");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = FORTUNER");
		System.out.println("ENGINE = 2755cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 3200000 rs");
		System.out.println("AVERAGE = 14.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK FORTUNER");
		            break;
		             }
}
}

class Urbancruiser extends Toyota{
	public void urbancruiser() {
			System.out.println("SELECT COLOR");
			System.out.println("1.black ,2.grey,3.white");
			System.out.println("ENTER 1 FOR BLACK");
			System.out.println("ENTER 2 FOR GREY");
			System.out.println("ENTER 3 FOR WHITE");
			Scanner sc =new Scanner(System.in);
			int a= sc.nextInt();
			switch(a) {
			case 1:System.out.println("YOU SELECTED BLACK");
			black();
			break;
			case 2:System.out.println("YOU SELECTED GREY");
			grey();
			break;
			case 3:System.out.println("YOU SELECTED WHITE");
			white();
			break;
			default :System.out.println("WRONG INPUT");
			System.out.println("RETURN TO MAIN PRESS 1");
			Scanner s= new Scanner(System.in);
			int b=s.nextInt();
			switch(b) {
			case 1: Showroom2 show = new Showroom2();
			        show.vehicle();
	        }
			break;
			}
			
	}
		public void black(){
			System.out.println("MODEL NAME = URBAN CRUISER");
			System.out.println("ENGINE = 1462cc");
			System.out.println("COLOR = BLACK");
			System.out.println("PRICE = 1100000 rs");
			System.out.println("AVERAGE = 17.03 kmpl");
			System.out.println("TO BOOK THE VEHICLE PRESS 1");
			   Scanner s=new Scanner(System.in);
			   int c= s.nextInt();
			   switch(c) {
			   case 1:  Booking d1 =new Booking();
			            d1.booking();
			            Payment p= new Payment();
			       	    p.payment();
			          
			            System.out.println("CONGRATULATION YOU HAVE BOOK URBAN CRUISER");
			            break;
			             }
	}
		public void grey() {
			System.out.println("MODEL NAME = URBAN CRUISER");
			System.out.println("ENGINE = 1462cc");
			System.out.println("COLOR = GREY");
			System.out.println("PRICE = 1100000 rs");
			System.out.println("AVERAGE = 17.03 kmpl");
			System.out.println("TO BOOK THE VEHICLE PRESS 1");
			   Scanner s=new Scanner(System.in);
			   int c= s.nextInt();
			   switch(c) {
			   case 1:  Booking d1 =new Booking();
			            d1.booking();
			            Payment p= new Payment();
			       	    p.payment();
			          
			            System.out.println("CONGRATULATION YOU HAVE BOOK URBAN CRUISER");
			            break;
			             }
	}
		public void white() {
			System.out.println("MODEL NAME = URBAN CRUISER");
			System.out.println("ENGINE = 1462cc");
			System.out.println("COLOR = WHITE");
			System.out.println("PRICE = 1100000 rs");
			System.out.println("AVERAGE = 17.03 kmpl");
			System.out.println("TO BOOK THE VEHICLE PRESS 1");
			   Scanner s=new Scanner(System.in);
			   int c= s.nextInt();
			   switch(c) {
			   case 1:  Booking d1 =new Booking();
			            d1.booking();
			            Payment p= new Payment();
			       	    p.payment();
			          
			            System.out.println("CONGRATULATION YOU HAVE BOOK URBAN CRUISER");
			            break;
			             }
	}
		
}
class Glanza extends Toyota{
	public void glanza() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = GLANZA");
		System.out.println("ENGINE = 1197cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1000000 rs");
		System.out.println("AVERAGE = 22.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK GLANZA");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = GLANZA");
		System.out.println("ENGINE = 1197cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1000000 rs");
		System.out.println("AVERAGE = 22.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK GLANZA");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = GLANZA");
		System.out.println("ENGINE = 1197cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1000000 rs");
		System.out.println("AVERAGE = 22.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK GLANZA");
		            break;
		             }
}
}

class Hyundai extends Suv{
	public void hyundai(){
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN HYUNDAI");
		System.out.println("1.TUCSON,2,ALCAZAR,3.CRETA");
		System.out.println("ENTER 1 FOR TUCSON");
		System.out.println("ENTER 2 FOR ALCAZAR");
		System.out.println("ENTER 3 FOR CRETA");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED TUCSON");
		Hyundai v1 = new Tucson();
		Tucson o1 =(Tucson) v1;
		o1.tucson();
		break;
		case 2:System.out.println("YOU SELECTED ALCAZAR");
		Hyundai v2 = new Alcazar();
		Alcazar o2 =(Alcazar) v2;
		o2.alcazar();
		break;
		case 3:System.out.println("YOU SELECTED CRETA");
		Hyundai v3 = new Creta();
		Creta o3 =(Creta) v3;
		o3.creta();
		break;
		}
	}
}

class Tucson extends Hyundai{
	public void tucson() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = TUCSON");
		System.out.println("ENGINE = 1999cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 2770000 rs");
		System.out.println("AVERAGE = 13.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK TUCSON");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = TUCSON");
		System.out.println("ENGINE = 1999cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 2770000 rs");
		System.out.println("AVERAGE = 13.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK TUCSON");
		            break;
		             }
		
}
	public void white() {
		System.out.println("MODEL NAME = TUCSON");
		System.out.println("ENGINE = 1999cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 2770000 rs");
		System.out.println("AVERAGE = 13.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK TUCSON");
		            break;
		             }
		
		
	}
}

class Alcazar extends Hyundai{
	public void alcazar() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = ALCAZAR");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1589000 rs");
		System.out.println("AVERAGE = 20.4 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ALCAZAR");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = ALCAZAR");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1589000 rs");
		System.out.println("AVERAGE = 20.4 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ALCAZAR");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = ALCAZAR");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1589000 rs");
		System.out.println("AVERAGE = 20.4 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ALCAZAR");
		            break;
		             }
		
	}

}
class Creta extends Hyundai{
	public void creta() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = CRETA");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 100000 rs");
		System.out.println("AVERAGE = 18 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK CRETA");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = CRETA");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 100000 rs");
		System.out.println("AVERAGE = 18 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK CRETA");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = CRETA");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 100000 rs");
		System.out.println("AVERAGE = 18 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK CRETA");
		            break;
		             }
		
	}
}

class Muv extends Fourwheeler{
	public void muv() {
		System.out.println("SELECT WHICH COMPANY SUV YOU WANT");
		System.out.println("ENTER 1 FOR MARUTI");
		System.out.println("ENTER 2 FOR TOYOTA");
		System.out.println("ENTER 3 FOR MAHINDRA");
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED MARUTI");
		Muv b1 = new Maruti();
		Maruti h= (Maruti) b1;
		h.maruti();
		break;
		case 2: System.out.println("YOU SELECTED TOYOTA");
		Muv b2 = new Toyota1();
		Toyota1 h1= (Toyota1) b2;
		h1.toyota1();
		break;
		case 3: System.out.println("YOU SELECTED MAHINDRA");
		Muv b3 = new Mahindra1();
		Mahindra1 h3 = (Mahindra1)b3;
		h3.mahindra1();
		break;
		default :System.out.println("wrong input");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1:
		
		   Showroom2 show = new Showroom2();
		   show.vehicle();
		}
		   break;
		}
		
		}
}

class Maruti extends Muv{
	public void maruti() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN MARUTI");
		System.out.println("1.ERTIGA,2.EECO,3.XL6");
		System.out.println("ENTER 1 FOR ERTIGA");
		System.out.println("ENTER 2 FOR EECO");
		System.out.println("ENTER 3 FOR XL6");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED ERTIGA");
		Maruti u1 = new Ertiga();
		Ertiga j1 =(Ertiga)u1;
		j1.ertiga();
		break;
		case 2:System.out.println("YOU SELECTED EECO");
		Maruti u2 = new Eeco();
		Eeco j2 =(Eeco)u2;
		j2.eeco();
		break;
		case 3:System.out.println("YOU SELECTED XL6");
		Maruti u3 = new Xl6();
		Xl6 j3 =( Xl6)u3;
		j3.xl6();
		break;
		
		}
		
	}
}

class Ertiga extends Maruti{
	public void ertiga(){
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = ERITGA");
		System.out.println("ENGINE = 1462cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 835000 rs");
		System.out.println("AVERAGE = 20.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ERTIGA");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = ERITGA");
		System.out.println("ENGINE = 1462cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 835000 rs");
		System.out.println("AVERAGE = 20.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ERTIGA");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = ERITGA");
		System.out.println("ENGINE = 1462cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 835000 rs");
		System.out.println("AVERAGE = 20.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ERTIGA");
		            break;
		             }
		
	}
}

class Eeco extends Maruti{
	public void eeco() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = EECO");
		System.out.println("ENGINE = 1196cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 570000 rs");
		System.out.println("AVERAGE = 16.11 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK EECO");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = EECO");
		System.out.println("ENGINE = 1196cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 570000 rs");
		System.out.println("AVERAGE = 16.11 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK EECO");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = EECO");
		System.out.println("ENGINE = 1196cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 570000 rs");
		System.out.println("AVERAGE = 16.11 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK EECO");
		            break;
		             }
	}
		
}
class Xl6 extends Maruti{
	public void xl6() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = X16");
		System.out.println("ENGINE = 1462cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1129000 rs");
		System.out.println("AVERAGE = 20.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK X16");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = X16");
		System.out.println("ENGINE = 1462cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1129000 rs");
		System.out.println("AVERAGE = 20.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK X16");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = X16");
		System.out.println("ENGINE = 1462cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1129000 rs");
		System.out.println("AVERAGE = 20.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK X16");
		            break;
		             }
	}
		
}

class Toyota1 extends Muv{
	public void toyota1() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN TOYOTA");
		System.out.println("1.INNOVA CRYSTA ,2.VELLFIRE");
		System.out.println("ENTER 1 FOR INNOVA CRYSTA");
		System.out.println("ENTER 2 FOR VELLFIRE");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED INNOVA CRYSTA");
		Toyota1 g1 = new Innovacrysta();
		Innovacrysta v1=(Innovacrysta) g1;
		v1.innovacrysta();
		break;
		case 2:System.out.println("YOU SELECTED VELLFIRE");
		Toyota1 g2 = new Vellfire();
		Vellfire v2=(Vellfire) g2;
		v2.vellfire();
		break;
		
		}
		
	}
}

class Innovacrysta extends Toyota1{
	public void innovacrysta(){
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = INNOVA CRYSTA");
		System.out.println("ENGINE = 2694cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1786000 rs");
		System.out.println("AVERAGE = 15.6 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK INNOVA CRYSTA");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = INNOVA CRYSTA");
		System.out.println("ENGINE = 2694cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1786000 rs");
		System.out.println("AVERAGE = 15.6 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK INNOVA CRYSTA");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = INNOVA CRYSTA");
		System.out.println("ENGINE = 2694cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1786000 rs");
		System.out.println("AVERAGE = 15.6 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK INNOVA CRYSTA");
		            break;
		             }
	}
		
}
class Vellfire extends Toyota1{
	public void vellfire() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = VELLFIRE");
		System.out.println("ENGINE = 2494cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 9253000 rs");
		System.out.println("AVERAGE = 16.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK INNOVA VELLFIRE");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = VELLFIRE");
		System.out.println("ENGINE = 2494cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 9253000 rs");
		System.out.println("AVERAGE = 16.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK INNOVA VELLFIRE");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = VELLFIRE");
		System.out.println("ENGINE = 2494cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 9253000 rs");
		System.out.println("AVERAGE = 16.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK INNOVA VELLFIRE");
		            break;
		             }
	}
		
}
class Mahindra1 extends Muv{
	public void mahindra1() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN MAHINDRA");
		System.out.println("1.BOLERO,2.XUV300,3.MARAZZO");
		System.out.println("ENTER 1 FOR BOLERO");
		System.out.println("ENTER 2 FOR XUV300");
		System.out.println("ENTER 3 FOR MARAZZO");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BOLERO");
		Mahindra1 s1 = new Bolero1();
		Bolero1 b1 = (Bolero1)s1;
		b1.bolero();
		case 2:System.out.println("YOU SELECTED XUV300");
		Mahindra1 s2 = new Xuv();
		Xuv b2 =(Xuv)s2;
		b2.xuv();
		case 3:System.out.println("YOU SELECTED MARAZZO");
		Mahindra1 s3 = new Marazzo();
		Marazzo b3 =(Marazzo)s3;
		b3.marazzo();
		
		}
		
	}
}

class Bolero1 extends Mahindra1{
	public void bolero() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = BOLERO");
		System.out.println("ENGINE = 2494cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 9253000 rs");
		System.out.println("AVERAGE = 16.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BOLERO");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = BOLERO");
		System.out.println("ENGINE = 2494cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 9253000 rs");
		System.out.println("AVERAGE = 16.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BOLERO");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = BOLERO");
		System.out.println("ENGINE = 2494cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 9253000 rs");
		System.out.println("AVERAGE = 16.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK BOLERO");
		            break;
		             }
	}
		
	}
class Xuv extends Mahindra1{
	public void xuv() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = XUV300");
		System.out.println("ENGINE = 1197cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 841000 rs");
		System.out.println("AVERAGE = 17 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK XUV300");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = XUV300");
		System.out.println("ENGINE = 1197cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 841000 rs");
		System.out.println("AVERAGE = 17 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK XUV300");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = XUV300");
		System.out.println("ENGINE = 1197cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 841000 rs");
		System.out.println("AVERAGE = 17 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK XUV300");
		            break;
		             }
	}
	}

class Marazzo extends Mahindra1{
	public void marazzo() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = MARAZZO");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1340000 rs");
		System.out.println("AVERAGE = 17.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MARAZZO");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = MARAZZO");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1340000 rs");
		System.out.println("AVERAGE = 17.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MARAZZO");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = MARAZZO");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1340000 rs");
		System.out.println("AVERAGE = 17.3 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK MARAZZO");
		            break;
		             }
	}
	}

class Hatchback extends Fourwheeler{
	public void hatchback() {
		System.out.println("SELECT WHICH COMPANY HATCHBACK YOU WANT");
		System.out.println("ENTER 1 FOR TATA");
		System.out.println("ENTER 2 FOR HONDA");
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("YOU SELECTED TATA");
		Hatchback b1 = new Tata();
		Tata h1 = (Tata)b1;
		h1.tata();
		break;
		case 2: System.out.println("YOU SELECTED HONDA");
		Hatchback b2 = new Kia();
		Kia h2 = (Kia)b2;
		h2.kia();
		break;
		default :System.out.println("wrong input");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1:
		
		   Showroom2 show = new Showroom2();
		   show.vehicle();
		}
		   break;
		}
		}
}

class Tata extends Hatchback{
	public void tata() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN TATA");
		System.out.println("1.TIAGO,2.ALTROZ");
		System.out.println("ENTER 1 FOR TIAGO");
		System.out.println("ENTER 2 FOR ALTROZ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED TIAGO");
		Tata f1 =new Tiago();
		Tiago n1 =(Tiago)f1;
		n1.tiago();
		break;
		case 2:System.out.println("YOU SELECTED ALTROZ");
		Tata f2 =new Altroz();
		Altroz n2 =(Altroz)f2;
		n2.altroz();
		
		}
	}
}
class Tiago extends Tata{
	public void tiago() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = TIAGO");
		System.out.println("ENGINE = 1199cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 540000 rs");
		System.out.println("AVERAGE = 20 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK TIAGO");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = TIAGO");
		System.out.println("ENGINE = 1199cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 540000 rs");
		System.out.println("AVERAGE = 20 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK TIAGO");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = TIAGO");
		System.out.println("ENGINE = 1199cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 540000 rs");
		System.out.println("AVERAGE = 20 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK TIAGO");
		            break;
		             }
	}
	}
class Altroz extends Tata{
	public void altroz() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = ALTROZ");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 629000 rs");
		System.out.println("AVERAGE = 18 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ALTROZ");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = ALTROZ");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 629000 rs");
		System.out.println("AVERAGE = 18 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ALTROZ");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = ALTROZ");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 629000 rs");
		System.out.println("AVERAGE = 18 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK ALTROZ");
		            break;
		             }
	}
	}

class Kia extends Hatchback{
	public void kia() {
		System.out.println("WE HAVE DIFFERENT TYPES OF MODELS IN KIA");
		System.out.println("1.SELTOS,2.CARENS,3.SONET");
		System.out.println("ENTER 1 FOR SELTOS");
		System.out.println("ENTER 2 FOR CARENS");
		System.out.println("ENTER 3 FOR SONET");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED SELTOS");
		Kia f1 =new Seltos();
		Seltos n1 =(Seltos)f1;
		n1.seltos();
		break;
		case 2:System.out.println("YOU SELECTED CARENS");
		Kia f2 =new Carens();
		Carens n2 =(Carens)f2;
		n2.carens();
		break;
		case 3:System.out.println("YOU SELECTED SONET ");
		Kia f3 =new Sonet();
		Sonet n3 =(Sonet)f3;
		n3.sonet();
		break;
		default : System.out.println("wrong input");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner c= new Scanner(System.in);
		int b=c.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		   show.vehicle();
		}
		break;
		}
	}
}

class Seltos extends Kia{
	public void seltos() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = SELTOS ");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 1050000 rs");
		System.out.println("AVERAGE = 16 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SELTOS");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = SELTOS ");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 1050000 rs");
		System.out.println("AVERAGE = 16 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SELTOS");
		            break;
		             }

}
	public void white() {
		System.out.println("MODEL NAME = SELTOS ");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 1050000 rs");
		System.out.println("AVERAGE = 16 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SELTOS");
		            break;
		             }

	}
}

class Carens extends Kia{
	public void carens() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = CARENS");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 960000 rs");
		System.out.println("AVERAGE = 16 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK CARENS");
		            break;
		             }

}
	public void grey() {
		System.out.println("MODEL NAME = CARENS");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 960000 rs");
		System.out.println("AVERAGE = 16 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK CARENS");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = CARENS");
		System.out.println("ENGINE = 1497cc");
		System.out.println("COLOR = WHITE");
		System.out.println("PRICE = 960000 rs");
		System.out.println("AVERAGE = 16 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK CARENS");
		            break;
		             }
	}	
}

class Sonet extends Kia{
	public void sonet() {
		System.out.println("SELECT COLOR");
		System.out.println("1.black ,2.grey,3.white");
		System.out.println("ENTER 1 FOR BLACK");
		System.out.println("ENTER 2 FOR GREY");
		System.out.println("ENTER 3 FOR WHITE");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
		case 1:System.out.println("YOU SELECTED BLACK");
		black();
		break;
		case 2:System.out.println("YOU SELECTED GREY");
		grey();
		break;
		case 3:System.out.println("YOU SELECTED WHITE");
		white();
		break;
		default :System.out.println("WRONG INPUT");
		System.out.println("RETURN TO MAIN PRESS 1");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		switch(b) {
		case 1: Showroom2 show = new Showroom2();
		        show.vehicle();
        }
		break;
		}
		
}
	public void black(){
		System.out.println("MODEL NAME = SONET");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = BLACK");
		System.out.println("PRICE = 750000 rs");
		System.out.println("AVERAGE = 18.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SONET");
		            break;
		             }
}
	public void grey() {
		System.out.println("MODEL NAME = SONET");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = GREY");
		System.out.println("PRICE = 750000 rs");
		System.out.println("AVERAGE = 18.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
		          
		            System.out.println("CONGRATULATION YOU HAVE BOOK SONET");
		            break;
		             }
}
	public void white() {
		System.out.println("MODEL NAME = SONET");
		System.out.println("ENGINE = 1493cc");
		System.out.println("COLOR = WHITEK");
		System.out.println("PRICE = 750000 rs");
		System.out.println("AVERAGE = 18.2 kmpl");
		System.out.println("TO BOOK THE VEHICLE PRESS 1");
		   Scanner s=new Scanner(System.in);
		   int c= s.nextInt();
		   switch(c) {
		   case 1:  Booking d1 =new Booking();
		            d1.booking();
		            Payment p= new Payment();
		       	    p.payment();
                    System.out.println("CONGRATULATION YOU HAVE BOOK SONET");
		            break;
		             }
	}	
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Booking{
	private String name;
	private String location;
	private long phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void booking() {
		Booking bk =new Booking();
		System.out.println("ENTER YOUR NAME");
		Scanner s=new Scanner(System.in);
		String b=s.nextLine();
		bk.setName(b);
		System.out.println("ENTER YOUR LOCATION");
		Scanner s1=new Scanner(System.in);
		String c=s.nextLine();
		bk.setLocation(c);
		System.out.println("ENTER YOUR PHONE NO");
		Scanner s2=new Scanner(System.in);
		long d=s2.nextLong();
		bk.setPhone(d);
		System.out.println("name:"+bk.getName());
		System.out.println("LOCATION:"+bk.getLocation());
		System.out.println("PHONE NO"+bk.getPhone());
		
	}}
	////////////////////////////////////////////////////////////////////
 class Payment extends Booking{
	 public void payment() {
	
     System.out.println("SELECT YOUR PAYMENT OPTION");		 
     System.out.println("1.cash,2.credit card,3.debit card");
	 System.out.println("CASH PAYMENT");
	 System.out.println("CREDIT CARD PAYMENT");
	 System.out.println("DEBIT CARD PAYMENT");
	 Scanner s= new Scanner(System.in);
	 int a=s.nextInt();
	 switch(a) {
	 case 1:System.out.println("you selected cash payment");
	 break;
	 case 2:System.out.println("you selected Debit card payment");
	 debit();
	 break;
	 case 3:System.out.println("you selected Credit card payment");
	 credit();
	 break;
	 }
	 
	 class Debit extends Payment
	 {
		 private String Holdername;
		 private long Cardno;
		public String getHoldername() {
			return Holdername;
		}
		public void setHoldername(String holdername) {
			Holdername = holdername;
		}
		public long getCardno() {
			return Cardno;
		}
		public void setCardno(long cardno) {
			Cardno = cardno;
		}
	 }
	 }	   
	   public void debit() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("ENTER CARD HOLDER NAME");
		   String b=sc.nextLine();
		   System.out.println("ENTER CARD NUMBER");
		   long c=sc.nextLong();
		   }
 class Credit extends Payment{
		   private String Holdername;
			 private long Cardno;
			public String getHoldername() {
				return Holdername;
			}
			public void setHoldername(String holdername) {
				Holdername = holdername;
			}
			public long getCardno() {
				return Cardno;
			}
			public void setCardno(long cardno) {
				Cardno = cardno;
			}
	   }
	} 
	 
	 public void credit() {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("ENTER CARD HOLDER NAME");
		   String b=sc.nextLine();
		   System.out.println("ENTER CARD NUMBER");
		   long c=sc.nextLong();
	 }
     }











