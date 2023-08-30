package ch13.sec02.exam01;

// 제네릭 타입
public class Product<K, M> {
    // 필드
    private K kind; // 타입 파라미터를 필드 타입으로 사용
    private M Model;

    // 메소드

    public K getKind() { // 타입 파라미터를 리턴 타입과 매개변수 타입으로 사용
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return Model;
    }

    public void setModel(M model) {
        Model = model;
    }
}
