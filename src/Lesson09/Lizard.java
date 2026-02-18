package Lesson09;

    public class Lizard extends Pet {

        public Lizard(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Lizard: " + getName() + " (sssss 🦎)";
        }
    }

