package constructor;

public class Animals {
    public static void main(String[] args) {

        Cat murka = new Cat();
        System.out.println(murka.sum(100, 200));

        Student student1 = new Student();
        student1.setName("Lizzi");
        String name = student1.getName();

        System.out.println(student1.getName());
    }

    public static class Cat {
        private double weight;
        private int minWeight = 100;
        private int maxWeight = 200;

        public Cat() {
            weight = 150 + 300 * Math.random() * 10;

        }

        int sum(int a, int b) {
            int x;
            x = a + b;
            return x;
        }
    }

    public static class Student {
        private String name;
        private String name1;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name1 = name;
        }

    }
}
