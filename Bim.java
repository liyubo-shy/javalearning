import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/04/25/8:09
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Bim{
	public static void main(String[] args) {
		//创建scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("输入你的体重（kg)：");
		//初始化体重
		double weight = 0;
		//初始化身高
		double height = 0;
		//创建循环以限制仅能输入数字
		while (scan.hasNext()){
			//判断输入的是否为数字
			if (scan.hasNextDouble()){
				//获取体重
				weight = scan.nextDouble();
				System.out.println("收到！你的体重是" + weight);
				break;
			}
			else {
				//提示输入数字
				System.out.println("请输入阿拉伯数字：");
				//清空scanner数据
				scan = new Scanner(System.in);
			}
		}
		System.out.println("接下来请输入你的身高（m)：");
		while (scan.hasNextLine()){
			if (scan.hasNextDouble()){
				height = scan.nextDouble();
				System.out.println("收到！你的身高是" + height + "厘米对吧？");
				break;
			}
			else{
				System.out.println("请输入阿拉伯数字：");
				scan = new Scanner(System.in);
			}
		}
		//关闭scanner
		scan.close();
		//给身高创建一个具有参数所指定双精度值的对象
		BigDecimal heightBigDecimal1 = new BigDecimal(height);
		//计算出身高的平方
		double heightSquare = heightBigDecimal1.multiply(heightBigDecimal1).doubleValue();
		//给体重创建一个具有参数所指定双精度值的对象
		BigDecimal weightBigDecimal = new BigDecimal(weight);
		//给身高的平方创建一个具有参数所指定双精度值的对象
		BigDecimal heightBigDecimal2 = new BigDecimal(heightSquare);
		//体重除以身高的平方算出BIM值
		double bim = weightBigDecimal.divide(
				heightBigDecimal2,
				2,
				RoundingMode.CEILING
		).doubleValue();
		System.out.println("你的BIM指数为：" + bim);
		//根据BIM值判断属于哪个类型
		double a = 18.5;
		double b = 25;
		double c = 28;
		double d = 32;
		if (bim < a){
			System.out.println("鉴定完毕！你是个瘦子！！多吃饭！！！");
		}
		else if (bim <= b) {
			System.out.println("好身材！羡慕@_@");
		}
		else if (bim <= c) {
			System.out.println("小胖子，少吃点。。。");
		}
		else if (bim <= d) {
			System.out.println("咦惹~大胖子。。。");
		}
		else{
			System.out.println("!!!这么胖？？？");
		}
	}
}