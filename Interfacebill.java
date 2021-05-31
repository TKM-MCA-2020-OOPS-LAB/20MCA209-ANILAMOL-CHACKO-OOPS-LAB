package myproject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface Grandtotal{
	void total();

}
class bill implements Grandtotal{
	int id1=101;
	int id2=102;
	int quality1=2;
	int quality2=1;
	int unit1=25;
	int unit2=100;
	int total1,total2;
	String name1="A";
	String name2="B";

	DateTimeFormatter dt= DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDateTime  now= LocalDateTime.now();
	public void total() {
		total1=quality1*unit1;
		total2=quality2*unit2;
		}

public void display()
{
	System.out.println("Order No.102\n");
	System.out.println(dt.format(now));
	System.out.println("\nProduct Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
	System.out.println("________________________________________________________________________________________________________________________________");
	System.out.println(id1+"\t\t\t"+name1+"\t\t\t"+quality1+"\t\t\t\t"+unit1+"\t\t\t\t"+total1);
	System.out.println(id2+"\t\t\t"+name2+"\t\t\t"+quality2+"\t\t\t\t"+unit2+"\t\t\t\t"+total2);
	System.out.println("_________________________________________________________________________________________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(total1+total2));

    }
}

public class Interfacebill {
	public static void main(String[] args) 
	{
		
		bill B=new bill();
		B.total();
		B.display();
	}
}
