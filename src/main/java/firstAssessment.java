
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
        Question1 rice = new Question1();
        Question1 beans = new Question1();
        System.out.println(rice.food("rice",20,5,10));
        System.out.println(beans.food("beans",10,2,30));
        char[] name = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println(name[24]);
        name[0] = '$';


        int i;
        for (i = 0; i < name.length; i++) {
            if (name[i] != 'Y') {
                System.out.println(name[i]);
            }
        }


        int x = 20;
        while (x <= 20){
        if (x >= 10)
        System.out.println(x--);}



    }}





