import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.print("共有多少个班：");
        int classNum = new Scanner(System.in).nextInt();
        for (int a = 1; a <=classNum; a++){
            double c = 0;
            System.out.print(a + "班共有多少位同学：");
            int studentNum = new Scanner(System.in).nextInt();
            for (int b = 1;b<=studentNum;b++){
                System.out.print("请输入第" +b+ "位同学的成绩：");
                int score = new Scanner(System.in).nextInt();
                c += score;
            }
            double d = c/studentNum;
            System.out.println(a + "班的平均成绩是：" +d);
        }
    }
}
