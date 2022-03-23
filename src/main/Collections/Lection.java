package main.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
public class Lection {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            String buffer = scanner.nextLine();
            list.add(buffer);
        }
        Map<Integer,String> map = new HashMap<>();
        for(String s: list){
            int a = s.length();
            map.put(a,s);
        }
        for(Map.Entry<Integer,String> maps: map.entrySet()){
            System.out.printf("Key: %s Value: %s \n", maps.getKey(),maps.getValue());
        }


    }
}
