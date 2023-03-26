import java.util.Arrays;

public class Homework {
        public static void main(String[] args) {
            System.out.println("Проверка на вхождение в диапазон [10:20] суммы 5 и 15:");
            System.out.println(isSumBetween10And20(5, 15)); // true
            System.out.println("Проверка на вхождение в диапазон [10:20] суммы 7 и 15:");
            System.out.println(isSumBetween10And20(7, 15)); // false
            System.out.println("Проверка на вхождение в диапазон [10:20] суммы 2 и 6:");
            System.out.println(isSumBetween10And20(2, 6)); // false
            System.out.println("Проверка на положительное числа 5:");
            System.out.println(isPositive(5)); // true
            System.out.println("Проверка на положительное числа -3:");
            System.out.println(isPositive(-3)); // false
            System.out.println("abcd - 5 раз:");
            printString("abcd", 5); // abcdabcdabcdabcdabcd
            System.out.println();
            System.out.println("Проверка високосного года 2020:");
            System.out.println(isLeapYear(2020));
            System.out.println("Проверка високосного года 2022:");
            System.out.println(isLeapYear(2022));
            System.out.println("Создать массив длинной 5 заполенный 3-ми");
            System.out.println(Arrays.toString(createArray(5,3)));
            System.out.println("Заполнить главную диагональ:");
            fillMainDiag(4);
            System.out.println("Заполнить второспенную диагональ:");
            fillSecondDiag(4);

//            int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
//            int x = array[2][3];
        }

        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        private static boolean isSumBetween10And20(int a, int b) {
            // проверить, что сумма a и b лежит между 10 и 20
            int sum = a+b;
            if (sum >= 10 && sum <= 20) {return true;}
            return false;
        }

        private static boolean isPositive(int x) {
            // проверить, что х положительное
            if (x > 0) {return true;}
            return false;
        }

        private static void printString(String source, int repeat) {
            // напечатать строку source repeat раз
            for (int i = 0; i < repeat; i++) {
                System.out.print(source);
            }
        }

        private static boolean isLeapYear(int year) {
            // проверить, является ли год високосным. если да - return true
            // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
            if (year % 4 != 0){
                return false;
            } else if (year % 100 == 0) {
                if (year % 400 == 0){
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        }

        private static int[] createArray(int len, int initialValue) {
            // должен вернуть массив длины len, каждое значение которого равно initialValue
            int [] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
        private static void reverseArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0){
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }
        }

        private static void upToSix(int[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6){
                    array[i] *= 2;
                }
            }
        }

        private static void fillMainDiag(int len){
            int [][] array = new int[len][len];
            for (int i = 0; i < len; i++) {
                array[i][i]=1;
            }
            for (int i = 0; i < len; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }

    private static void fillSecondDiag(int len){
        int [][] array = new int[len][len];
        for (int i = 0; i < len; i++) {
            array[i][len-i-1]=1;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    }

