package praktikum3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Package & Import ===");
        MyPackage.printMessage();

        System.out.println("\n=== Array & Collection ===");
        CollectionExample collection = new CollectionExample();
        collection.demoArrayList();
        collection.demoHashMap();

        System.out.println("\n=== Exception Handling ===");
        ExceptionExample exceptionDemo = new ExceptionExample();
        exceptionDemo.demoTryCatchFinally();
        exceptionDemo.demoThrowThrows();
    }
}