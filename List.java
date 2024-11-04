package Jithu;
public class List{
  public static Int create(int n){
    Int ne = new Int(n);
    for(int i=0;i<n;i++){
      ne.array[i]=A.ival(A.input(""));
    }
    return ne;
  }
  public static Str create(String n){
    int val;
    if(A.isNum(n)){
      double data = Double.parseDouble(n);
      val=(int)data;
    }else{val=1;}
    Str ne=new Str(val);
    for(int i=0;i<val;i++){
      ne.array[i]=A.input("");
    }
    return ne;
  }
}