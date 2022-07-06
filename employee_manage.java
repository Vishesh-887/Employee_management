/*Vishesh Kumar Mishra
Roll No.-29
Section- K18SB
Reg No-11804399
for login as Head Authority 
Id -head@123
pass-root@123
For login as old employee ID Passward is stored in string in main method ie
{{"Vishesh","18001","root1"},
{"Aman","18002","root2"}};
first row is name ,Second row is ID ,third row is passward*/
import java.util.*;
import java.io.FileWriter;
import java.lang.Math;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.File;
import java.time.*;
interface seeleav{
	void appliedLeave();
}
abstract class assign1{//ABSTRACT CLASS
 	//abstract method
 	public abstract void assigntask();
 	
 }
 class assign extends assign1{
 	public void assigntask(){//defining the body of abstract method
 		try{
			 	Scanner ol3=new Scanner(System.in);
				String at="";
				System.out.println("\t\t \t\t\t\t  ENTER THE TASK TO BE ASSINGNED \n");
				
				System.out.print("\t\t\t\tEnter the name of Employee: ");
				String name=ol3.nextLine();
				at=at+"EMPLOYEE NAME "+name+"\n";
				System.out.print("\t\t\t\tEnter ID Number : ");
				String id=ol3.nextLine();
				at=at+"ID NUMBER IS: "+id+"\n";
				
				System.out.print("\t\t\t\tEnter the task:");
				
				String task=ol3.nextLine();
				at=at+"TSK ASSINGNED: "+task+"\n ";
				FileWriter fw=new FileWriter("TaskAssined.txt",true);
				for(int i=0;i<at.length();i++) {
				fw.write(at.charAt(i));
					}
					fw.close();
				System.out.println("\t\t\t\tTSK ASSINGNED SUCCESFULLY!!");
			 }
			 catch(IOException e){
			 	System.out.println("An unexpected error occured !!Try after some time");
			 }
 	}
 }
class Newemp
{
	//static void compinfo();
	static int id[]=new int[100];
	static String name[]=new String[100];
	static String pass[]=new String[100];

	static void registration() throws IOException{
		int n=0;
		String check="Y";
		Scanner sc=new Scanner(System.in);
		int g=0;

		while(check=="Y") 
	 		{
				String s="";
				System.out.print("\t\t\t\tENTER YOUR FULL NAME :");
				String h=sc.next();
				s=(g+1)+".\n";
				s=s+"NAME : "+h+"\n";
				System.out.print("\t\t\t\tENTER YOUR FATHERS NAME :");
				sc.nextLine();
				String father=sc.next();
				s=s+"FATHERS NAME : "+father+"\n";
				System.out.print("\t\t\t\tDATE OF BIRTH IN DD-MM-YYYY FORMAT :");
				sc.nextLine();
				String dob=sc.next();
				s=s+"DATE OF BIRTH : "+dob+"\n";
				System.out.print("\t\t\t\tCURRENT ADDRESS :");
				sc.nextLine();
				String address=sc.nextLine();
				s=s+"CURRENT ADDRESS :"+address+"\n";
				System.out.print("\t\t\t\tEMAIL :");
				String email=sc.nextLine();
				s=s+"EMAIL : "+email+"\n";
				name[n]=h;
				double j=Math.random()*100;
				int eid=18000+(int)j;
				System.out.println("\t\t\t\tYOUR ASSINGED UNIQUE ID IS "+ ""+eid);
				id[n]=eid;
				System.out.print("\t\t\t\tchoose a password : ");
				String f=sc.nextLine();
				pass[n]=f;
				FileWriter fw=new FileWriter("Records.txt",true);
				for(int i=0;i<s.length();i++) 
					{
						fw.write(s.charAt(i));
				    }
				       
				fw.close();
				System.out.println("\t\t\t\tYour record has been Submitted it may take 24 hours to get processed!!");
					  System.out.println("   ");
					  System.out.print("\t\t\t\tWant to see your ID and Passward:y/n : ");
				      String ce=sc.next();
				      if (ce.equalsIgnoreCase("y")==true) 
				      	
				      	{
				      		System.out.println("              ");
				      		System.out.println("\t\t\t\t-------------------------------------------------------------");
					      	System.out.println("\t\t\t\tYour name : "+name[n]);
					      	System.out.println("\t\t\t\tYour employee ID : "+id[n]);
					      	System.out.println("\t\t\t\tYour Passward : "+pass[n]+"\n\t\t\t\tDont Share it with anyone!!");
					     	System.out.println("\t\t\t\t-------------------------------------------------------------");

				      	}
				      
				      System.out.println("\t\t\t\tSelect one of the following :\n\t\t\t\t1.Add more employee\n\t\t\t\t2.Back to main menue");
				      int op=sc.nextInt();
				      if (op==1) 
					    {
					      	n=n+1;
					    }
				      else if (op==2)
				       {
				      		check="N";

				       }
				       g=g+1;
		    }
    }
}
class old{
	 void verify(String a[][],String n,int x,String pa){
					
		for (int i=0;i<a.length ;i++ ) {
			for (int j=0;j<a[0].length ;j++ ) {
				if (n.equalsIgnoreCase(a[i][0]) && x==Integer.parseInt(a[i][1]) && pa.equalsIgnoreCase(a[i][2])) {

					System.out.println("\t\t\t\tName is :"+a[i][0]+"  ID is :"+a[i][1]);
					old2 olo=new old2();
					olo.options();
					System.out.println("\t\t \t\t\t\tThank You for Visiting in EMS");
					System.exit(0);
					
					break;
				}
				else
				{   System.out.println("      ");
					System.out.println("\t\t\t\tEnter the write credential !!");
					System.out.println("      ");
					break;
				
				}
				
			}
		}
		
	}
	class old2{
		 public  void options(){
		 	System.out.println("      ");
			System.out.println("\t\t\t\tSuccesfully Logged In:");
			System.out.println("\t\t\t\tSelect one of the following option: \n\t\t\t\t1.See Assingned task \n\t\t\t\t2.Apply for Leave \n\t\t\t\t3.Exit");
			Scanner ol1=new Scanner(System.in);
			int op=ol1.nextInt();
			if (op==1) 
			{
			   File r=new File("TaskAssined.txt");
			 		try{
			 			Scanner o=new Scanner(r);
			 			while(o.hasNextLine()){
			 			String data=o.nextLine();
			 			System.out.println("\t\t\t\t"+data);
			 		}
			 			o.close();
			 		}
					catch(IOException e){
						System.out.println("Cant read");
					}

			}
			else if (op==2)
			 {	
			 	try{
			 	Scanner ol2=new Scanner(System.in);
				String at="";
				System.out.println("\t\t \t\t\t\tWELCOME TO EMS LEAVE MANAGER \n");
				int n=(int)(Math.random()*1000);
				System.out.print("\t\t\t\tEnter your name :");
				String name=ol2.nextLine();
				int li=10000+n;
				System.out.println("\t\t\t\tYOUR UNIQUE LEAVE ID IS : "+li);
				at=at+"UNIQUE ID "+li+"\n";
				at=at+"EMPLOYEE NAME "+name+"\n";
				
				System.out.print("\t\t\t\tEnter From which date to which date : ");
				
				String date=ol2.nextLine();
				at=at+"LEAVE REQUEST DATE "+date+"\n";
				FileWriter fw=new FileWriter("LeaveRecord.txt",true);
				for(int i=0;i<at.length();i++) {
				fw.write(at.charAt(i));
					}
					fw.close();
				System.out.println("\t\t\t\tLeave Applied Succesfully,it may take 24 hours to get processed!!");
			 }
			 catch(IOException e){
			 	System.out.println("An unexpected error occured !!Try after some time");
			 }
			}
			else
			{
				
			}
		}
	}
}

class employee_manage{
	
	public static void main(String[] args) {
		LocalDate d=LocalDate.now();//for showing date
		LocalTime t=LocalTime.now();//for showing time
		String a[][]={{"Vishesh","18001","root1"},
					{"Aman","18002","root2"}};
		Scanner ob=new Scanner(System.in);
		old ob1=new old();
		Newemp no=new Newemp();
		String con="Y";
		label:
		while (con=="Y"){
		System.out.println(" ");
		System.out.println(" \t\t\t\t\t\t\t   WELCOME TO ");
		System.out.println("                                                   ");
		System.out.println("\t\t \t\t\t\t  Employee Management System ");
		System.out.println("\t\t\t\t-------------------------------------------------------------");
		System.out.println("\t\t\t\tTodays Date: "+d+"\t\t\t   Time :"+t);
		System.out.println("\t\t\t\t-------------------------------------------------------------");
   		System.out.println("\t\t\t\t\t\tSelect one of the following option");
		System.out.println("\t\t\t\t.............................................................");
		System.out.println("\t\t\t\t1.New Employee");
		System.out.println("\t\t\t\t2.Old Employee");
		System.out.println("\t\t\t\t3.Head Office");
		System.out.println("\t\t\t\t4.Exit");
		int op=ob.nextInt();
		if (op==1)
		 {
		 	System.out.println("\t\t\t\t-------------------------------------------------------------");
			System.out.println("\t\t\t\tWhat u want to do :");
			System.out.println("\t\t\t\t.............................................................");
			System.out.println("\n\t\t\t\t1.Register\n\t\t\t\t2.About Terms and Conditions");
			int op1=ob.nextInt();
			if (op1==1) 
			{
				try{no.registration();continue label;}
				catch(IOException e){System.out.println("Unexpected error occured!!");}
			}
			else if (op1==2) 
			{
				File r=new File("Terms.txt");
			 		try{
			 			Scanner o=new Scanner(r);
			 			System.out.println("\t\t \t\t\t\t  HERE ARE SOME TERMS AND CONDITIONS");
			 			while(o.hasNextLine()){
			 			String data=o.nextLine();
			 			
			 			System.out.println("\t\t\t\t"+data);
			 		}
			 			o.close();
			 		}
					catch(IOException e){
						System.out.println("Cant read");
					}

			}
			else
			{
				continue label;
			}
		 }
		else if (op==2) {
		 int chk=0;
		
		while (chk<=3){
		Scanner ob2=new Scanner(System.in);
		System.out.println("\t\t\t\tWelcome Enter you credentials to get Logged In");
		System.out.print("\t\t\t\tEnter your First Name: ");

		String n=ob2.nextLine();
		System.out.print("\t\t\t\tEnter your Emp.ID : ");
		int x=ob2.nextInt();
		System.out.print("\t\t\t\tEnter Your Passward : ");
		ob2.nextLine();
		String pa=ob2.nextLine();
		chk=chk+1;
		ob1.verify(a,n,x,pa);
	     }
	     System.out.println("   ");
	     System.out.println("\t\t\t\tYou have exceddec the login chances!!");
		}
		else if (op==3) {
			int hdck=0;
			while(hdck<=2){
			System.out.println("\t\t \t\t\t\tWelcome as Head Authority");
			System.out.println("\t\t\t\tEnter following credentials to get verified");
			System.out.print("\t\t\t\tEnter your Unique ID : ");
			String hid=ob.next();
			System.out.print("\t\t\t\tEnter your Passward : ");
			String hp=ob.next();
			String hda="Y";
			
			if (hid.equals("head@123")&&hp.equals("root@123")) {
			while(hda.equalsIgnoreCase("Y")){
				System.out.println("\t\t \t\t\t\tSuccessfully Logged in !!");
				System.out.println("\t\t\t\tSelect one of the following options:");
				System.out.println("\t\t\t\t1.Assign task\n\t\t\t\t2.See Applied Leave\n\t\t\t\t3.Back to main menue");
				int hdo=ob.nextInt();
				if (hdo==1) 
				{
					assign as=new assign();
					as.assigntask();
					System.out.println("   ");
					System.out.print("\t\t\t\tWant to continue Y/N : ");
					hda=ob.next();
				}
				else if (hdo==2) 
				{
					seeleav a1=()->{//lambda class
					File r=new File("LeaveRecord.txt");
			 		try{
			 			Scanner o=new Scanner(r);
			 			while(o.hasNextLine()){
			 			String data=o.nextLine();
			 			System.out.println("   ");
			 			System.out.println("\t\t\t\t"+data);
			 		}
			 			o.close();
			 		}
					catch(IOException e){
						System.out.println("Cant read");
					}
					};
					a1.appliedLeave();
					
					System.out.println("   ");
					System.out.print("\t\t\t\tWant to continue Y/N : ");
					hda=ob.next();
				}
				else if (hdo==3) 
				{
					continue label;
				}
				
				}
				break label;
		    }
			else
			{
				hdck=hdck+1;
				if (hdck>=3) {
			 
				System.out.println("Sorry you have excedded maximum login limit!!");
				break;
			
			 }
				System.out.println("Wrong user name or passward !!Try again!!");
				
			}
			 
		 }
		 
			
		}
		else if (op==4) {
		System.out.println("\t\t\t\t\t\t\tTHANK YOU FOR USING EMS");	
		}
		else
		{
			System.out.println("\t\t\t\t\t  !!Please select the options between 1-4 !!:");
			System.out.println(" ");
			continue label; 
		}
		con="N";
	}
	}
}
