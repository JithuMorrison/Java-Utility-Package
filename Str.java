package Jithu;
import java.util.Arrays;
public class Str{
  String[] array;
  Str(int n){
    array=new String[n];
  }
  public void search(String ha){
    int nope=0;
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(ha)) {
        System.out.println("Element found at index: "+i);
        nope=1;
      }
    }if(nope==0){System.out.println("Element not found");}
  }
  public void search(){
    String ha=A.input("Enter key: ");
    int nope=0;
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(ha)) {
        System.out.println("Element found at index: "+i);
        nope=1;
      }
    }if(nope==0){System.out.println("Element not found");}
  }
  public void reverse(){
    for(int i=0;i<array.length/2;i++){
      String d=array[i];
      array[i]=array[array.length-i-1];
      array[array.length-i-1]=d;
    }
  }
  public Str copy(){
    Str kk = new Str(array.length);
    for(int i=0;i<array.length;i++){
      kk.array[i]=array[i];
    }
    return kk;
  }
  public void append(String mn){
    int siz=array.length+1;
    String ar[] = new String[array.length+1];
    for(int i=0;i<siz-1;i++){
      ar[i]=array[i];
    }
    ar[siz-1]=mn;
    array=ar;
  }
  public void sort(){
    Arrays.sort(array);
  }
  public void insert(int ind,String mn){
    int siz=array.length+1;
    String ar[] = new String[siz];
    for(int i=0;i<ind;i++){
      ar[i]=array[i];
    }
    ar[ind]=mn;
    for(int i=ind+1;i<siz;i++){
      ar[i]=array[i-1];
    }
    array=ar;
  }
  public void iremove(int ind){
    int siz=array.length-1;
    String ar[] = new String[siz];
    for(int i=0;i<ind;i++){
      ar[i]=array[i];
  }
    for(int i=ind+1;i<siz+1;i++){
      ar[i-1]=array[i];
    }
    array=ar;
  }
  public void remove(String ind){
    int siz=array.length-1;
    String ar[] = new String[siz];
    int m=0;
    for(String i:array){
      if(i.equals(ind)){
        continue;
      }
      ar[m]=i;
      m++;
    }
    array=ar;
  }
}