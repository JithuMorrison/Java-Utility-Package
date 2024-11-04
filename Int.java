package Jithu;
import java.util.Arrays;
public class Int{
  int[] array;
  Int(int n){
    array=new int[n];
  }
  public void search(int ha){  
   int nope=0;
    for (int i = 0; i < array.length; i++) {
      if (array[i]==ha) {
        System.out.println("Element found at index: "+i);
        nope=1;
      }
    }if(nope==0){System.out.println("Element not found");}
 }  
  public void search(){  
    int ha=A.ival(A.input("Enter key: "));
   int nope=0;
    for (int i = 0; i < array.length; i++) {
      if (array[i]==ha) {
        System.out.println("Element found at index: "+i);
        nope=1;
      }
    }if(nope==0){System.out.println("Element not found");}
 }
  public void reverse(){
    for(int i=0;i<array.length/2;i++){
      int d=array[i];
      array[i]=array[array.length-i-1];
      array[array.length-i-1]=d;
    }
  }
  public Int copy(){
    Int kk = new Int(array.length);
    for(int i=0;i<array.length;i++){
      kk.array[i]=array[i];
    }
    return kk;
  }
  public void append(int mn){
    int siz=array.length+1;
    int ar[] = new int[array.length+1];
    for(int i=0;i<siz-1;i++){
      ar[i]=array[i];
    }
    ar[siz-1]=mn;
    array=ar;
  }
  public void sort(){
    Arrays.sort(array);
  }
  public void insert(int ind,int mn){
    int siz=array.length+1;
    int ar[] = new int[siz];
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
    int ar[] = new int[siz];
    for(int i=0;i<ind;i++){
      ar[i]=array[i];
  }
    for(int i=ind+1;i<siz+1;i++){
      ar[i-1]=array[i];
    }
    array=ar;
  }
  public void remove(int ind){
    int siz=array.length-1;
    int ar[] = new int[siz];
    int m=0;
    for(int i:array){
      if(i==ind){
        continue;
      }
      ar[m]=i;
      m++;
    }
    array=ar;
  }
}