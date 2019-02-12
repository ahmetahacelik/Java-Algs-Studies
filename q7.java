/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tahacelik
 */
class q7 {

    public static void main(String[] args) {
        boolean[][] array2 =   {{true,true,false,true,false},{false,true,false,true,false},{true,false,false,true,false},{false,false,false,true,false},{true,true,false,false,true}};

        print_shape(array2) ;
    }

    private static void print_shape(boolean[][] array) {
        for (int i=0;i<5;i++)
            if (array[0][i])
                System.out.print("+");
            else
                System.out.print("-");
        System.out.println(" ");
        for (int j=0;j<5;j++)

            if (array[1][j])
                System.out.print("+");
            else
                System.out.print("-");
        System.out.println(" ");
        for (int k=0;k<5;k++)

            if (array[2][k])
                System.out.print("+");
            else
                System.out.print("-");
        System.out.println(" ");
        for (int l=0;l<5;l++)

            if (array[3][l])
                System.out.print("+");
            else
                System.out.print("-");
        System.out.println(" ");
        for (int m=0;m<5;m++)

            if (array[4][m])
                System.out.print("+");
            else
                System.out.print("-");


    }}

