class Task2
{
public static void main(String[] args)
{

Task2 wl =new Task2();
wl.calculateAmount(0);

}
//Scenario#1
void calculateAmount(int amount)
{
int day=1;
while(day<=10)
{
amount =amount+day;
System.out.println("Day "+ day+" , Daughthe earn "+amount);
day=day+1;

}
System.out.println("Total Amount is " + amount);

}


}
