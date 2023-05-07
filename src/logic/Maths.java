package logic;

import java.util.ArrayList;

public class Maths {

    public static Integer getSummation(Integer num) {
        Integer result = 0;
        for (Integer i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static Boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    public static Boolean isDivisible(Integer num, int divisor) {
        return num % divisor == 0;
    }

    public static Boolean isPrime(Integer num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return true;
        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static ArrayList<Integer> factorize(Integer num) {
        ArrayList<Integer> primeArr = new ArrayList<>();
        ArrayList<Integer> Factors = new ArrayList<>();
        Boolean flag = false;
        if (isPrime(num)) {
            primeArr.add(num);
            return primeArr;
        }
        if (num <= 1)
            return primeArr;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isPrime(i)) {
                primeArr.add(i);
            }
        }
        for (int i = 0; i < primeArr.size(); i++) {
            if (flag)
                break;

            while (true) {
                if (num % primeArr.get(i) == 0) {
                    num /= primeArr.get(i);
                    Factors.add(primeArr.get(i));
                    if (isPrime(num)) {
                        flag = true;
                        Factors.add(num);
                        break;
                    }

                } else {
                    i++;
                }
            }

        }
        return Factors;
    }

}
