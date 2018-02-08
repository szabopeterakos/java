package HR_GRAPH;


import java.io.*;
import java.util.*;


public class RoadsAndLibraries {


    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        if (cities == null || cities.length == 0) {
            return n * c_lib;
        }

        long sum = 0;
        List<HR_GRAPH.City> city_list = new ArrayList<>();
        city_list.add(new City(cities[0][0]));
        city_list.get(0).hasLibrary = true;

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (!hasCityName(cities[i][j], city_list)) {
                    city_list.add(new City(cities[i][j]));
                }
            }
        }


        System.out.println(city_list);

        return sum;
    }

    static boolean hasCityName(int current, List<HR_GRAPH.City> citys) {
        boolean res = false;

        for (int i = 0; i < citys.size(); i++) {
            if (citys.get(i).name == current) {
                return true;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input04.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int c_lib = in.nextInt();
            int c_road = in.nextInt();
            int[][] cities = new int[m][2];
            for (int cities_i = 0; cities_i < m; cities_i++) {
                for (int cities_j = 0; cities_j < 2; cities_j++) {
                    cities[cities_i][cities_j] = in.nextInt();
                }
            }
            long result = roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(result);
        }
        in.close();
    }

}

class City {
    int name;
    boolean hasLibrary = false;
    boolean hasRoad = false;

    public City(int n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return "City{" +
                "name=" + name +
                ", hasLibrary=" + hasLibrary +
                ", hasRoad=" + hasRoad +
                '}';
    }
}
