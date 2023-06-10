package ch05.sec09;
/**
 * 배열 복사
 * 배열은 한 번 생성하면 길이를 변경할 수 없다.
 * 더 많은 저장공간이 필요하다면 더 큰 길이의 배열을 새로 만들고 이전 배열로부터 항목들을 복사해야한다.
 * <배열 복사 간단한 방법>
 *     System의 arraycopy() 메소드 활용
 *     System.arraycopy(Object scr,     int srcPos,       Object dest, int destPos,           int length);
 *                       원본 배열     원본 배열 복사 시작 인덱스     새 배열    새 배열 붙여넣기 시작 인덱스   복사 항목 수
 */
public class ArrayCopyExample {
    public static void main(String[] args) {
        // 길이 3인 배열
        String[] oldStrArray = {"Java", "array", "copy"};
        // 길이 5인 배열
        String[] newStrArray = new String[5];
        // 배열 항목 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // 배열 항목 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
