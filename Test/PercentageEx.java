public class PercentageEx
{
public static void main(String[] args)
{
System.out.println("Percentages: ");
arrayOfPercentage();
}
public static void arrayOfPercentage()
{
System.out.println("invoking arrayOfPercentage");
double sslcPerc=73.12;
double pucPerc=60;
double degPerc=6;
double[] percentages={sslcPerc,pucPerc,degPerc};
int sizeOfArray=percentages.length;
System.out.println("All elements "+sizeOfArray);
double elementAtIndex0=percentages[0];
System.out.println("Element at index two "+elementAtIndex0);

double elementAtIndex1=percentages[1];
System.out.println("Element at index one "+elementAtIndex1);

double elementAtIndex2=percentages[2];
System.out.println("Element at index three "+elementAtIndex2);
}
}