package constructor;

public class Humanity {
    public static void main(String[] args) {
        Human humanTwo = new Human();
    }

    private static class Human {
        private int age;

        public Human() {
            this.age = 0;
        }

        public Human(String name, int age) {
            this.age = age;
            System.out.println("Привет из второго конструктора ");
        }

        public Human(int age) {
            this.age = age;
        }

    }
}

