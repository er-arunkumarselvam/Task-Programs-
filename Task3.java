class Task3
{
public static void main(String[] args)
{

Task3 wl =new Task3();
wl.calculateSecurity(1024);

}
//Scenaio#2
void calculateSecurity(int beats)
{
int security =0;
while(beats>1)
{
beats=beats/2;
security=security+1;
System.out.println("Total No. of Beats "+ beats +". The security is number is  " + security);
}
System.out.println("Last 1 beat take Tenali Raman.");
System.out.println("Total No. of Securities " + security);
}
}
