LOUIS VUITTON SHOPPING STORE

import java.util.*;
class LouisVuitton
{
double cost=0; //initialising cost as zero
double t=100.0; //initialising t as 100 as limit
int a=100; //initialising a as 100
int y=0; //initialising y as 0
String name[]=new String[a]; //declaring to store the name of items
double price[]=new double[a]; //declaring to store the price of items

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double bill=0;
int i=0;
String s;
while(true)
{
System.out.println("Welcome to Louis Vuitton");
System.out.println("In order to be irreplacable one must always be different so welcome to Louis Vuitton");
System.out.println("---------------------------------------------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------------");
System.out.println("Hello I'm your assisstant Jarvis");
LouisVuitton obj=new LouisVuitton();
do
{
System.out.println("As convenience and variety is our motto....so we ensure that you are in the right place");
System.out.println("The choices are \n 1.Women wear \n 2.Men wear \n 3.Accessories \n 4.Shoes");
System.out.println("Enter your choice");
int k=sc.nextInt();
switch(k)
{
case 1:obj.Women();break;
case 2:obj.Men();break;
case 3:obj.Accessories();break;
case 4:obj.Shoes();break;
default:
System.out.println("Please enter appropriate choice");
}
System.out.println("Please type EXIT if you want to stop shopping");
System.out.println("Please type # if you want to continue");
s=sc.next();}
while(!(s.equalsIgnoreCase("EXIT")));
System.out.println("Your Bill");
System.out.println("Sr.no. \t Product name \t Price");
System.out.println((i+1)+"\t"+obj.name[i]+"\t $"+obj.price[i]);
bill=obj.cost+bill;
System.out.println("Totl cost to be paid=$"+bill);
System.out.println("We hope to see you again. Merci beaucoup");
System.out.println("May I address any new customer");
System.out.println("Please enter NO if there are no customers");
String st=sc.next();
if(st.equalsIgnoreCase("NO")) 
break;
}
}



public void Women()
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to WOMEN'S SECTION !!");
System.out.println("We have a wide set of options so please enter the number from the given options ");
System.out.println("Enter 1.Formals  \t 2.Western wear \t 3.Designer Wear");
int shop=sc.nextInt();

switch(shop)
{
case 1:System.out.println("This is formal section and we are on trends");
System.out.println("We give sizes ranging from extra small to extra large");
System.out.println("Enter the your choice");
System.out.println("Enter 1.Pencil skirt \t 2.Pants \t 3.Blazers \t 4.Formal Shirt \t 5.Stockings");
int num=sc.nextInt();
if(num==1)
{
name[y]="Pencil Skirt";
price[y]=70;
y++;
System.out.println("The cost for your choice is $70");
cost=cost+70;
}
else if(num==2)
{
name[y]="Pants";
price[y]=90;
System.out.println("The cost for your choice is $90");
cost=cost+90;
}
else if(num==3)
{
name[y]="Blazers";
price[y]=100;
System.out.println("The cost for your choice is $100");
cost=cost+100;
}
else if(num==4)
{
name[y]="Formal Shirt";
price[y]=40;
System.out.println("The cost for your choice is $40");
cost=cost+40;
}
else if(num==5)
{
name[y]="Stockings";
price[y]=10;
System.out.println("The cost for your choice is $10");
cost=cost+10;
}
else
System.out.println("Please check your input");
break;
case 2:
System.out.println("This is western section and we are on trends");
System.out.println("We give sizes ranging from extra small to extra large");
System.out.println("Enter the your choice");
System.out.println("Enter 1.One-piece dress \t 2.Evening Gowns \t 3.Tops \t 4.Shorts");
int num1=sc.nextInt();
if(num1==1)
{
name[y]="One-piece dress";
price[y]=45;
y++;
System.out.println("The cost for your choice is $45");
cost=cost+45;
}
else if(num1==2)
{
name[y]="Evening Gowns";
price[y]=90;
System.out.println("The cost for your choice is $90");
cost=cost+90;
}
else if(num1==3)
{
name[y]="Tops";
price[y]=30;
System.out.println("The cost for your choice is $30");
cost=cost+30;
}
else if(num1==4)
{
name[y]="Shorts";
price[y]=40;
System.out.println("The cost for your choice is $40");
cost=cost+40;
}
else
System.out.println("Please check your input");
break;
case 3:
System.out.println("This is designer section and we are on trends");
System.out.println("We give sizes ranging from extra small to extra large");
System.out.println("Enter the your choice");
System.out.println("Enter 1.Backless \t 2.Pencil fit \t 3.Frill frocks");
int num2=sc.nextInt();
if(num2==1)
{
name[y]="Backless";
price[y]=55;
y++;
System.out.println("The cost for your choice is $55");
cost=cost+55;
}
else if(num2==2)
{
name[y]="Pencil fit";
price[y]=90;
System.out.println("The cost for your choice is $90");
cost=cost+90;
}
else if(num2==3)
{
name[y]="Frill frocks";
price[y]=60;
System.out.println("The cost for your choice is $60");
cost=cost+60;
}
else
System.out.println("Please check your input");
break;
default: System.out.println("Please check your input");
}
}

public void Men ()
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to MEN'S SECTION !!");
System.out.println("We have a wide set of options so please enter the number from the given options ");
System.out.println("Enter 1.Formals  \t 2.Casual wear \t 3.Sports Wear");
int shop=sc.nextInt();

switch(shop)
{
case 1:
System.out.println("This is formal section and we are on trends");
System.out.println("We give sizes ranging from extra small to extra large");
System.out.println("Enter the your choice");
System.out.println("Enter  1.Pants \t 2.Blazers \t 3.Formal Shirt ");
int num=sc.nextInt();
if(num==1)
{
name[y]="Pants";
price[y]=75;
y++;
System.out.println("The cost for your choice is $75");
cost=cost+75;
}
else if(num==2)
{
name[y]="Blazers";
price[y]=95;
System.out.println("The cost for your choice is $95");
cost=cost+95;
}
else if(num==3)
{
name[y]="Formal shirt";
price[y]=55;
System.out.println("The cost for your choice is $55");
cost=cost+55;
}
else
System.out.println("Please check your input");
break;

case 2:
System.out.println("This is casual section and we are on trends");
System.out.println("We give sizes ranging from extra small to extra large");
System.out.println("Enter the your choice");
System.out.println("Enter 1.T-shirts \t 2.Jeans \t 3.Joggers \t 4.Shorts");
int num1=sc.nextInt();
if(num1==1)
{
name[y]="T-shirts";
price[y]=45;
y++;
System.out.println("The cost for your choice is $45");
cost=cost+45;
}
else if(num1==2)
{
name[y]="Jeans";
price[y]=50;
System.out.println("The cost for your choice is $50");
cost=cost+90;
}
else if(num1==3)
{
name[y]="Joggers";
price[y]=45;
System.out.println("The cost for your choice is $45");
cost=cost+45;
}
else if(num1==4)
{
name[y]="Shorts";
price[y]=40;
System.out.println("The cost for your choice is $40");
cost=cost+40;
}
else
System.out.println("Please check your input");
break;

case 3:
System.out.println("This is Sports section and we are on trends");
System.out.println("We give sizes ranging from extra small to extra large");
System.out.println("Enter the your choice");
System.out.println("Enter 1.Sweatshirts \t 2.Shorts \t 3.Jersey");
int num3=sc.nextInt();
if(num3==1)
{
name[y]="Sweatshirts";
price[y]=50;
y++;
System.out.println("The cost for your choice is $50");
cost=cost+50;
}

else if(num3==2)
{
name[y]="Shorts";
price[y]=20;
System.out.println("The cost for your choice is $20");
cost=cost+20;
}
else if(num3==3)
{
name[y]="Jersey";
price[y]=55;
System.out.println("The cost for your choice is $55");
cost=cost+55;
}
else
System.out.println("Please check your input");
break;
default: System.out.println("Please check your input");
}
}

public void Accessories ()
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to ACCESSORIES SECTION !!");
System.out.println("We have a wide set of options so please enter the number from the given options ");
System.out.println("Enter 1.Necklaces  \t 2.Earings and anklets \t 3.Watches");
int shop=sc.nextInt();

switch(shop)
{
case 1:
System.out.println("This is necklace section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter  1.Choker \t 2.Short necklaces \t 3.Long necklaces ");
int num=sc.nextInt();
if(num==1)
{
name[y]="Choker";
price[y]=10;
y++;
System.out.println("The cost for your choice is $10");
cost=cost+10;
}
else if(num==2)
{
name[y]="Short necklaces";
price[y]=20;
System.out.println("The cost for your choice is $20");
cost=cost+20;
}
else if(num==3)
{
name[y]="Long necklaces";
price[y]=25;
System.out.println("The cost for your choice is $25");
cost=cost+25;
}
else
System.out.println("Please check your input");
break;

case 2:
System.out.println("This is Earings and anklets section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter 1.Studs \t 2.Hanging earings \t 3.Designer bracelets");
int num1=sc.nextInt();
if(num1==1)
{
name[y]="Studs";
price[y]=10;
y++;
System.out.println("The cost for your choice is $10");
cost=cost+10;
}
else if(num1==2)
{
name[y]="Hanging earings";
price[y]=12;
System.out.println("The cost for your choice is $12");
cost=cost+12;
}
else if(num1==3)
{
name[y]="Designer bracelets";
price[y]=20;
System.out.println("The cost for your choice is $20");
cost=cost+20;
}
else
{
System.out.println("Please check your input");
}
break;

case 3: 
System.out.println("This is Watches section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter 1.Female \t 2.Male");
int num4=sc.nextInt();
if(num4==1)
{
name[y]="Female";
price[y]=50;
y++;
System.out.println("The cost for your choice is $50");
cost=cost+50;
}
else if(num4==2)
{
name[y]="Male";
price[y]=55;
System.out.println("The cost for your choice is $55");
cost=cost+55;
}
else
{
System.out.println("Please check your input");}
break;
default: System.out.println("Please check your input");
}
}

public void Shoes()
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to SHOES SECTION !!");
System.out.println("We have a wide set of options so please enter the number from the given options ");
System.out.println("Enter \t 1.Boots \t 2.Leather shoes \t 3.Pumps \t 4.Sandals");
int shop=sc.nextInt();

switch(shop)
{
case 1:
System.out.println("This is Boots section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter  1.High heeled \t 2.Flat");
int num=sc.nextInt();
if(num==1)
{
name[y]="High heeled";
price[y]=50;
y++;
System.out.println("The cost for your choice is $50");
cost=cost+50;
}

else if(num==2)
{
name[y]="Flat";
price[y]=30;
System.out.println("The cost for your choice is $30");
cost=cost+30;
}

else
System.out.println("Please check your input");
break;

case 2:
System.out.println("This is Leather shoe section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter  1.Formal \t 2.Casual");
int numb=sc.nextInt();
if(numb==1)
{
name[y]=".Formal";
price[y]=50;
y++;
System.out.println("The cost for your choice is $50");
cost=cost+50;
}
else if(numb==2)
{
name[y]="Casual";
price[y]=60;
System.out.println("The cost for your choice is $60");
cost=cost+60;
}
else
System.out.println("Please check your input");
break;

case 3:
System.out.println("This is Pumps section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter  1.High heels \t 2.Mid-heels");
int num5=sc.nextInt();
if(num5==1)
{
name[y]="high heels";
price[y]=50;
y++;
System.out.println("The cost for your choice is $50");
cost=cost+50;
}
else if(num5==2)
{
name[y]="Mid-heels";
price[y]=60;
System.out.println("The cost for your choice is $60");
cost=cost+60;
}
else
System.out.println("Please check your input");
break;

case 4:
System.out.println("This is Sandals section and we are on trends");
System.out.println("Enter the your choice");
System.out.println("Enter  1.Heeled \t 2.Flat");
int num6=sc.nextInt();
if(num6==1)
{
name[y]="Heeled";
price[y]=50;
y++;
System.out.println("The cost for your choice is $50");
cost=cost+50;
}
else if(num6==2)
{
name[y]="Flat";
price[y]=60;
System.out.println("The cost for your choice is $60");
cost=cost+30;
}
else
System.out.println("Please check your input");
break;
default: System.out.println("Please check your input");
}
}
}

