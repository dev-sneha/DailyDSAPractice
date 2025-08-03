


class DecimalToBinary{

    public static void DecToBin (int n) {
         int myNum= n;
        int bin = 0;
        int pow =0;
        
        while(n>0){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2; // always divide by the quotient right like 12 divide by 2 then i want quotient to again divide it from which is 6 

        }
         System.out.println("Binary  of "+ myNum + " =" + bin);

    }

    public static void main(String[] args) {

        DecToBin(12);
    }


}