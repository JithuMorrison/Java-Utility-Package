package Jithu;
import java.io.*;
public class A{
  public static String input(String pri){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String var="";
    System.out.print(pri);
    try{
    var=in.readLine();
    }catch (IOException e) {
    System.out.println("Can't read a");
}
    return var;
  }
  public static void Print(String pri){
      System.out.println(pri);
  }
  public static void Print(String prio,Str pri){
    System.out.println(prio);
    for(String x : pri.array){
      System.out.println(x);
    }
  }
  public static void Print(String prio,Int pri){
    System.out.println(prio);
    for(int x : pri.array){
      System.out.println(x);
    }
  }
  public static void Print(Int pri){
    for(int x : pri.array){
      System.out.println(x);
    }
  }
  public static void Print(int pri){
      System.out.println(""+pri);
  }
  public static void Print(double pri){
      System.out.println(""+pri);
  }
  public static void print(String pri){
        System.out.print(pri);
    }
  public static void print(int pri){
        System.out.print(""+pri);
    }
  public static void print(double pri){
        System.out.print(""+pri);
    }
  public static void print(String prio,Str pri){
      System.out.println(prio);
      for(String x : pri.array){
        System.out.print(x+" ");
      }
    Print("");
    }
  public static void print(String prio,Int pri){
      System.out.println(prio);
      for(int x : pri.array){
        System.out.print(x+" ");
      }
    Print("");
    }
  public static void print(Int pri){
      for(int x : pri.array){
        System.out.print(x+" ");
      }
    Print("");  
    }
  public static void print(Mix man) {
      Node current = man.head;
      if (man.head == null) {
        System.out.println ("List is empty");
        return;
      }
      while (current != null) {
        if(current.type.equals("int")){
          System.out.print(current.data + " ");
          current = current.next;
        }
        else if(current.type.equals("string")){
          System.out.print(current.dat + " ");
          current = current.next;
        }
        else if(current.type.equals("double")){
          System.out.print(current.da + " ");
          current = current.next;
        }
        else{}
      }
      System.out.println();
  }
  public static int ival(String pro){
    if(isNum(pro)){
      double data = Double.parseDouble(pro);
      int val=(int)data;
      return val;
    }else{return 0;}
  }
  public static double eval(String pro){
    if(isNum(pro)){
      double data = Double.parseDouble(pro);
      return data;
    }else{return 0;}
  }
  public static boolean isNum(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
  public static int sum(int ... args){
        int su = 0;
        for(int x: args){
            su += x;
        }
        return su;
    }
  public static int exp(int x, int y){
    int s = 1;
    for(int i = 0; i < y; i++){
      s *= x;
    }
    return s;
  }
  public static int exp(int ... args){
    int s = 1;
    int k=0;
    int c=1;
    for(int x: args){
      if(c>1){
      s *= x;
      }
      else{k=x;}
      c++;
    }
    c=1;
    for(int i = 0; i < s; i++){
      c *= k;
    }
    return c;
  }
  public static Str list(String ... args){
        Str str = new Str(args.length);
        int su = 0;
        for(String x: args){
          str.array[su]=x;
          su++;
        }
        return str;
    }
  public static Int list(int ... args){
        Int lis = new Int(args.length);
        int su = 0;
        for(int x: args){
          lis.array[su]=x;
          su++;
        }
        return lis;
    }
  public static String reverse(String s){
    StringBuilder input1 = new StringBuilder();
    input1.append(s);
    input1.reverse();
    return input1.toString();
  }
  public static Str reverse(Str s){
    Str ret=new Str(s.array.length);
    for(int i=0;i<s.array.length/2;i++){
      ret.array[i]=s.array[s.array.length-i-1];
    }
    return ret;
  }
  public static Int reverse(Int s){
    Int ret=new Int(s.array.length);
    for(int i=0;i<s.array.length/2;i++){
      ret.array[i]=s.array[s.array.length-i-1];
    }
    return ret;
  }
  public static String str(int k){
    return ""+k;
  }
  public static String str(double k){
    return ""+k;
  }
  public static Int copy(Int array){
    Int kk = new Int(array.array.length);
    for(int i=0;i<array.array.length;i++){
      kk.array[i]=array.array[i];
    }
    return kk;
  }
  public static Str copy(Str array){
    Str kk = new Str(array.array.length);
    for(int i=0;i<array.array.length;i++){
      kk.array[i]=array.array[i];
    }
    return kk;
  }
  public static int max(int ... args){
    int max = args[0];
    for(int x: args){
      if(x>max){
        max=x;
      }
    }
    return max;
  }
  public static int max(Int ma){
    int max = ma.array[0];
    for(int x: ma.array){
      if(x>max){
        max=x;
      }
    }
    return max;
  }
  public static int min(int ... args){
    int min = args[0];
    for(int x: args){
      if(x<min){
        min=x;
      }
    }
    return min;
  }
  public static int min(Int mi){
    int min = mi.array[0];
    for(int x: mi.array){
      if(x<min){
        min=x;
      }
    }
    return min;
  }
  public static String max(String ... args){
    String max = args[0];
    for(String x: args){
      if(x.compareTo(max)>0){
        max=x;
      }
    }
    return max;
  }
  public static String max(Str ma){
    String max = ma.array[0];
    for(String x: ma.array){
      if(x.compareTo(max)>0){
        max=x;
      }
    }
    return max;
  }
  public static String min(String ... args){
    String min = args[0];
    for(String x: args){
      if(x.compareTo(min)<0){
        min=x;
      }
    }
    return min;
  }
  public static String min(Str mi){
    String min = mi.array[0];
    for(String x: mi.array){
      if(x.compareTo(min)<0){
        min=x;
      }
    }
    return min;
  }
}