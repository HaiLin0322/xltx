import java.util.Scanner;

public class scoreTest {
    public static void main(String[] args) {
        for(int num = 1;num < 4;num++){
            System.out.print("请输入初始分数");
            int score = new Scanner(System.in).nextInt();
            int count = 0;
            System.out.println("加分前成绩：" +score);
            while(score<60){
                score++;
                count++;
            }
            System.out.println("加分后成绩：" +score);
            System.out.println("加分次数：" +count);
        }
    }
}
