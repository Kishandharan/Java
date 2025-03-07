package JavaThreads;

public class JavaThreads1 {
    public static void main(String[] args) {
        Thread th1 = new Thread(() -> func1(), "Task man");
        th1.start();
    }

    public static void func1(){

    }
}
