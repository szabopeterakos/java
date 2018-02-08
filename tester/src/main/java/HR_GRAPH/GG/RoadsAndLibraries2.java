package HR_GRAPH.GG;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RoadsAndLibraries2 {


    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        if (cities == null || cities.length == 0) {
            return n * c_lib;
        }

        long sum = 0;
        List<City> city_list = new ArrayList<>();
        city_list.add(new City(cities[0][0]));
        city_list.get(0).hasLibrary = true;
        sum += c_lib;

        for (int[] c : cities) {
            if (!hasCityName(c[1], city_list)) {
                City newCityB = new City(c[1]);
                city_list.add(newCityB);
            }

            if (!hasCityName(c[0], city_list)) {
                City newCity = new City(c[0]);
                city_list.add(newCity);

                if (c_lib <= c_road && newCity.hasRoad == false && newCity.hasLibrary == false) {
                    newCity.hasLibrary = true;
                    sum += c_lib;
                } else if (c_lib > c_road && newCity.hasRoad == false && newCity.hasLibrary == false) {
                    newCity.hasRoad = true;
                    sum += c_road;
                }
            }
            System.out.println("SUM:" + sum);
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < city_list.size(); j++) {
                if (cities[i][1] == city_list.get(j).name) {

                    if (c_lib <= c_road && city_list.get(j).hasRoad == false && city_list.get(j).hasLibrary == false) {
                        city_list.get(j).hasLibrary = true;
                        sum += c_lib;
                    } else if (c_lib > c_road && city_list.get(j).hasRoad == false && city_list.get(j).hasLibrary == false) {
                        city_list.get(j).hasRoad = true;
                        sum += c_road;
                    }

                }
            }
            //System.out.println("SUM:"+sum);

        }

        if (n > city_list.size()) {
            sum += (n - city_list.size()) * c_lib;
        }

        return sum;
    }

    static boolean hasCityName(int current, List<City> citys) {
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

/**
 * 7850257285
 * 6785201034
 * 813348013  OK
 * 4211840970
 * 8610471142
 * 7263742960
 * 4331105640
 * 1226092626 OK
 * 7288635830
 * 8276704464
 */
