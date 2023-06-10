package ch05.sec03;

/**
 * <참조 타입 변수의 ==, != 연산>
 *     참조 타입 변수의 값은 객체의 번지이므로, 객체의 번지가 같은지 다른지를 비교한다.
 */
public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1; // 배열 변수 arr1 선언
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2; // 배열 변수 arr2의 값을 배열 변수 arr3에 대입

        System.out.println(arr1 == arr2); // 저장 항목은 같지만 서로 다른 배열 객체로 생성됨 -> 번지가 다름
        System.out.println(arr2 == arr3);
    }
}
