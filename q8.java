/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tahacelik
 */
class q8 {

    public static void main(String[] args) {
        System.out.println(lg(159));
    }

    private static int lg(int n) {
        // write your code here
        int i;
        int result=0;
        int sonuc = 1;
        while (n>sonuc) {

            sonuc=sonuc*9;
            result++;


        }
        return result-1;


}}
