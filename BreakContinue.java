/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 李余波
 * @Date: 2022/04/25/10:00
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class BreakContinue {
    public static void main(String[] args) {
        int a = 10;
        for (int i=1; i<=a; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=a; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("break done");
        }
    }
}

/**
 * 死循环测试，慎用！！
 */
class Dead{
    public static void main(String[] args) {
        long sum;
        for (long i = 1,j = 1; i == j; i++, j++){
            sum = i * j;
            long sumSquare = sum *sum;
            System.out.println("第"+i+"一个i=" +i);
            System.out.println("第"+j+"一个j=" +j);
            System.out.println(sum);
            System.out.println(sumSquare);
        }
    }
}

/**
 * continue
 */
class Continue {
    public static void main(String[] args) {
        int sum = 0;
        int a = 10;
        for (int i=1; i<=a; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum);
    }
}