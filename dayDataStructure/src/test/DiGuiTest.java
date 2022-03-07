package test;
/*递归实现20220219*/
public class DiGuiTest {
    public static void main(String[] args) {
        int result = function(2);
        System.out.println(result);
    }
    public static int function(int n){
        if (n == 1){
            return 1;
        }else {
            return n*function(n-1);
        }
    }
}
