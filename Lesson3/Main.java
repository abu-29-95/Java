package Lesson3;

public class Main {
    public static void main(String[] args) {
        int  [] ex1 = {1,1,0,0,1,0,1,1,0,0};
        for (int i =0; i < ex1.length; i++) {
             if (ex1[i]/1 == 1) {
                 ex1[i] = 0;
             }
             else {
                 ex1[i] = 1;
             }
             System.out.print(ex1[i]+" ");
        }
        System.out.println();


        int [] ex2 = new int [11];
        int a=0;
        for (int i =0; i < 11; i++) {
            ex2[i] += a++;
            System.out.println(ex2[i]);
        }


        int [] ex3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0;i< ex3.length; i++) {
            if (ex3[i] < 6) {
                ex3 [i] *=2;
            }
            System.out.print(ex3[i]+ " ");
        }
        System.out.println();

      int [] [] arr = new int [5][5];
        for (int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[i].length;j++){
                if (i>j){
                    arr [i][j] =0;
                }
                else if (i<j) {
                    arr [i][j] =0;
                }
                else {
                    arr [i][j]=1;
                }
            }
        }
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr [i][j]+ " ");
            }
            System.out.println();
        }

        String ex5 = twoArgs("len", "initialValue");
        System.out.println();

        int [] ex6 = {1,5,3,2,11,4,5};
        System.out.println("Max " + ex6.length);
            for (int i=0; i< ex6.length; i++) {
                System.out.print(ex6[i] + " " );
            }
        System.out.println();
        int min = ex6.length - 6;
        System.out.println("Min " + min);
        for (int i=0; i<min; i++){
            System.out.print(ex6[i] + " ");
        }
        System.out.println();

    }

    public static String twoArgs (String arg1, String arg2) {
        int[] res = new int [arg1.length()];
        for (int i=0; i<arg1.length(); i++) {
            try {
                res[i] = Integer.parseInt (arg2.trim());
                System.out.println(res[i]);
            }
            catch (NumberFormatException nfe) {
                System.out.println(" " + nfe.getMessage());
            }
        }
        return String.valueOf(res);
    }


}
