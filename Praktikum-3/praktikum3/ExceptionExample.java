package praktikum3;

public class ExceptionExample {
    public void demoTryCatchFinally() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi Exception: " + e);
        } finally {
            System.out.println("Block finally selalu dieksekusi.");
        }
    }

    public void demoThrowThrows() {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception dari throw: " + e.getMessage());
        }
    }

    public void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Nilai tidak boleh negatif");
        }
        System.out.println("Nilai: " + num);
    }
}