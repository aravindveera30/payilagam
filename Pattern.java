class Pattern
{
public static void main(String[] arg)
{
for(int i=1;i<=5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
System.out.print("*");
for(int k=2;k<=i;k++)
{
System.out.print("  ");
}
System.out.print("*");
System.out.println();
}}}