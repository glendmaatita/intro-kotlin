public class JMain {
    public static void main (String[] args) {
        Person person = new Person("Fajar", 20);

        int num = 3;

        if (num == 0) {
            System.out.println("Num is zero");
        } else {
            System.out.println("Num is non-zero");
        }

        switch (num) {
            case 0:
                System.out.println("Num is zero");
                break;
            case 1:
                System.out.println("Num is one");
                break;
            case 2:
                System.out.println("Num is two");
                break;
            case 3:
                System.out.println("Num is three");
                break;
            default:
                System.out.println("Num is undefined");
                break;
        }
    }
}
