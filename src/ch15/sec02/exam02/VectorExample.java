package ch15.sec02.exam02;
/**
 * <Vector>
 *     ArrayList 와 차이점은 Vector 는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 Vector() 메소드를 실행할 수 없다.
 *     15 라인의 Vector 를 ArrayList 로 바꾸면 결과가 다르다.
 *     이유는 ArrayList 는 두 스레드가 동시에 add() 메소드를 호출할 수 있기 때문에 경합이 발생해 결국은 하나만 저장되기 때문이다.
 *     반면에 Vector 의 add() 는 동기화 메소드이므로 한 번에 하나의 스레드만 실행할 수 있어 경합이 발생하지 않는다.
 * </Vector>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        // Vector 컬렉션 생성
        List<Board> list = new Vector<>();
        //List<Board> list = new ArrayList<>(); // 1955개 나옴

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 0; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
        }

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
