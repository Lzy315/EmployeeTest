package day09File;


/*1. 目录搜索，无法判断多少级目录，所以使用递归，遍历所有目录。
2. 遍历目录时，获取的子文件，通过文件名称，判断是否符合条件。*/
import java.io.File;

public class FileTest {
    public static void main(String[] args) {
// 创建File对象
        File dir = new File("G:\\aaa");
        byte[] b = "黑马程序员".getBytes();
// 调用打印目录方法
        printDir(dir);
    }

    public static void printDir(File dir) {

// 循环打印
        // 获取子文件和目录
        File[] files = dir.listFiles(); //调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。
/*
判断:
当是文件时,打印绝对路径.
当是目录时,继续调用打印目录的方法,形成递归调用.
*/
        for (File file : files) {
// 判断
            if (file.isFile()) {
// 是文件,输出文件绝对路径
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
// 是目录,输出目录绝对路径
                System.out.println("目录:" + file.getAbsolutePath());
                // 继续遍历,调用printDir,形成递归
                printDir(file);
            }
//                System.out.println(file);
        }
    }
}

