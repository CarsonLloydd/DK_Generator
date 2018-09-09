import java.util.Scanner;

public class combogen {

    public static void main(String... args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter QB1");
        String QB1 = scanner.next();

        System.out.print("Enter QB2");
        String QB2 = scanner.next();

        System.out.print("Enter QB3");
        String QB3 = scanner.next();

        System.out.print("Enter RB1");
        String RB1 = scanner.next();

        System.out.print("Enter RB2");
        String RB2 = scanner.next();

        System.out.print("Enter RB3");
        String RB3 = scanner.next();

        System.out.print("Enter RB4");
        String RB4 = scanner.next();

        System.out.print("Enter WR1");
        String WR1 = scanner.next();

        System.out.print("Enter WR2");
        String WR2 = scanner.next();

        System.out.print("Enter WR3");
        String WR3 = scanner.next();

        System.out.print("Enter WR4");
        String WR4 = scanner.next();

        System.out.print("Enter WR5");
        String WR5 = scanner.next();

        System.out.print("Enter WR6");
        String WR6 = scanner.next();

        System.out.print("Enter TE1");
        String TE1 = scanner.next();

        System.out.print("Enter TE2");
        String TE2 = scanner.next();

        System.out.print("Enter DEF1");
        String DEF1 = scanner.next();

        System.out.print("Enter DEF2");
        String DEF2 = scanner.next();

        String [][] g = {{QB1,QB2,QB3},{RB1,RB2},{RB3,RB4},{WR1,WR2},{WR3,WR4},{WR5,WR6},{TE1,TE2},{DEF1,DEF2}};
        int n = 1;
        for (int j = 0; j < g.length; j++) {
            n *= g[j].length;
        }
        int i[] = new int[g.length];
        for (int k = 0; k < n; k++) {
            for (int rr = 0; rr < g.length; rr++) {
                System.out.print(g[rr][i[rr]] + " ");
            }
            System.out.println();
            i[g.length-1]++;
            for (int j = g.length-1; j > 0; j--) {
                if (i[j] >= g[j].length) {
                    i[j] = 0;
                    i[j - 1]++;
                } else
                    break;
            }

        }
    }

}
