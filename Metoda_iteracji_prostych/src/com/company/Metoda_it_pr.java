package com.company;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Metoda_it_pr {

    int Ilosc_x;
    double e = 0.01;
    double[][] a = {{3, 1, 2}, {1, -4, 1}, {1, 2, 3}};
    double[] b = {5, -7, 2};
    double x[] = {0,0,0};
    int iteracja = 0;

    void Oblicz(int Ilosc_x) {
        double g[] = new double[Ilosc_x];
        double h[][] = new double[Ilosc_x][Ilosc_x];
        double wyniki[] = new double[Ilosc_x];
        double suma = 0;

        for (int i = 0; i < Ilosc_x; i++) {
            g[i] = b[i] / a[i][i];
        }
        for (int i = 0; i < Ilosc_x; i++) {
            for (int j = 0; j < Ilosc_x; j++) {
                if (i != j) {
                    h[i][j] = -(a[i][j]) / a[i][i];
                }
                else {
                    h[i][j] = 0;
                }
            }
        }
        do
        {
            for(int i = 0; i<Ilosc_x; i++)
            {
                x[i]=wyniki[i];
                for(int j = 0; j<Ilosc_x; j++)
                {
                    suma += h[i][j] *x[j];
                }
                wyniki[i] = g[i] + suma;
                suma = 0;
            }
            iteracja++;

        } while ((Math.abs(wyniki[0] - x[0]) > e) || (Math.abs(wyniki[1] - x[1]) > e) || (Math.abs(wyniki[2] - x[2]) > e));

        for(int i = 0; i<Ilosc_x; i++)
        {
            System.out.println(wyniki[i]);
        }
        System.out.println("Iteracje = " + iteracja);

    }




}








