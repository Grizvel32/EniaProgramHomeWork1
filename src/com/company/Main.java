package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int NUMBER_OF_SIDES = 2;

        double panelLenght, panelWidth, numberOfpanels, totalArea;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа позволяет подсчитать, сколько всего сульфида необходимо на обработку всех панелей Энии");

        System.out.print("Введите ширину панели ");
        panelWidth = input.nextDouble();

        System.out.print("Введите длину панели ");
        panelLenght = input.nextDouble();

        System.out.print("Введите количество панелей ");
        numberOfpanels = input.nextDouble();

        totalArea = panelLenght * panelWidth * numberOfpanels * NUMBER_OF_SIDES;
        System.out.println("На обработку требуется: "+totalArea+" сульфида");




        }
}
