package uke9.genericfunction;


public class UseGenericFunction {
    
    public static void main(String[] args) {

        MyGeneric<Integer> square = n -> n * n;
        System.out.println(square.compute(4));

        MyGeneric<String> reverse = str -> {
            StringBuilder sb = new StringBuilder();
            for (int i = str.length()-1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        };

        System.out.println(reverse.compute("Hei på deg"));

        MyGeneric<Integer> factorial = n -> {

            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.compute(12));
    }
}
