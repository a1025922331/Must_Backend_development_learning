package mo.must.day6;

public class CodeBlockDemo {
    final String A_WORD;
    final String B_WORD;

    //静态代码块
    static{
        System.out.println("我是静态代码块，在类加载时运行，只执行一次");
    }

    //构造代码块
    {
        A_WORD = "a";
        B_WORD = "b";
        System.out.println("我是构造代码块");
    }

    public CodeBlockDemo(){
        System.out.println("无参构造方法");
        //局部代码块
        {
            int temp = 1;
            //运行完后，局部代码块中的变量可以提前释放
        }
    }

}

class Test{
    public static void main(String[] args) {
        CodeBlockDemo a = new CodeBlockDemo();
        CodeBlockDemo b = new CodeBlockDemo();
    }

}
