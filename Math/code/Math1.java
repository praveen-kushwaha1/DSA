package code;

public class Math1 {
    static void decimalToAnyBase(int decimalNum, int base) {
        int resNum = 0;
        int power = 0;
        while (decimalNum>0){
            int rem = decimalNum%base;
            decimalNum /= base;
            resNum += rem * power(10,power);
            power++;
        }
        System.out.println("Result is "+ resNum);
    }
    static void AnyBaseToDecimal(int binaryNum, int base) {
        int resNum = 0;
        int power = 0;
        while (binaryNum>0){
            int unitDigit = binaryNum %10;
            binaryNum /=10;
            resNum += unitDigit * power(base,power);
            power++;
        }
        System.out.println("Result is "+ resNum);
    }
    static void findEvenOdd(int num){
        if(num%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    static void reverseNum(int num){

        int revNum = 0;
        while (num > 0 ){
            int digit = num %10;
            revNum = revNum*10 + digit;
            num /=10;
        }
        System.out.println("Reverse is: "+ revNum);

    }
    static double power(int num, int power){
        double res = 1;
        for(int i = 0; i< power;i++){
            res = res*num;
        }
        System.out.println(res);
        return res;
    }

    static double fastExponentiation(int num, int power){
        double res = 1;
        while (power > 0){
            if(power %2!=0){
                res = res *num;
            }
            power /= 2;
            num = num *num;
        }
        System.out.println(res);
        return res;
    }

    static String binary(int[]a,int len,int key){
        int l=0,h=len-1;
        int m=(h-l)/2+l;
        while (h>=l) {
            m=l+(h-l)/2;
            if (key == a[m]) return "value is "+a[m]+" index is "+m+"  ";
            if (key > a[m]) l = m + 1;
            if(key<a[m]) h = m - 1;
        }
        return "Not found";
    }
    public static void main(String[] args) {
        decimalToAnyBase(5,2);
        AnyBaseToDecimal(101,2);
        fastExponentiation(2,3);
        findEvenOdd(7);
        reverseNum(20461);
        power(10,6);
       // decimalToAnyBase(8,2);
      // System.out.println(reverseNum(1534236469));
       int a[]={1,5,7,9,11,15,16,19};
      // binary(a,a.length,11);
        System.out.println(binary(a,a.length,19));
    }
}

