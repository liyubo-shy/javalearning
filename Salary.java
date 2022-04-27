import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 李余波
 * @Date: 2022/04/26/13:30
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 * 算账小能手
 */
public class Salary {
    public static void main(String[] args) {
        //创建Scanner
        Scanner scan = new Scanner(System.in);
        //初始化工作日
        double workDay = 0;
        //初始化周末班次
        double weekWork = 0;
        //初始化晚班班次
        double nightWork = 0;
        //初始化基本工资
        double basicSalary = 0;
        System.out.println("输入本月的工作日数：");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //获取工作日
                workDay = scan.nextDouble();
                break;
            }
            else {
                System.out.println("请输入数字：");
                scan = new Scanner(System.in);
            }
        }
        System.out.println("输入周末的上班次数：");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //获取周末班次
                weekWork = scan.nextDouble();
                break;
            }
            else {
                System.out.println("请输入数字：");
                scan = new Scanner(System.in);
            }
        }
        System.out.println("输入晚班的上班次数：");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //获取晚班班次
                nightWork = scan.nextDouble();
                break;
            }
            else {
                System.out.println("请输入数字：");
                scan = new Scanner(System.in);
            }
        }
        System.out.println("输入基本工资：");
        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                //获取基本工资
                basicSalary = scan.nextDouble();
                break;
            }
            else {
                System.out.println("请输入数字：");
                scan = new Scanner(System.in);
            }
        }
        //转成整型输出好看点
        int intWorkDay = (int)workDay;
        int intWeekWork = (int)weekWork;
        int intNightWork = (int)nightWork;
        int intBasicSalary = (int)basicSalary;
        System.out.println("=========我是分割线===========");
        System.out.println("本月的工作日：" + intWorkDay);
        System.out.println("周末的上班次数：" + intWeekWork);
        System.out.println("晚班的上班次数：" + intNightWork);
        System.out.println("=========我是分割线===========");
        System.out.println("基础工资：" + intBasicSalary);
        //一天晚班的补贴
        double singleSubsidy = 96;
        //给晚班班次创建精度对象
        BigDecimal bigNightWork = new BigDecimal(nightWork);
        //给单次晚班补贴创建精度对象
        BigDecimal bigSingleSubsidy = new BigDecimal(singleSubsidy);
        //计算总的晚班补贴
        double allNightSubsidy = bigNightWork.multiply(bigSingleSubsidy).doubleValue();
        //给工作日创建精度对象
        BigDecimal bigWorkDay = new BigDecimal(workDay);
        //给基本工资创建精度对象
        BigDecimal bigBasicSalary = new BigDecimal(basicSalary);
        //计算日均工资，保留4位小数
        double singleSalary = bigBasicSalary.divide(
                bigWorkDay,
                4,
                RoundingMode.CEILING
        ).doubleValue();
        //给周末班次创建精度对象
        BigDecimal bigWeekWork = new BigDecimal(weekWork);
        //给日均工资创建精度对象
        BigDecimal bigSingleSalary = new BigDecimal(singleSalary);
        //计算周末补贴
        double allWeekSubsidy = bigWeekWork.multiply(bigSingleSalary).doubleValue();
        //计算总工资ceiling
        double allSalary = basicSalary + allWeekSubsidy + allNightSubsidy;
        System.out.println("晚班补贴：" + allNightSubsidy);
        System.out.println("周末补贴：" + allWeekSubsidy);
        System.out.println("月薪:" + allSalary);
    }
}
class Ma{
    public static void main(String[] args) {
        byte a = (byte)129;
        System.out.println(a);
    }
}