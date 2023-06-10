package ch06.sec14;

/**
 * <Setter>
 *     객체의 필드(데이터)를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨질 수 있다.
 *     예를 들어, 자동차의 속력은 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
 *     따라서 직접적인 외부에서의 필드 접근을 막고 대신 메소드를 통해 필드에 접근하는 것을 선호한다.
 *     그 이유는 메소드는 데이터를 검증해서 유효한 값만 필드에 저장할 수 있기 때문이다.
 *     이러한 역할을 하는 메소드가 Setter 이다.
 * <Getter>
 *     외부에서 객체의 필드를 읽을 때에도 메소드가 필요한 경우가 있다.
 *     필드값이 객체 외부에서 사용하기에 부적절할 경우, 메소드로 적절한 값으로 변환해서 리턴할 수 있기 때문이다.
 *     이러한 역할을 하는 메소드가 Getter 이다.
 * <Getter 와 Setter 의 기본 작성 방법>
 *     필요에 따라 Getter 에서 변환 코드를 작성하거나 Setter 에서 검증 코드를 작성할 수 있다.
 *     필드 타입이 boolean 일 경우에는 Getter 는 get 으로 시작하지 않고, is 로 시작하는 것이 관례이다.
 *     Getter 와 Setter 의 접근 제한자는 public 으로 하자.
 *
 *     private 타입 fieldName;
 *
 *     // Getter
 *     public 타입 getFieldName() { return fieldName; }
 *     // Setter
 *     public void setFieldName(타입 fieldName) { this.fieldName = fieldName; }
 */
public class Car {
    // 필드 선언
    private int speed;
    private boolean stop;

    // speed 필드의 Getter / Setter 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    // stop 필드의 Getter / Setter 선언
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }
}
