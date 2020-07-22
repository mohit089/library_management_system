import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Data
{
    String student[][]=new String[5][2];
    int scount[][]=new int[5][1];
    String name,sid;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Data()
    {
        student[0][0]="Deepak";
        student[0][1]="120";
        scount[0][0]=2;
        student[1][0]="Abhishek";
        student[1][1]="116";
        scount[1][0]=2;
        student[2][0]="Mohit";
        student[2][1]="118";
        scount[2][0]=2;
        student[3][0]="Megh";
        student[3][1]="104";
        scount[3][0]=2;
        student[4][0]="Milind";
        student[4][1]="117";
        scount[4][0]=2;
    }
    void read()throws IOException
    {
        System.out.println("Enter the name");
        name=br.readLine();
          System.out.println("Enter the id");
        sid=br.readLine();
    }
}
class Book
{
    String b[][]=new String[18][4];
    int count[][]=new int[18][1]; 
    Book()
    {
    b[0][0]="JAVA";
    b[0][1]="Java The Complete Reference";
    b[0][2]="Herbert Schieldt";
    b[0][3]="174001";
    count[0][0]=5;
    b[1][0]="JAVA";
    b[1][1]="Java Programming";
    b[1][2]="Balgurusami";
    b[1][3]="174002";
    count[1][0]=5;
     b[2][0]="JAVA";
    b[2][1]="Head First Java";
    b[2][2]="Ivor";
    b[2][3]="174003";
    count[2][0]=5;        
     b[3][0]="DATA STRUCTURES";
    b[3][1]="Data Structures in C";
    b[3][2]="Reema Thereja";
    b[3][3]="174004";
    count[3][0]=5;       
     b[4][0]="DATA STRUCTURES";
    b[4][1]="Data Structures A Psuedocode Approach using C";
    b[4][2]="A.Forouzan";
    b[4][3]="174005";
    count[4][0]=5;
     b[5][0]="DATA STRUCTURES";
    b[5][1]="Data Structures using C";
    b[5][2]="Balgurusamy";
    b[5][3]="174006";
    count[5][0]=5;
     b[6][0]="ELECTRONIC CIRCUITS AND COMMUNICATION FUNDAMENTALS";
    b[6][1]="Techmax Eccf";
    b[6][2]="J S Khatre";
    b[6][3]="174007";
    count[6][0]=5;
     b[7][0]="ELECTRONIC CIRCUITS AND COMMUNICATION FUNDAMENTALS";
    b[7][1]="Electronic circuits and Devices";
    b[7][2]="Robert Boylestad";
    b[7][3]="174008";
    count[7][0]=5;
     b[8][0]="ELECTRONIC CIRCUITS AND COMMUNICATION FUNDAMENTALS";
    b[8][1]="Linear Integrated Circuits";
    b[8][2]="K R Botkar";
    b[8][3]="174009";
    count[8][0]=5; 
        b[9][0]="Digital Logic Design and Analysis";
    b[9][1]="Mordern Digital Electronics";
    b[9][2]="R P Jain";
    b[9][3]="174010";
    count[9][0]=5; 
    b[10][0]="Digital Logic Design and Analysis";
    b[10][1]="Techmax of Dlda";
    b[10][2]="J S Khatre";
    b[10][3]="174011";
    count[10][0]=5; 
    b[11][0]="Digital Logic Design and Analysis";
    b[11][1]="Digital Logic Priciples";
    b[11][2]="Norman Balabanian";
    b[11][3]="174012";
    count[11][0]=5; 
    b[12][0]="Applied Maths";
    b[12][1]="Applied Mathematics for computer branch";
    b[12][2]="G V Kumbojkar";
    b[12][3]="174013";
    count[12][0]=5;
    b[13][0]="Applied Maths";
    b[13][1]="Higher Engineering Mathematics";
    b[13][2]="B S Grewal";
    b[13][3]="174014";
    count[13][0]=5;
    b[14][0]="Applied Maths";
    b[14][1]="Advanced Engineering Mathematics";
    b[14][2]="Kreyszig";
    b[14][3]="174015";
    count[14][0]=5;
    b[15][0]="Discrete Maths";
    b[15][1]="Textbook of Discrete Mathematics";
    b[15][2]="G V Kumbojkar";
    b[15][3]="174016";
    count[15][0]=5;
    b[16][0]="Discrete Maths";
    b[16][1]="Techmax of Discrete Maths";
    b[16][2]="Bhakti Rawool";
    b[16][3]="174017";
    count[16][0]=5;
    b[17][0]="Discrete Maths";
    b[17][1]="Discrete Mathematical Structures";
    b[17][2]="Y N Singh";
    b[17][3]="174018";
    count[17][0]=5;
    }
}
class BookOp extends Book
{
    int i,j,in,k;
    boolean found=false,flag=false;
    String id,sub,author;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Data d=new Data();
    Main m=new Main();
    void issue(int in)throws IOException
    {
        System.out.println("Enter the Subject of the book");
        sub=br.readLine();
        System.out.println("Books available are:");
        for(i=0;i<18;i++)
        {
            j=i;
            if((b[i][0].compareToIgnoreCase(sub)==0))
            {
                 System.out.println("Title:"+b[i][1]);
                    System.out.println("Author:"+b[i][2]);
                    System.out.println("Book Id:"+b[i][3]);
                    System.out.print("\n\n");
                    found=true;
            }
        }
        if(found==true)
        {
           
            System.out.println("Enter the name of author");
            author=br.readLine();
            for(i=0;i<j;i++)
            {
                if(author.compareToIgnoreCase(b[i][2])==0)
                {
                    flag=true;
                    if(count[i][0]!=0&&d.scount[in][0]!=0)
                    {
                        System.out.println("Book issued successfully");
                        count[i][0]--;
                        d.scount[in][0]--;
                        System.out.println("You can issue more="+d.scount[in][0]+"books");
                    }
                    else if(d.scount[in][0]==0)
                    {
                        System.out.println("You have aleady issued your quota of two books");
                    }
                    else
                    {
                        System.out.println("Sorry the book is not available");
                    }
                }
            }
            if(flag==false)
            {
                System.out.println("No such Author found");
            }
        }
            if(found==false)
            {
                System.out.println("Book not found");
            }
    }
    void search()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String bname;
       int shelf=0;
       int bcount=0;
       System.out.println("Enter the subject");
       bname=br.readLine();
       boolean found=false;
       System.out.println("Books available on this subject are:");
       for(i=0;i<18;i++)
       {
           if(bname.compareToIgnoreCase(b[i][0])==0)
           {
                 shelf=i+1;
               found=true;
               System.out.println("Title:"+b[i][1]);
                    System.out.println("Author:"+b[i][2]);
                    System.out.println("Book Id:"+b[i][3]);
                     System.out.println("Book available and present at shelf no:"+shelf);
           System.out.println("Number of books available:"+count[i][0]);
                    System.out.print("\n");
           }
       }
       if(found==false)
       {
           System.out.println("Book Not found");
       }
    }
    void breturn(int in)throws IOException
    {
        long days=0;
        long pen;
        int i;
        String rid;
        boolean found=false;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       if(d.scount[in][0]==2)
           System.out.println("You haven't issued any book");
       else
       {
       System.out.println("Enter the issue date in dd-MM-yyyy/HH:mm:ss");
       String s1=br.readLine();
       System.out.println("Enter the return date in dd-MM-yyyy/HH:mm:ss");
       String s2=br.readLine();
       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
       System.out.println("Enter id of book to be returned");
	rid=br.readLine();
        for(i=0;i<9;i++)
        {
            if(rid.compareToIgnoreCase(b[i][3])==0)
            {
                found=true;
                break;
            }
        }
        if(found==false)
        {
            System.out.println("Book Not Found");
        }
        else
            System.out.println("Book found");
        d.scount[in][0]++;
            System.out.println("Book found");
            System.out.println("Now you can issue "+d.scount[in][0]+"Books");
		try 
		{
			Date startDate = formatter.parse(s1);
			
			Date endDate = formatter.parse(s2);
			
			long diffInMilliSec = endDate.getTime() - startDate.getTime();
			
			long seconds = (diffInMilliSec / 1000) % 60;
			
			long minutes = (diffInMilliSec / (1000 * 60)) % 60;
			
			long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;
			
			days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;
			
			long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
                        System.out.println("Number of days the book is used="+days);
                          if(days>15)
                {
                    pen=(days-15)*2;
                    System.out.println("Since you are returning your bookafter due date\nHence penalty="+pen);
                    System.out.println("Book returned successfully\nThank you");
                }
                else
                    System.out.println("Book returned\nThank you"); 
                        }
		catch (ParseException e)
		{
			System.out.println("Invalid date format");
		}
    }
}
}
class Main
{
         static Data d=new Data();
        static BookOp b=new BookOp();
         static Main m=new Main();
        static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        m.menu();
    }
        void menu()
        {
            int ch,op,i,in;
             System.out.println("===========Welcome to Library==========");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
        System.out.println("Enter your details");
        d.read();
        for(i=0;i<=4;i++)
            if((d.name.compareToIgnoreCase(d.student[i][0])==0)&&(d.sid.compareTo(d.student[i][1])==0))
                
            {
            in=i;
         do
        {
         System.out.println("************MENU************\n1.ISSUE A BOOK\n2.RETURN A BOOK\n3.SEARCH A BOOK\n4.EXIT\nEnter option");
         op=Integer.parseInt(br.readLine());
         switch(op)
         {
             case 1:b.issue(in);
             break;
             case 2:b.breturn(in);
             break;
             case 3:b.search();
             break;
             case 4:System.out.println("Thank You!!!!!");
                    m.menu();
                 break;
             default:System.out.println("Invalid option");
         }
    }while(op!=4);
    }
          for(i=0;i<=4;i++)
        if((d.name.compareToIgnoreCase(d.student[i][0])!=0)&&(d.sid.compareTo(d.student[i][1])!=0))
        {
          throw new UserException();  
        }
    }
        catch(Exception e)
        {
        }
}
}
class UserException extends Exception
{
    UserException()
     {
    System.out.println("Invalid Credentials");
    System.out.println("Redirecting to Home......");
    Main m=new Main();
    m.menu();
     }
}