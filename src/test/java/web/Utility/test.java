package web.Utility;

public class test {

    public static void main(String[] args){


        int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        for(int i=0;i<=a.length;i++){

            int[] k = {a[i]+a[i+1]};

            System.out.println("test ="+ k[i]);

        }

    }
}
