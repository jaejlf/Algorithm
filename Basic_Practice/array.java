import java.util.*;

public class array {
    public static void main(String[] args) {

        ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 타입 지정
        ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략
        //ArrayList<Integer> integers3 = new ArrayList<>(10); -> 초기 용량(Capacity) 설정
        //ArrayList<Integer> integers4 = new ArrayList<>(integers1); -> 다른 Collection값으로 초기화
        ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1)); // Arrays.asList()

        /*
            값 추가/수정/삭제
        */
        // 값 추가
        integers1.add(10);
        integers1.add(20);
        integers1.add(30);
        System.out.println(integers1);
        System.out.println(integers1.get(0)); // 특정 인덱스의 값 가져오기

        // 값 수정
        integers1.set(0, 100);
        System.out.println(integers1);

        // 값 삭제
        integers1.remove(0); // 인덱스를 통해 삭제
        System.out.println(integers1);

        integers1.remove(Integer.valueOf(20)); // 값을 통해 삭제
        System.out.println(integers1);

        // integers1.clear(); //-> 리스트 전체 삭제

        /*
            removeAll - 특정 element를 모두 삭제
        */
        integers2.add(1);
        integers2.add(1);
        integers2.add(2);
        System.out.println(integers2);

        integers2.removeAll(Arrays.asList(Integer.valueOf(1)));
        System.out.println(integers2);

        /*
            정렬
        */
        System.out.println(integers5);

        Collections.sort(integers5); // 오름차순
        System.out.println(integers5);

        Collections.sort(integers5, Collections.reverseOrder()); // 내림차순
        System.out.println(integers5);

        /*
            for Loop
        */
        for (Object obj : integers5) {
            System.out.println(obj);
        }

        /*
            element 존재 여부 확인
        */
        System.out.println(integers5.contains(3));
        System.out.println(integers5.contains(99));

        /*
            Array
        */ 
        int[] arr1 = { 2, 3, 1, 378, 19, 25 };
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        Arrays.fill(arr2, 100);
        System.out.println(Arrays.toString(arr2));

        int[][] arr3 = new int[3][5];
        System.out.println(arr3.length); // 행의 수
        System.out.println(arr3[0].length); // 열의 수

    }
}
