import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      BubbleSort.bubbleSort(BubbleSort.list);
      for (int i = 0; i < BubbleSort.list.length; i++)
        System.out.print(BubbleSort.list[i] + " ");
    }
}