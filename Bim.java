import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/04/25/8:09
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Bim{
	public static void main(String[] args) {
		//����scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("����������أ�kg)��");
		//��ʼ������
		double weight = 0;
		//��ʼ�����
		double height = 0;
		//����ѭ�������ƽ�����������
		while (scan.hasNext()){
			//�ж�������Ƿ�Ϊ����
			if (scan.hasNextDouble()){
				//��ȡ����
				weight = scan.nextDouble();
				System.out.println("�յ������������" + weight);
				break;
			}
			else {
				//��ʾ��������
				System.out.println("�����밢�������֣�");
				//���scanner����
				scan = new Scanner(System.in);
			}
		}
		System.out.println("�����������������ߣ�m)��");
		while (scan.hasNextLine()){
			if (scan.hasNextDouble()){
				height = scan.nextDouble();
				System.out.println("�յ�����������" + height + "���׶԰ɣ�");
				break;
			}
			else{
				System.out.println("�����밢�������֣�");
				scan = new Scanner(System.in);
			}
		}
		//�ر�scanner
		scan.close();
		//����ߴ���һ�����в�����ָ��˫����ֵ�Ķ���
		BigDecimal heightBigDecimal1 = new BigDecimal(height);
		//�������ߵ�ƽ��
		double heightSquare = heightBigDecimal1.multiply(heightBigDecimal1).doubleValue();
		//�����ش���һ�����в�����ָ��˫����ֵ�Ķ���
		BigDecimal weightBigDecimal = new BigDecimal(weight);
		//����ߵ�ƽ������һ�����в�����ָ��˫����ֵ�Ķ���
		BigDecimal heightBigDecimal2 = new BigDecimal(heightSquare);
		//���س�����ߵ�ƽ�����BIMֵ
		double bim = weightBigDecimal.divide(
				heightBigDecimal2,
				2,
				RoundingMode.CEILING
		).doubleValue();
		System.out.println("���BIMָ��Ϊ��" + bim);
		//����BIMֵ�ж������ĸ�����
		double a = 18.5;
		double b = 25;
		double c = 28;
		double d = 32;
		if (bim < a){
			System.out.println("������ϣ����Ǹ����ӣ�����Է�������");
		}
		else if (bim <= b) {
			System.out.println("����ģ���Ľ@_@");
		}
		else if (bim <= c) {
			System.out.println("С���ӣ��ٳԵ㡣����");
		}
		else if (bim <= d) {
			System.out.println("����~�����ӡ�����");
		}
		else{
			System.out.println("!!!��ô�֣�����");
		}
	}
}