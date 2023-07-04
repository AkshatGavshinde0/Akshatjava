public class Fibonaci{
    public static void main(String[] args) {

          int length = 10;
int first = 0, second = 1;
System.out.println(first);
System.out.println(second);
for (int i = 3; i <= length; i++) {
    int next = first + second;
    System.out.println(next);
    first = second;
    second = next;
}
}
}
