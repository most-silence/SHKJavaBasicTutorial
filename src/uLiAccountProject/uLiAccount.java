package uLiAccountProject;

import java.util.Scanner;

public class uLiAccount {
    public static void main(String[] args) {
        char select = '4';
        boolean flag = true;
        int account = 10000; //初始储备金为10000
        String detail = "收支\t账户金额\t收支金额\t说明\n";
        while (flag) {
            System.out.println("-----------------谷粒记账软件-----------------");
            System.out.println();
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退出");
            System.out.println();

            System.out.print("                 请选择(1-4)：");
            select =Utility.readMenuSelection();

            if (select == '4') {
                // End app
                System.out.println("您已经退出谷粒记账软件，欢迎下次使用！！！");
                flag = false;
                break;
            } else {
                switch (select){
                    case '1':
                        System.out.println("明细");

                        System.out.println("-----------------收支明细-----------------");
                        System.out.println(detail);
                        break;

                    case '2':
                        System.out.print("请输入收入的金额：");
                        int in_ac = Utility.readNumber();
                        System.out.println();

                        System.out.print("请输入收入的说明：");
                        String in_det = Utility.readString();
                        System.out.println();
                        account+=in_ac;
                        detail+="收入\t" + account + "\t" + in_ac + "\t" + in_det + "\n";
                        break;
                    case '3':
                        System.out.print("请输入支出的金额：");
                        int out_ac = Utility.readNumber();
                        System.out.println();

                        System.out.print("请输入支出的说明：");
                        String out_det = Utility.readString();
                        System.out.println();
                        account-=out_ac;
                        detail+="收入\t" + account + "\t" + out_ac + "\t" + out_det + "\n";
                        break;
                }
            }
            System.out.println("--------------------------------------");
        }
    }
}