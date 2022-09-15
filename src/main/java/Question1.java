public class Question1 {
   String product;
   double price;
   int Qty;
   int miles;

   public String food(String product, int Qty, double price, int miles){
       this.product =product;
       this.Qty = Qty;
       this.price= price;
       double total = 0;
       for (int i = 0; i < miles; i++){
           if (miles < 5){
               total = Qty * price + 2;}
           else if (miles > 5 && miles <16){
               total = Qty * price + 5;}
           else if (miles > 16 && miles < 26){
               total = Qty * price + 10;}
           else if (miles > 26 && miles < 51){
               total = Qty * price + 15;}
           else { total = Qty * price + 20;}
           }
       return "Product: " + product + "\n"+ "Qty: " + Qty + "\n" + "price: " + price + "\n" + "miles: " + miles + "\n" + "======="+ "\n" + total;
       }

   }




