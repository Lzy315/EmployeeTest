package kevin.demo;

public class Hello {
    public static void main(String[] args) {
        short a = 1;
        int sum = 0;
//       int mul ;
//       short b = 9;
//       int re = a + b;
//       System.out.println(re);
//       int re2 = 5 + a;
//       System.+out.println(re2);
/*       if (a > 2) {
           System.out.println("a大于2");
       } else {
           System.out.println("a小于2");
       }
       if (a > 5) {
           mul = 2 ;
       } else if (a > 1 && a < 5) {
           mul = 3;
       } else {
           mul = 0;
       }
       System.out.println(mul);*/
/*    for (a = 1; a <= 100; a++) {
        if (a % 2 == 0) {
            sum += a;
        }
    }*/
/*    while (a <= 100 ) {
        if (a % 2 == 0)
        sum += a;
        a++;
    }*/
/*    do {
        if (a % 2 == 0)
            sum += a;
        a++;
    } while (a <= 100);
    System.out.println("sum = " + sum);*/
        /*break 终止整个循环*/
/*    for (int i = 0; i < 10; i++) {
        if (i >= 4) {
            break;
        }
        System.out.println("Hello");
    }*/
        /*continue 一旦执行，立刻跳出当前次循环，马上开始下一次循环*/
/*        for (int i = 0; i < 10; i++) {
            if (i== 4) {
                continue;
            }
            System.out.println(i + "层到了！");
        }*/
/*    while (true) {
        System.out.println("i java");
    }*/
//    System.out.println("Hello"); //死循环后面是无法访问的语句


/*    do {
        System.out.println("a = " + a);
        a++;
    } while (a < 9);*/
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println("现在是" + i + "点" + j + "分");
            }
        }
    }
}