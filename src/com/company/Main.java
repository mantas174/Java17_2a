package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 2a.
        //​
        // Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų, tada vėl
        //paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis
        //„pabaiga“.

        String zodis;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Iveskite zodi");
            zodis = in.nextLine();
            System.out.println("ivestas zodis: " +zodis);
        }while(!zodis.equals("pabaiga"));


    }
}
