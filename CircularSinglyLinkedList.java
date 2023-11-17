public class CircularSinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createCircularSinglyLinkedList(int value) {
    head = new Node();
    Node node = new Node();
    node.value = value;
    node.next = node;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  public void insertCircularSinglyLinkedList(int value, int location) {
    Node node = new Node();
    node.value = value;
    if(head == null) {
      createCircularSinglyLinkedList(value);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
      tail.next = head;
    } else if (location >= size) {
      tail.next = node; 
      tail = node;
      node = head;
    } else {
      Node temp = new Node();
      int index = 0;
      while (index < location - 1) {
        temp = temp.next;
        index++;   
      }
      node.next = temp.next;
      temp.next = node;
    }
    size++;
  }
  
  public void traverseCircularSinglyLinkedList() {
    if(head != null) {
      Node temp = head;
      for(int i = 0; i < size; i++) {
        System.out.print(temp.value);
        if(i != size - 1) {
          System.out.print(" -> ");
        }
        temp = temp.next;
      }
      System.out.println("");
    } else {
      System.out.println("Linked List does not exist");
    }
  }
  
  public boolean searchCircularSinglyLinkedList(int value) {
    if (head != null) {
      Node temp = new Node();
      for(int i = 0; i < size; i++) {
        if(temp.value == value) {
          System.out.println("found node location at " + i);
          return true;
        }
        temp = temp.next;
      }
    }
    System.out.println("Node not found");
    return false;
  }

  public void deleteCircularSinglyLinkedList(int location) {
    if(head == null) {
      System.out.println("The CircularSinglyLinkedList does not exist");
      return;
    } else if(location == 0) {
      head = head.next;
      tail.next = head;
      size--;
      if(size == 0) {
        tail = null;
        head.next = null;
        head = null;
      }
    } else if(location >= size) {
      Node temp = head;
      for(int i = 0; i < size - 1; i++) {
        temp = temp.next;
      }
      if (temp == head) {
        head.next = null;
        tail = head = null;
        size--;
        return;
      }
      temp.next = head;
      tail = temp;
      size--;
    } else {
    Node temp = head;
    for(int i = 0; i < location - 1; i++) {
      temp = temp.next;
    }
      temp.next = temp.next.next;
      size--;
    }

    public void deleteALl() {
      if(head == null) {
        System.out.println("This Linked List");
      } else {
        head = null;
        tail.next = null;
        tail = null;
      }
      
    }
  }
}