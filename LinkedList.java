import java.util.*;

public class LinkedList {

  static Scanner sc = new Scanner(System.in);

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public Node head = null;
  public Node tail = null;

  // addNode
  public void addNode(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      tail.next = newNode;
    }
    tail = newNode;

    System.out.println("Added :)");
  }

  // display
  public void display() {
    if (head == null) {
      System.out.println("Empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

  }

  // delete
  public void delete(int data) {
    Node temp = head, prev = null;
    if (temp != null && temp.data == data) {
      head = temp.next;
      return;
    }
    while (temp != null && temp.data != data) {
      prev = temp;
      temp = temp.next;
    }
    if (temp == null) {
      return;
    }

    if (temp == tail) {
      tail = prev;
      tail.next = null;
      return;
    }

    prev.next = temp.next;
    // System.out.println("Deleted :)");

  }

  // insertAfter
  public void insertAfter(int nextTo, int data) {
    Node newNode = new Node(data);
    Node temp = head;

    while (temp != null && temp.data != nextTo) {
      temp = temp.next;
    }

    if (temp == null) {
      return;
    }

    if (temp == tail) {
      tail.next = newNode;
      tail = newNode;
      return;
    }

    newNode.next = temp.next;
    temp.next = newNode;

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    System.out.println("LINKED LIST");
    System.out.println("------------");

    System.out.println("1.Insert");
    System.out.println("2.Delete");
    System.out.println("3.Insert After");
    System.out.println("4.Display");
    System.out.println("5.Exit");

    int choice =0;
    while(choice !=5){
      System.out.println("Enter The Choice");
       choice = sc.nextInt();
      int data;
  
      switch (choice) {
        case 1:
          System.out.println("Enter The Data To Add");
          data = sc.nextInt();
          list.addNode(data);
          break;
        case 2:
          System.out.println("Enter The Data To Delete");
          data = sc.nextInt();
          list.delete(data);
          break;
        case 3:
          System.out.println("Enter The Data To Add");
          data = sc.nextInt();
          System.out.println("Enter The Previous Data");
          int prev = sc.nextInt();
          list.insertAfter(prev, data);
          break;
        case 4:
          System.out.println("List:-");
          list.display();
          break;
        case 5:
          break;
        default:
          System.out.println("Wrong Choice");
      }
    }

  }

}
