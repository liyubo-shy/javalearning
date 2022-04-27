import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ���ನ
 * @Date: 2022/04/25/10:43
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
    }
}

/**
 * ��ĭ����
 */
class ArrayRank1 {
    public static void main(String[] args) {
        int[] ns = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // ����ǰ:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }
}

/**
 * java��������
 */
class ArrayRank2 {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}

/**
 * ������ϰ
 */
class RankExercise1{
    public static void main(String[] args) {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println("����ǰ��\n" + Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] < ns[j + 1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
        System.out.println("�����\n"+ Arrays.toString(ns));
    }
}

/**
 * Ƕ��forѭ����ӡ��ά����
 */
class PrintTwoArray1{
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };
        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}

/**
 * java���ô�ӡ��ά����
 */
class PrintTwoArray2{
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(ns));
    }
}

/**
 * ������ά����
 */
class ThreeArray{
    public static void main(String[] args) {
        int[][][] ns = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11},
                        {12, 13}
                },
                {
                        {14, 15, 16},
                        {17, 18}
                }
        };
        System.out.println(Arrays.deepToString(ns));
    }
}

/**
 * ʹ�ö�ά������Ա�ʾһ��ѧ���ĸ��Ƴɼ������������ѧ����ƽ����
 */
class TwoArrayExercise{
    public static void main(String[] args) {
        // �ö�ά�����ʾ��ѧ���ɼ�:
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        double average;
        int sum = 0;
        int number = 0;
        for (int[] arr : scores) {
            for (int n : arr) {
                sum = sum + n;
                number++;
            }
        }
        System.out.println("ѧ������Ϊ��" + sum);
        System.out.println("�ܷ���Ϊ��" + number);
        BigDecimal sumBig = new BigDecimal(sum);
        BigDecimal numberBig = new BigDecimal(number);
        average = sumBig.divide(
                numberBig,
                15,
                RoundingMode.CEILING
        ).doubleValue();

        System.out.println("ƽ����Ϊ��" + average);
        double a  = 77.733333;
        double b = 0.000001;
        if (Math.abs(average - a) < b) {
            System.out.println("���Գɹ�");
        } else {
            System.out.println("����ʧ��");
        }
    }
}