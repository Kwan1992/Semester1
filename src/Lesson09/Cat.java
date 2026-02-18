package Lesson09;

    /*
     * Subclass: Cat
     */
    public class Cat extends Pet {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Cat: " + getName() + " (meow!)";
        }
    }
