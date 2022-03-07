package test;
/*符号表测试 2022.03.03*/
import day05symbol.OrderSymbolTable;
import day05symbol.SymbolTable;

public class SymbolTableTest {

    public static void main(String[] args) {





//有序符号表测试
        OrderSymbolTable<Integer, String> bt = new OrderSymbolTable<>();
        bt.put(3, "二哈");
        bt.put(2, "张三");
        bt.put(1, "李四");
        bt.put(1, "aa");
        bt.put(3, "王五");

        for (int i = 1; i <= bt.size(); i++) {
            System.out.println(bt.get(i));

        }




//        无序符号表测试
        /*
        //创建符号表对象
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();

        //测试put方法（插入,替换）
        symbolTable.put(1,"乔峰");
        symbolTable.put(2,"虚竹");
        symbolTable.put(3,"段誉");

        System.out.println("插入完毕后，元素的个数为:"+symbolTable.size());

        symbolTable.put(2, "慕容复");
        System.out.println("替换完毕后的元素的个数为:"+symbolTable.size());

        //测试get方法
        System.out.println("替换完毕后，键2对应的值为:"+symbolTable.get(2));

        //测试get方法
        System.out.println("替换完毕后，键3对应的值为:"+symbolTable.get(3));


        //测试删除方法
        symbolTable.delete(2);
        System.out.println("删除完毕后，元素的个数:"+symbolTable.size());
*/

    }
}
