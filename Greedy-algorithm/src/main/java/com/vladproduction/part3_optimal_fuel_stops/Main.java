package com.vladproduction.part3_optimal_fuel_stops;

/**
 * Created by vladproduction on 23-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        int[] stations = {0, 200, 375, 550, 750, 950};
        int capacity = 400;
        System.out.println(minStops(stations, capacity));
    }

    // -1 if impossible to get form stopA to stopB
    private static int minStops(int[] stations, int capacity) {
        int res = 0; //optimal amount of stops
        int currentStop = 0;
        while (currentStop < stations.length - 1){
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity){
                nextStop++;
            }
            if(currentStop == nextStop){
                return -1;
            }
            if(nextStop < stations.length - 1){
                res++;
            }
            currentStop = nextStop;
        }
        return res;
    }
}
