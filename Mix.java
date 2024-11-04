package Jithu;
class Node {
  int data;
  String dat;
  double da;
  String type="hi";
  Node prev;
  Node next;
  public Node (int data) {
    this.dat="";
    this.da=0;
    this.data = data;
    this.type="int";
    this.prev = null;
    this.next = null;
  }
  public Node (String data) {
    this.data=0;
    this.da=0;
    this.dat = data;
    this.type="string";
    this.prev = null;
    this.next = null;
  }
  public Node (double data) {
    this.data=0;
    this.da=data;
    this.dat = "";
    this.type="double";
    this.prev = null;
    this.next = null;
  }
}
public class Mix {
  Node head;
  Node tail; 
  int siz=0;
  public Mix () {
    this.head = null;
    this.tail = null;
  }
  public static Mix create() {
    Mix mix1 = new Mix();
    return mix1;
  }
  public static Mix create(int n) {
    Mix mix1 = new Mix();
    Node newNode;
    for(int i=0;i<n;i++){
      String data=A.input("");
      if(A.isNum(data)&&(A.ival(data)==A.eval(data))){
        int kk=A.ival(data);
        newNode = new Node (kk);
      }
      else if(A.isNum(data)&&(A.ival(data)!=A.eval(data))){
        double jk=A.eval(data);
        newNode = new Node (jk);
      }
      else{
      newNode = new Node (data);
      }
      if (mix1.head == null) {
        mix1.head = newNode;
        mix1.tail = newNode;
      } else {
        mix1.tail.next = newNode;
        newNode.prev = mix1.tail;
        mix1.tail = newNode;
      }
    }
    mix1.siz+=n;
    return mix1;
  }
  public void addnode(int data) {
    Node newNode = new Node (data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    siz++;
  }
  public void addnode(String data) {
    Node newNode = new Node (data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    siz++;
  }
  public void addnode(double data) {
    Node newNode = new Node (data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    siz++;
  }
  public void delete(int n) {
    Node current = head;
    if (head == null) {
      System.out.println ("List is empty");
      return;
    }
    for(int i=0;i<n;i++) {
      if(current.type.equals("int")){
        current = current.next;
      }
      else if(current.type.equals("string")){
        current = current.next;
      }
      else if(current.type.equals("double")){
        current = current.next;
      }
      else{}
    }
    current.prev.next = current.next;
    siz--;
  }
  public void insert(int n) {
    Node current = head;
    if (head == null) {
      System.out.println ("List is empty");
      return;
    }
    for(int i=0;i<n;i++) {
      if(current.type.equals("int")){
        current = current.next;
      }
      else if(current.type.equals("string")){
        current = current.next;
      }
      else if(current.type.equals("double")){
        current = current.next;
      }
      else{}
    }
    Node newNode;
    String data=A.input("");
      if(A.isNum(data)&&(A.ival(data)==A.eval(data))){
        int kk=A.ival(data);
        newNode = new Node (kk);
      }
      else if(A.isNum(data)&&(A.ival(data)!=A.eval(data))){
        double jk=A.eval(data);
        newNode = new Node (jk);
      }
      else{
      newNode = new Node (data);
      }
    current.prev.next = newNode;
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev = newNode;
    siz++;
  }
  public void insert(String data,int n) {
    Node current = head;
    if (head == null) {
      System.out.println ("List is empty");
      return;
    }
    for(int i=0;i<n;i++) {
      if(current.type.equals("int")){
        current = current.next;
      }
      else if(current.type.equals("string")){
        current = current.next;
      }
      else if(current.type.equals("double")){
        current = current.next;
      }
      else{}
    }
    Node newNode=new Node (data);
    current.prev.next = newNode;
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev = newNode;
    siz++;
  }
  public void insert(int data,int n) {
    Node current = head;
    if (head == null) {
      System.out.println ("List is empty");
      return;
    }
    for(int i=0;i<n;i++) {
      if(current.type.equals("int")){
        current = current.next;
      }
      else if(current.type.equals("string")){
        current = current.next;
      }
      else if(current.type.equals("double")){
        current = current.next;
      }
      else{}
    }
    Node newNode=new Node (data);
    current.prev.next = newNode;
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev = newNode;
    siz++;
  }
  public void insert(double data,int n) {
    Node current = head;
    if (head == null) {
      System.out.println ("List is empty");
      return;
    }
    for(int i=0;i<n;i++) {
      if(current.type.equals("int")){
        current = current.next;
      }
      else if(current.type.equals("string")){
        current = current.next;
      }
      else if(current.type.equals("double")){
        current = current.next;
      }
      else{}
    }
    Node newNode=new Node (data);
    current.prev.next = newNode;
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev = newNode;
    siz++;
  }
  public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}