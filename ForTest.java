/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/04/25/8:09
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class ForTest {
    public static void main(String[] args) {
        int sum = 0;
        int a = 100;
        for (int i =1; i <= a; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
class ForTest2{
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0; i<ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
    }
}
class ForTest3 {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }
    }
}

/**
 * ����һ�����飬����forѭ���������ÿһ��Ԫ��
 */
class ForExercise1 {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }
    }
}

/**
 * ����for eachѭ��������ÿ��Ԫ�����
 */
class ForExercise2 {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n : ns) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
