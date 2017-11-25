import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args){
        //创建窗体
        Frame f=new Frame("Experiment02");
        //设置窗口关闭函数
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //添加主菜单栏
        MenuBar mb=new MenuBar();
        f.setMenuBar(mb);

        //为菜单栏添加file，format，help子菜单
        Menu file=new Menu("File");
        Menu format=new Menu("Format");
        Menu help=new Menu("Help");
        mb.setHelpMenu(help);
        mb.add(file);
        mb.add(format);

        //为file添加new，save，load，quit子菜单
        MenuItem file_new=new MenuItem("New");
        MenuItem file_save=new MenuItem("Save");
        MenuItem file_load=new MenuItem("Load");
        MenuItem file_quit=new MenuItem("Quit");
        file.add(file_new);
        file.add(file_save);
        file.add(file_load);
        file.addSeparator();
        file.add(file_quit);

        //为format添加中文，进制子菜单，其中进制为一个菜单
        MenuItem format_cn=new MenuItem("中文");
        format.add(format_cn);
        Menu format_jinzhi=new Menu("进制");
        //为进制添加二进制，八进制，十进制子菜单
        MenuItem format_jinzhi_2=new MenuItem("二进制");
        MenuItem format_jinzhi_8=new MenuItem("八进制");
        MenuItem format_jinzhi_10=new MenuItem("十进制");
        format_jinzhi.add(format_jinzhi_2);
        format_jinzhi.add(format_jinzhi_8);
        format_jinzhi.add(format_jinzhi_10);
        format.add(format_jinzhi);

        //设置窗体大小以及可见
        f.pack();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
