// create a class for display profit and loss 
class CalculateProfitLoss{
       public static void main(String args[]){
       // initialize a variable costPrice and assign value 129 
       int costPrice=129;
       // initialize a variable sellingPrice and assign value 191
       int sellingPrice=191;
       // create a variable for calculate profit 
       int profit=sellingPrice-costPrice;
       // create a variable for calculate Profit Percentage
       double profitPercentage=(double)profit/costPrice*100;
       // display profit/loss or and Percent also
       System.out.println("The Cost Price is INR "+costPrice+" Selling Price is INR "+sellingPrice+"\n"+"The Profit INR "+profit+" and the Profit Percentage is "+profitPercentage);
       }
  }
       
