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

    static double power(int num, int power){
        double res = 1;
        for(int i = 0; i< power;i++){
            res = res*num;
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        decimalToAnyBase(8,2);
    }
}

