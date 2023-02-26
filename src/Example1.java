public class Example1 {

    public static void main(String[] args) {

        var numberOfOrders1 = 20; // int numberOfOrders1 = 20;
        var notificationText = "Не забудьте купить волшебную палочку";

/*
        System.out.println("Сделано заказов: " + numberOfOrders1);
        System.out.println(notificationText);
*/

        // целочисленные
        int intNum1 = -2147483648; // 32 bit
        int intNum2 = 2147483647; // 32 bit
        long longNum; // 64 bit
        short shortNum; // 16 bit
        byte byteNum; // 8 bit

        // вещественные
        double doubleNum = 234.42; // 64 bit
        float floatNum = 847.2f; // 32 bit

        // строковые
        String stringValue = "Это строка фоырпарвыапрфвра";
        char charValue = '1';

        // логические
        boolean trueValue = true;
        boolean falseValue = false;


        // Деление чисел
        int x = 10;
        int y = 3;
        System.out.println(x / y);

        double x2 = 10;
        double y2 = 3;
        System.out.println(x2 / y2);

        // Остаток от деления
        int x3 = 10;
        int y3 = 3;
        System.out.println(x2 % y2);

        // Выводим только последнюю позицию
        int numberTicket = 123456;
        System.out.println(numberTicket % 10);

        // Выводим только предпоследнюю позицию
        numberTicket = numberTicket / 10;
        System.out.println(numberTicket % 10);

/*        System.out.println((numberTicket % 100) / 10);
        System.out.println((numberTicket % 1000) / 100);
        System.out.println((numberTicket % 10000) / 1000);*/


        // Проверка числа на целлое и не целое
        if (numberTicket % 2 > 0) System.out.println("Это НЕ целое число");
        else System.out.println("Это целое число");

/*        if ((numberTicket & 1) == 0) System.out.println("Это целое число");
        else System.out.println("Это НЕ целое число");*/


        // Присваивание через +=, инкремент, декремент
        var num = 10;

        num++; // num += 1; // num = num + 2;

        System.out.println(num);

    }

}