import java.util.Arrays;
import java.util.Scanner;

public class ArtHomeWork6_2 {


    public static void main(String[] args) {

        System.out.println();
        System.out.println("============ 1 =============");
        System.out.println();

        int first[] = new int[50];
        int j = 0;
        for( int i=0; i < 100; i++ ) {
            if (i%2 == 1) {  // Другой способ наполнения аналогичного массива в №13
                first[j] = i;
                j++;
            }
        }
        for ( int i = 0; i<50; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for ( int i = 49; i>=0; i--) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        System.out.println("============ 2 =============");
        System.out.println();

        int second[] = {1, 5, 9, 4, 6, 4, 3, 7, 9, 6, 2, 1, 6, 8, 7}; // Для экономии времени и строк, заполнял так
        System.out.println(Arrays.toString(second));  //                 Рандом начал использовать с №9
        int q = 0;
        for( int i=0; i < second.length; i++ ) {
            if (second[i] % 2 == 0) {
                q++;
            }
        }
         System.out.println();
         System.out.println("Количество четных элементов в массиве - " + q);

        System.out.println();
        System.out.println("============ 3 =============");
        System.out.println();

        int tri[] = {1, 5, 7, 9, 6, 2, 1, 6, 8, 7};
        System.out.println(Arrays.toString(tri));
        for ( int i=0; i<tri.length; i++ ) {
            if (i%2 == 1) {
                tri[i] = 0;
            }
        }
        System.out.println(Arrays.toString(tri));

        System.out.println();
        System.out.println("============ 4 =============");
        System.out.println();

        int che1[] = {1, 3, 5, 2, 4};
        int che2[] = {2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(che1));
        System.out.println(Arrays.toString(che2));
        int c1 = 0;
        int c2 = 0;
        for (int i=0; i<5; i++) {
            c1 += che1[i];
            c2 += che2[i];
        }
        c1 = c1 / 5;
        c2 = c2 / 5;
        if (c1>c2) {
            System.out.println("Первое число больше");
        } else if (c2>c1) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println();
        System.out.println("============ 5 =============");
        System.out.println();

        int fiv[] = {12, 22, 25, 42, 22};
        int f = 1;
        for (int i = 1; i<fiv.length; i++) {
            if (fiv[i] < fiv[i-1]){
                f = 2;
                break;
            }
        }
        switch (f) {
            case 1:
                System.out.println("Массив является строго возрастающей последовательностью");
                break;
            case 2:
                System.out.println("Массив не является строго возрастающей последовательностью");
        }
        System.out.println();
        System.out.println("============ 6 =============");
        System.out.println();

        int six[] = new int[20];
        six[0] = 1;
        six[1] = 1;
        for ( int i = 2; i<20; i++ ) {
            six[i] = six[i-1] + six[i-2];
        }
        System.out.println(Arrays.toString(six));

        System.out.println();
        System.out.println("============ 7 =============");
        System.out.println();

        int sev[] = {1, 13, 5, 2, 4, 8, -4, 12, -12, 4, -4, 0};
        int s1 = sev[11];
        int s2 = 11;
        for (int i = 10; i>=0; i--) {
            if (sev[i] > s1) {
                s1 = sev[i];
                s2 = i;
            }
        }
        System.out.println("Максимальное число " + s1 + ". Его индекс " + s2);

        System.out.println();
        System.out.println("============ 8 =============");
        System.out.println();

        int eig1[] = {1, 5, 7, 9, 6, 2, 1, 6, 8, 7};
        int eig2[] = {2, 4, 6, 5, 7, 4, 4, 3, 1, 9};
        double eig3[] = new double[10];
        int ee;
        int kk = 0;
        for (int i = 0; i<10; i++) {
            eig3[i] = (double) eig1[i]/eig2[i];
            ee = (int) eig3[i];
            if (eig3[i] == ee ) {
                kk++;
            }
        }
        System.out.println(Arrays.toString(eig1));
        System.out.println(Arrays.toString(eig2));
        System.out.println(Arrays.toString(eig3));
        System.out.println("Колличество целых чисел в 3-м массиве " + kk);

        System.out.println();
        System.out.println("============ 9 =============");
        System.out.println();

        int a91 = 0;
        int a92 = 0;
        int a93 = 0;

        int [] nin = new int[11];
        for (int i = 0; i < 11; i++) {
            nin[i] = ((int) (Math.random() * 3)-1);
            switch (nin[i]) {
                case -1 :
                    a91++;
                    break;
                case 0 :
                    a92++;
                    break;
                case 1 :
                    a93++;
                    break;
            }
        }
        System.out.println(Arrays.toString(nin));
        System.out.println(a91+" "+a92+" "+a93);

        if (a91>a92 && a91>a93) {
            System.out.println("Чаще всего встречается " + -1);
        } else if (a92>a91 && a92>a93) {
            System.out.println("Чаще всего встречается " + 0);
        } else if (a93>a92 && a93>a91) {
            System.out.println("Чаще всего встречается " + 1);
        }

        System.out.println();
        System.out.println("============ 10 =============");
        System.out.println();

        Scanner scan10 = new Scanner(System.in);
        int sc10, left10=0, right10=0;
        while (true) {
            System.out.println("Введите положительное четное число");
            sc10 = scan10.nextInt(); // на данном этапе мы еще не проходили try catch, там что поверим, что там число
            if (sc10 % 2 == 0 && sc10 > 0) {
                break;
            }
        }
        int[] arr10 = new int[sc10];

        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = ((int) (Math.random() * 11))-5;
        }
        System.out.println(Arrays.toString(arr10));

        for (int i = 0; i < (sc10/2); i++) {
            if (arr10[i]<0) {
                left10 -= arr10[i];
            } else {
                left10 += arr10[i];
            }
            if (arr10[i+(sc10/2)]<0) {
                right10 -= arr10[i+(sc10/2)];
            } else {
                right10 += arr10[i+(sc10/2)];
            }
        }
        if (left10 > right10) {
            System.out.println("Левая половина больше");
        } else if (left10 < right10) {
            System.out.println("Правая половина больше");
        } else {
            System.out.println("Обе части равны");
        }

        System.out.println();
        System.out.println("============ 11 =============");
        System.out.println();

        int arr11[] = new int[12];
        int plus11 = 0;
        int minus11 = 0;
        int rand11;
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = ((int) (Math.random() * 21)) - 10;
            while (arr11[i] == 0) {
                arr11[i] = ((int) (Math.random() * 21)) - 10;
            }
            if (arr11[i] > 0) {
                plus11++;
            } else {
                minus11++;
            }
        }
        System.out.println(Arrays.toString(arr11));

        while (plus11 != minus11) {  //В готовом массиве рандомно берет элементы, и если надо, меняет +\-
            rand11 = (int) (Math.random() * 12); //цифры оставляет те же
            if (plus11 > minus11 && arr11[rand11] > 0) {
                arr11[rand11] = arr11[rand11] * (-1);
                plus11--;
                minus11++;
            }
            if (plus11 < minus11 && arr11[rand11] < 0) {
                arr11[rand11] = arr11[rand11] * (-1);
                plus11++;
                minus11--;
            }
        }
        System.out.println(Arrays.toString(arr11));

        System.out.println();
        System.out.println("============ 12 =============");
        System.out.println();

        Scanner scan12 = new Scanner(System.in);
        double numb12 = 0;
        int tmp12 = 0;
        while (numb12 < 3) {
            System.out.println("Введите натуральное число больше 3. Дробь через запятую плз"); // Исключения в следующем дз
            numb12 = scan12.nextDouble();
        }
        int anumb12 = (int) numb12;
        int[] arr12 = new int[anumb12];
        for (int i = 0; i < arr12.length; i++) {
            arr12[i] = (int) (Math.random() * (anumb12+1));
            if (arr12[i]%2 == 0) {
                tmp12++;
            }
        }
        System.out.println(Arrays.toString(arr12));
        if (tmp12 != 0) {
            int ar2r12[] = new int[tmp12];
            tmp12 = 0;
            for (int i = 0; i < arr12.length; i++) {
                if (arr12[i] % 2 == 0) {
                    ar2r12[tmp12] = arr12[i];
                    tmp12++;
                }
            }
            System.out.println(Arrays.toString(ar2r12));
        }

        System.out.println();
        System.out.println("============ 13 =============");
        System.out.println();

        int arr13[] = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr13[(i-1)] = i*2;
            System.out.print(arr13[i-1] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(arr13[i]);
        }
    }
}