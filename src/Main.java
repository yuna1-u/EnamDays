import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Выберите день недели: ");
        System.out.println(Arrays.toString(Day.values()));

        Day.dayMethod(Day.valueOf(new Scanner(System.in).next()));



    }
}