package Basics;

public class Loop {
    public static void main(String[] args) {
        // shorthand if...else
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //do-while loop:
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        //while loop
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }

        //for loop:
        for (int ii = 0; ii <= 10; ii = ii + 2) {
            System.out.println(ii);
        }

        //for-each loop:
        String[] footballers = {"Messi", "Pele", "Maradona"};
        for (String a : footballers) {
            System.out.println(a);
        }

        //break - continue
//        for (int e = 0; e < 10; e++) {
//            if (e == 4)
//                break;
//        }
        int e = 0;
        while (e < 10) {
            if (e == 4) {
                e++;
                continue;
            }
            System.out.println(e);
            e++;
        }
    }
}
