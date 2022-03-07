package day07Exception;

import javafx.fxml.LoadException;

import java.util.Scanner;
//RegisterException 继承Exception，编译期异常
public class RegisterMainTest {
    public static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) throws RegisterException {
        System.out.println("请输入一个用户名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        checkName(name);

    }
//throws 声明异常
/*    private static void checkName(String name) throws RegisterException {
        for (String username : usernames) {
            if (username.equals(name)) {
                throw new RegisterException("该用户名已经被注册了");
            }
        }
        System.out.println("恭喜你，注册成功！");
    }*/

/*    try catch 捕获异常*/
    private static void checkName(String name) /*throws LoadException*/ {
        for (String username : usernames) {
            if (username.equals(name)) {
                try {
                    throw new RegisterException("该用户名已经被注册了");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return; //返回，停止执行后面的程序
                }
            }
        }
        System.out.println("恭喜你，注册成功！");
    }
}
