package day06.demo;

public class Person {
    String name;
   private int age;
   boolean male;

   public Person() {
       System.out.println("无参构造方法执行啦！");
   }

   public Person(String name, int age) {
       System.out.println("全参构造方法执行啦！");
       this.name = name;
       this.age = age;
   }

    public void showName(String name) {
        System.out.println(name + "你好," + "我叫：" + this.name + " 年龄：" + age);
        System.out.println(this);
    }

    public void setAge(int num) {
        if (num <= 100 && num >= 0) {
            age = num;
        } else {
            System.out.println("输入年龄数据不合理");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String Nam) {
        name = Nam;
    }

    public String getName() {
        return name;
    }

    public void setMale(boolean yes) {
        male = yes;
    }

    public boolean isMale() { //boolean 类型的getter方法时is开头
        return male;
    }
}
