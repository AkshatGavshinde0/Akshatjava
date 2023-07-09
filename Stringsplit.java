public class Stringsplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] splitArray = str.split(",");
        System.out.println("Splitted strings:");
        for (String s : splitArray) {
            System.out.println(s);
        }
    }
}

