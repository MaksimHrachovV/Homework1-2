package Lesson9Нomework.Нomework2;

import Test91.MyLinkedList;

public class Main {
        public static void main(String[] args) {
                Test91.MyLinkedList<Integer> launch = new MyLinkedList<>();
                System.out.println("----------------------------add---------------------------------");
                launch.add(1);
                launch.add(2);
                launch.add(3);
                launch.add(4);
                launch.add(5);
                launch.add(6);
                launch.add(7);
                System.out.println("----------------------------remove-----------------------------");
                System.out.println("myList.remove = " + launch.remove(4));
                System.out.println("myList = " + launch);
                System.out.println("----------------------------get--------------------------------");
                System.out.println("myList.get(num.3) = " + launch.get(3));
                System.out.println("myList = " + launch);
                System.out.println("----------------------------size-------------------------------");
                System.out.println("launch.size() = " + launch.size());
                System.out.println("----------------------------clear------------------------------");
                launch.clear();
                System.out.println("launch.size() = " + launch.size());
        }
}
