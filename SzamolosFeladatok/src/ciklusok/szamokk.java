package ciklusok;

import java.util.Scanner;

public class szamokk {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ismetlessel");
        boolean ismetel = false;
        int ismDb = 0, ismNkdb = 0;
        for (int j = 2; j <= 4; j++) {
            for (int i = 2; i <= 4; i++) {
                for (int k = 2; k <= 4; k++) {
                    if (ismetel) {

                        System.out.println("" + k + j + i);
                    } else if (k != j && j != i && k != i) {
                        System.out.println("" + k + j + i);
                    }
                }
            }
            if (ismetel) {
                System.out.println("ismetlessel:" + ismDb);
            } else {
                System.out.println("ismetlessel:" + ismNkdb);
            }
        }

    }
}
