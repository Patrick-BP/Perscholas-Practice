public class Main {
    public static void main(String[] args) {
        int largeNumber = 967532;
        int sum = 0;
            do{
                sum += largeNumber % 10;
                largeNumber = largeNumber/10;
            }while (largeNumber !=0);


        System.out.println(sum);

    }
}
