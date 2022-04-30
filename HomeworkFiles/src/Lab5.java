public class Lab5 {
    public static void main(String[] args) {
        String s = "The territory of Kazakhstan has historically been inhabited by nomadic tribes.";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            System.out.print(t+1);
                count++;
        }
        System.out.println(s.length());
        System.out.println(count);
    }
}
