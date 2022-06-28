import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class max_heap {

    private ArrayList<Integer> heap;

    public max_heap() {

        heap = new ArrayList<>();
        heap.add(1000000); // 0번째 인덱스 사용 X

    }

    public void insert(int x) {

        heap.add(x);
        int index = heap.size() - 1;

        while (index > 1 && heap.get(index / 2) < heap.get(index)) {

            // swap
            int tmp = heap.get(index / 2);
            heap.set(index / 2, heap.get(index));
            heap.set(index, tmp);

            index = index / 2;
        }

    }

    public int delete() {

        if (heap.size() - 1 < 1)
            return 0;

        int deleteItem = heap.get(1);

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 1;
        while ((index * 2) < heap.size()) {
            int max = heap.get(index * 2);
            int maxIndex = index * 2;

            if (((index * 2 + 1) < heap.size()) && max < heap.get(index * 2 + 1)) {
                max = heap.get(index * 2 + 1);
                maxIndex = index * 2 + 1;
            }

            if (heap.get(index) > max)
                break;

            // swap
            int tmp = heap.get(index);
            heap.set(index, heap.get(maxIndex));
            heap.set(maxIndex, tmp);

            index = maxIndex;
        }

        return deleteItem;

    }

    public void printHeap() {

        System.out.println("*** RESULT ***");
        for (int i = 1; i < heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        max_heap heap = new max_heap();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                System.out.println(heap.delete());
            } else {
                heap.insert(x);
            }
        }

        heap.printHeap();

    }

}