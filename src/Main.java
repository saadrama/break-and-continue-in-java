public class Main {
    public static void main(String[] args) {
        System.out.println("Break and continue");
        //The break statement can also be used to jump out of a loop.
        for (int i=0; i<10; i++) {
            if (i == 4) {
                break;
                // It stops the loop When i is equal to 4
            }
            System.out.println(i);
        }
        //Java continue
        /*The continue statements breaks one iteration (in the loop), if a specified conditon ocuurs,
        * and continues with the next iteration in the loop*/
        for (int a=0; a<10; a++) {
            if (a ==4) {
                continue;
                //This one skips the value of 4
            }
            System.out.println(a);
        }
        //Break and continue in while loop
        //Break example
        int z=0;
        while (z<10) {
            System.out.println(z);
            z++;
            if (z==4) {
                break;
            }
        }
        //Continue example
        int i=0;
        while (i<10) {
            if (i==4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}