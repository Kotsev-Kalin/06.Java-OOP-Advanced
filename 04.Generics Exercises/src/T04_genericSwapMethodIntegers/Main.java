package T04_genericSwapMethodIntegers;

import java.util.Scanner;

public class Main {
    //Gosho------------------------------>
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        Box<Integer> box=new Box<>();
        int n=Integer.parseInt(skener.nextLine());
        for (int i = 0; i < n; i++) {
            box.add(Integer.parseInt(skener.nextLine()));
        }
        String[] theTwoIndexes=skener.nextLine().split(" ");
        box.swap(Integer.parseInt(theTwoIndexes[0]),Integer.parseInt(theTwoIndexes[1]));
        System.out.println(box.toString());
    }
}
