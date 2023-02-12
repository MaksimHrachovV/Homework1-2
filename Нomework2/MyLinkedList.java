package Lesson9Нomework.Нomework2;

public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;
    private class Node<T> {
        private T item;

        private int index;
        private Node<T> prev;
        private Node<T> next;

        private Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.size = 0;
        this.first = null;
    }

    public void add(T item) {
        Node<T> node = new Node<>(item);
        Node<T> currentNode = first;

        if (first == null) {
            first = node;
            last = first;
            first.index = 0;
            size = 1;
            System.out.println("item = " + item);
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            currentNode.next.prev = currentNode;
            last = node;
            last.index = size;
            size++;
            System.out.println("item = " + item);
        }
    }

    public T removeFirst() {
        T firstElement = first.item;
        first = first.next;
        Node<T> current = first;

        first.prev = null;
        first.index = 0;
        size--;

        while (current.next != null) {
            current.next.index--;
            current = current.next;
        }

        return firstElement;
    }

    public T removeLast() {
        T lastElement = last.item;
        last = last.prev;
        last.next = null;
        size--;

        return lastElement;
    }

    public T remove(int index) {
        Node<T> current = first.next;
        T object = null;

        if (first.index == index) {
            object = removeFirst();
        } else if (last.index == index) {
            object = removeLast();
        } else {
            while (current.next != null) {
                if (current.index == index) {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    current.next.index = current.index;
                    object = current.item;
                    current = current.next;

                    while (current.next != null) {
                        current.next.index = current.index += 1;
                        current = current.next;
                    }
                    size--;
                    return object;
                } else {
                    current = current.next;
                }
            }
        }
        return object;
    }

    public T get(int index) {
        Node<T> current = first.next;
        T object = null;

        if (first.index == index) {
            object = first.item;
        } else if (last.index == index) {
            object = last.item;
        } else {
            while (current.next != null) {
                if (current.index == index) {
                    object = current.item;
                    break;
                } else {
                    current = current.next;
                }
            }
        }
        return object;
    }
    public void clear(){
        first=last=null;

        size=0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> currentNode = first;
        while (currentNode.next != null) {
            result.append(currentNode.item.toString()).append(", ");
            currentNode = currentNode.next;
        }
        result.append(last.item.toString());

        return "[" + result + "]";
    }

    public int size(){

        return size;
    }
}
