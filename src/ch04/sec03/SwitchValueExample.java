package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        // Java 11 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("Java 11 -> score1: " + score1);

        // Java 12 부터 가능 (1)
        char grade2 = 'B';

        switch (grade2) {
            case 'A', 'a' -> {
                System.out.println("우수");
            }
            case 'B', 'b' -> {
                System.out.println("일반");
            }
            default -> {
                System.out.println("손님");
            }
        }
        // Java 12 부터 가능 (2)
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                // Java 13 부터 가능
                yield result; // 단, 이 경우에는 defalut가 반드시 존재해야 한다.
            }
            default -> 60;
        };
        System.out.println("Java 12, 13 -> score2: " + score2);
    }
}
