
/*

    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     Distance 	   = Fee
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     0 -  4 miles  = $2
	     5 - 15 miles  = $5
	    16 - 25 miles  = $10
	    26 - 50	miles  = $15
	More than 50 miles = $20


     Given the data below. Your should should return the value below
         ________________________________________________

Invoke the method twice with the sample data below

Product:Rice
Qty:20
Price $5.0
Miles:10
===============
Total: $105.0

Product:Beans
Qty:10
Price $2.0
Miles:30
===============
Total: $35.0


 */



public class firstAssessment {
    public static void main(String[] args) {


        String Product1 = "Product: "+"Rice";
        int Qty1 =  20;
        double price1 = 5.0;
        int distance1 = 5;
        double Total;
         Total = Qty1 * price1 +distance1;
        System.out.println(Product1 + "\n " + "Qty;" + Qty1 + "\n " +"price $" +  price1 + "\n" +"Miles: " + distance1 + "\n" +"======" + "\n" + "Total:" + Total);

        String Product2 = "Product: " + "Beans";
        int Qty2 = 10;
        double price2 = 2.0;
        int distance2 = 15;
        double Total2;

        Total2 = Qty2 * price2 +distance2;
        System.out.println( Product2 + "\n " + "Qty;" + Qty2 + "\n " +"price $" +  price2 + "\n" +"Miles: " + distance2 + "\n" +"======" + "\n" + "Total:" + Total2);

        char [] Name = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println(Question2.getSecondToLastElement(Name));
        Name [0] = '$' ;

        int i;
        for(i=0;i<Name.length;i++);
        System.out.println(Name);




        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int x = 0;
        while (x >= 10);
        x++;
        System.out.println();









}}
