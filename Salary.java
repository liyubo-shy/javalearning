import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ���ನ
 * @Date: 2022/04/26/13:30
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 * ����С����
 */
public class Salary {
    public static void main(String[] args) {
        //����Scanner
        Scanner scan = new Scanner(System.in);
        //��ʼ��������
        double workDay = 0;
        //��ʼ����ĩ���
        double weekWork = 0;
        //��ʼ�������
        double nightWork = 0;
        //��ʼ����������
        double basicSalary = 0;
        System.out.println("���뱾�µĹ���������");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //��ȡ������
                workDay = scan.nextDouble();
                break;
            }
            else {
                System.out.println("���������֣�");
                scan = new Scanner(System.in);
            }
        }
        System.out.println("������ĩ���ϰ������");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //��ȡ��ĩ���
                weekWork = scan.nextDouble();
                break;
            }
            else {
                System.out.println("���������֣�");
                scan = new Scanner(System.in);
            }
        }
        System.out.println("���������ϰ������");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //��ȡ�����
                nightWork = scan.nextDouble();
                break;
            }
            else {
                System.out.println("���������֣�");
                scan = new Scanner(System.in);
            }
        }
        System.out.println("����������ʣ�");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //��ȡ��������
                basicSalary = scan.nextDouble();
                break;
            }
            else {
                System.out.println("���������֣�");
                scan = new Scanner(System.in);
            }
        }
        //ת����������ÿ���
        int intWorkDay = (int)workDay;
        int intWeekWork = (int)weekWork;
        int intNightWork = (int)nightWork;
        int intBasicSalary = (int)basicSalary;
        System.out.println("=========���Ƿָ���===========");
        System.out.println("���µĹ����գ�" + intWorkDay);
        System.out.println("��ĩ���ϰ������" + intWeekWork);
        System.out.println("�����ϰ������" + intNightWork);
        System.out.println("=========���Ƿָ���===========");
        System.out.println("�������ʣ�" + intBasicSalary);
        //һ�����Ĳ���
        double singleSubsidy = 96;
        //������δ������ȶ���
        BigDecimal bigNightWork = new BigDecimal(nightWork);
        //��������ಹ���������ȶ���
        BigDecimal bigSingleSubsidy = new BigDecimal(singleSubsidy);
        //�����ܵ���ಹ��
        double allNightSubsidy = bigNightWork.multiply(bigSingleSubsidy).doubleValue();
        //�������մ������ȶ���
        BigDecimal bigWorkDay = new BigDecimal(workDay);
        //���������ʴ������ȶ���
        BigDecimal bigBasicSalary = new BigDecimal(basicSalary);
        //�����վ����ʣ�����4λС��
        double singleSalary = bigBasicSalary.divide(
                bigWorkDay,
                4,
                RoundingMode.CEILING
        ).doubleValue();
        //����ĩ��δ������ȶ���
        BigDecimal bigWeekWork = new BigDecimal(weekWork);
        //���վ����ʴ������ȶ���
        BigDecimal bigSingleSalary = new BigDecimal(singleSalary);
        //������ĩ����
        double allWeekSubsidy = bigWeekWork.multiply(bigSingleSalary).doubleValue();
        //�����ܹ���ceiling
        double allSalary = basicSalary + allWeekSubsidy + allNightSubsidy;
        System.out.println("��ಹ����" + allNightSubsidy);
        System.out.println("��ĩ������" + allWeekSubsidy);
        System.out.println("��н:" + allSalary);
    }
}
class Ma{
    public static void main(String[] args) {
        byte a = (byte)129;
        System.out.println(a);
    }
}