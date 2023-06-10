package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // 키가 같기 때문에 제일 마지막에 저장한 값만 저장
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "홍길동";
        int value = map.get(key); // 키를 매개값으로 주면 값을 리턴
        System.out.println(key + " : " + map.get("홍길동"));
        System.out.println();

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        // ketSet() 은 key 들을 Set<T> 로 리턴
        Set<String> keySet = map.keySet(); // 키의 타입이 String 이다.
        Iterator<String> keyIterator = keySet.iterator(); // 키를 반복하기 위해 반복자를 얻음
        while (keyIterator.hasNext()) { // 키에서 가져올 거 있음 가져와
            String k = keyIterator.next(); // 가져오는게 키
            Integer v = map.get(k); // key 를 가지고 value 값 얻기
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        // Set<___> Set 의 타입은 Entry 타입   ->   Entry<___,___> Entry 의 타입도 제네릭 타입
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}
