public class Main {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}