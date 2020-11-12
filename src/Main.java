import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number size square edge: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        int[][] ints = new int[width][width];
        //Nhập giá trị cho mảng hai chiều
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("Enter number width " + i + "&& Enter number height " + j);
                ints[i][j] = scanner.nextInt();
            }
        }
//        Tính tổng đường chéo chính
        int sumCheoChinh = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (i == j) {
                    sumCheoChinh += ints[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính: " + sumCheoChinh);
        int sumCheoPhu = 0;
        //Tính đường chéo phụ
        int count = ints.length - 1;
        for (int i = 0; i < ints.length; i++) {
            sumCheoPhu += ints[i][count];
            count --;
        }
        System.out.println("Tổng đường chéo phụ: " + sumCheoPhu);
    }
}
