public class ArrayStoreException{
    public static void main(String[] args) {
        Object[] arr = "a;b;c".split(";");
        arr[0] = 42;
    }
}
