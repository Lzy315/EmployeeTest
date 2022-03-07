package day07Exception;

import javafx.fxml.LoadException;

import java.util.Scanner;
//RegisterException 继承RuntimeException，运行期异常
public class RegisterMainTest02 {
    public static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args)  {
        System.out.println("请输入一个用户名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        checkName(name);

    }
//throws 声明异常
/*    private static void checkName(String name) throws LoadException {
        for (String username : usernames) {
            if (username.equals(name)) {
                throw new LoadException("该用户名已经被注册了");
            }
        }
        System.out.println("恭喜你，注册成功！");
    }*/

    //try catch 捕获异常
    private static void checkName(String name)/*throws LoadException*/ {
        for (String username : usernames) {
            if (username.equals(name)) {
//                此时RegisterException是一个运行期异常，抛出异常，不用处理，交给JVM处理，中断处理。
                throw new RegisterException("该用户名已经被注册了");
            }
        }
                                          System.out.println("恭喜你，注册成功！");
    }

}
