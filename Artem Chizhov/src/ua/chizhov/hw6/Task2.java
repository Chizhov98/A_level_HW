package ua.chizhov.hw6;

public class Task2 {
    /*Ошибка боросаеться в глаза так как во вложеном цикле (строка 30)вместо j в условие была i;
    для ее нахождения через дебаг сначала запустил програму просто , указало строку где выскакивает ошибка;
     а после  утановил точку остановки на сттроке 29 и по шагово отследил до момента возникновения ошибки
      где цикл пытался обратиться к елементу triangle[0][1] которого несуществует
      проверив условие сразу понятно почему так произошло
    * */
    public static void main(String[] args) {
        int[][] triangle = new int[5][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }

        }

        for (int i = 0; i < triangle.length; i++) {//здесь была точка остановки
            for (int j = 0; j < triangle[i].length; j++) {//здесь была ошибка
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}
