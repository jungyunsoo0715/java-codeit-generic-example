package main.java.boxing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer boxed = 20;
        int unboxed = boxed;
        System.out.println("박싱과 언박싱: " + boxed + ", " + unboxed);
        Integer missing = null;

        try {
            int value = missing;
            System.out.println(value);
        } catch (NullPointerException exception) {
            System.out.println("예상한 오류: null은 언박싱할 수 없습니다.");
        }
        // Integer끼리 ==로 비교하면 숫자가 아니라 같은 객체를 가리키는지 확인합니다.
        // 자바는 자주 쓰는 작은 정수의 Integer 객체를 재사용합니다. 이것을 캐시라고합니다.
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        System.out.println("100의 참조 비교: " + (a == b)); // 100은 같은 Integer 객체를 재사용하는 범위(-128 - 127)에 있으므로 true입니다.
        Integer c = Integer.valueOf(200);
        Integer d = Integer.valueOf(200);
        // 200도 객체를 재사용하는지는 실행 환경에 따라 다릅니다.
        // ==의 결과에 기대지 마세요.
        System.out.println("200의 참조 비교: " + (c == d));
        System.out.println("200의 값 비교: " + c.equals(d));
        List<Integer> numbers = List.of(1, 2, 3);
        System.out.println("래퍼 타입 목록: " + numbers);
        // List<int> invalid;
        // < > 안에는 int대신 Integer처럼 클래스 이름을 씁니다

    }
}
