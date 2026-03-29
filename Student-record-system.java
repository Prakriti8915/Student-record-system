import java.util.Scanner;

public class MyStudentPrograms {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Student Marks Analysis");
        System.out.println("2. Subject Percentage");
        System.out.println("3. Matrix Transpose");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter number of students: ");
                int n = sc.nextInt();

                int mks[] = new int[n];

                for(int i = 0; i < n; i++) {
                    System.out.print("Enter marks: ");
                    mks[i] = sc.nextInt();
                }

                int e = 0, o = 0, m = 0;

                for(int i = 0; i < n; i++) {
                    if(mks[i] % 2 == 0)
                        e++;
                    else
                        o++;

                    if(mks[i] % 4 == 0)
                        m++;
                }

                System.out.println("Even marks = " + e);
                System.out.println("Odd marks = " + o);
                System.out.println("Multiples of 4 = " + m);
                break;

            case 2:
                System.out.print("Enter number of students: ");
                int s = sc.nextInt();

                int subjects[][] = new int[s][5];

                for(int i = 0; i < s; i++) {
                    System.out.println("Student " + (i+1));
                    int sum = 0;

                    for(int j = 0; j < 5; j++) {
                        System.out.print("Subject " + (j+1) + ": ");
                        subjects[i][j] = sc.nextInt();
                        sum += subjects[i][j];
                    }

                    double per = sum / 5.0;

                    if(per >= 90)
                        System.out.println("Excellent");
                    else if(per >= 80)
                        System.out.println("Good");
                    else if(per < 34)
                        System.out.println("Fail");
                    else
                        System.out.println("Average");
                }
                break;

            case 3:
                int mat[][] = new int[2][3];

                System.out.println("Enter matrix values:");

                for(int i = 0; i < 2; i++) {
                    for(int j = 0; j < 3; j++) {
                        mat[i][j] = sc.nextInt();
                    }
                }

                System.out.println("Transpose:");

                for(int j = 0; j < 3; j++) {
                    for(int i = 0; i < 2; i++) {
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
