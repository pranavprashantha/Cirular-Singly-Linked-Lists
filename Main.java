class Main {
  public static void main(String[] args) {
    CircularSinglyLinkedList first = new CircularSinglyLinkedList();
    first.createCircularSinglyLinkedList(5);
    System.out.println(first.head.value);
  }
}