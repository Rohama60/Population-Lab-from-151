// Rohama Mulugeta

import java.security.spec.RSAOtherPrimeInfo;
// calling scanner for the user input
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // asking the user what country they want to expolre
        System.out.println("What country would you like to explore? ");
        String countryExplore = input.nextLine();
        // asking the user the current population of the country
        System.out.println("What is the current population? ");
        int currentPopulation = input.nextInt();
        // asking the user birth rate per second
        System.out.println("How many seconds between birth? ");
        int birthSecond = input.nextInt();
        // asking the user death rate per second
        System.out.println("How many seconds between death? ");
        int deathSecond = input.nextInt();
        // asking the user immigrants rate per second
        System.out.println("How many second between immigrations? ");
        int immigrationSecond = input.nextInt();
        // asking the user how many years in the future they want to know
        System.out.println("How many years in the future?  ");
        int futureYear = input.nextInt();
        // Calculating the expected future population
        int futurePopulation = calculateFuturePopulation(currentPopulation, birthSecond, deathSecond, immigrationSecond, futureYear);
        System.out.println("The " + countryExplore + " population in " + futureYear + " years will be " + futurePopulation);
        // out putting the increase in population
        System.out.println("Population increased by " + (futurePopulation - currentPopulation));
    }
    // To calculate the future population based on the users input
    public static int calculateFuturePopulation(int currentPopulation,int birthSecond,int deathSecond,int immigrationSecond,int futureYear){
        int totalSeconds = futureYear * 365 * 24 * 60 * 60;
        int netChangeSecond = birthSecond- deathSecond + immigrationSecond;
        int futurePopulation = currentPopulation +(netChangeSecond * totalSeconds);
        return futurePopulation;

    }
}
