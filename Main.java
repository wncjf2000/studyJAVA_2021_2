//https://www.acmicpc.net/problem/1427
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.nextLine().toCharArray();

    Arrays.sort(arr);

    for(int i = arr.length-1; i >= 0; i--){
      System.out.print(arr[i]);
    }      
	}
}

