/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ���ನ
 * @Date: 2022/04/25/10:00
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
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
            // break��������
            System.out.println("break done");
        }
    }
}

/**
 * ��ѭ�����ԣ����ã���
 */
class Dead{
    public static void main(String[] args) {
        long sum;
        for (long i = 1,j = 1; i == j; i++, j++){
            sum = i * j;
            long sumSquare = sum *sum;
            System.out.println("��"+i+"һ��i=" +i);
            System.out.println("��"+j+"һ��j=" +j);
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
                continue; // continue�����������ѭ��
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum);
    }
}