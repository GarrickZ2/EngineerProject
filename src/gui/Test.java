package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Test extends JFrame {
    private JTextArea jTextArea1;

    public Test() {
        jTextArea1 = new JTextArea("\t\t\t\t\t\t\t\t\t--收据--\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "账单号：200345548218752\n" +
                "开单时间：2022-3-14 17：04：55\n" +
                "结账时间：2022-3-14 17：05：23\n" +
                "会员编号：1596521\n" +
                "--------------------------------------------------------------------------------------\n" +
                "菜品 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t数量\t单价\t金额\n" +
                "拉面（Shio, Soft, No please, Nori, Chashu, Boiled egg,5)  \t\t  1\t\t 9.9\t 9.9\n" +
                "+海苔\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2\t\t 1.0\t 2.0\n" +
                "+叉烧\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1      2.0\t 2.0\n" +
                "--------------------------------------------------------------------------------------\n" +
                "\n" +
                "合计\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4     \t\t13.9\n" +
                "\n" +
                "银行卡支付\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t13.9\n" +
                "\n" +
                "======================================================================================\n" +
                "\t\t\t\t\t\t打印时间：2022-3-14 17：05：23\n" +
                "\t\t\t伦敦市力王区贝克街B15号龙猫拉面 电话： 44 (0) 203 178 4861");//需要在换行的地方加入\n
        jTextArea1.setSize(1000, 500);
        jTextArea1.setEnabled(false);
        setLayout(null);
        setBounds(400, 200, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jTextArea1.setColumns(50);
        jTextArea1.setRows(5);
        add(jTextArea1);
    }

    public static void main(String args[]) {
        new Test().setVisible(true);
    }
}