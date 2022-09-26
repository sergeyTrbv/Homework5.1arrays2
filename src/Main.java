public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {

               System.out.println("Task 1");

               int[] arr = generateRandomArray();
               //Захотел вывести и посмотреть какие данные хранятся в ячейках
               for (int i = 0; i < arr.length; i++) {

                   System.out.print(arr[i] + " ");
               }


               //Проверяю идёт ли подсчёт денег с каждым месяцем
               System.out.println();
               int summ = 0;
               for (int i = 0; i < arr.length; i++) {
                   summ = summ + arr[i];
                   System.out.print(summ + " ");

               }
               System.out.println();
               System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        }
    public static void task2() {

        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        int maxMoney = -1;
        for (int a : arr){
            if (a > maxMoney){
                maxMoney = a;
            }
        }
        int minMoney = 200_000;
        for (int b : arr){
            if (b < minMoney){
                minMoney = b;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxMoney + " рублей" + "\nМаксимальная сумма трат за день составила " + minMoney + " рублей");

    }
    public static void task3() {

        System.out.println("Task 3");

        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
            System.out.print(summ + " ");

        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");


        double middleMoney = (double)summ / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleMoney + " рублей");

    }
    public static void task4(){
        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println();

        for (int a = reverseFullName.length - 1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);
        }

    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}
