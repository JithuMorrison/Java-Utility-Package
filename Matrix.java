package Jithu;
public class Matrix{
  public int r,c;
  int[][] mat = new int[20][20];
  Matrix(){
    this.r = A.ival(A.input("enter rows: "));
    this.c = A.ival(A.input("enter columns: "));
    A.Print("Enter elements: ");
    for(int i=0;i<r;i++){
      String kn=A.input("");
      String[] str= kn.split(" ");
      for(int j=0;j<c;j++){
        mat[i][j]=Integer.parseInt(str[j]);
      }
    }
  }
  Matrix(Matrix m1,Matrix m2){
    this.r=m1.r;
    this.c=m2.c;
  }
  public void display(){
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        A.print(mat[i][j]+" ");
      }
      A.Print("");
    }
  }
  public void addin(Matrix m1,Matrix m2){
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        mat[i][j]=m1.mat[i][j]+m2.mat[i][j];
      }
    }
  }
  public static Matrix add(Matrix m1,Matrix m2){
    if((m1.r==m2.r)&&(m1.c==m2.c)){
    Matrix mat3=new Matrix(m1,m2);
    mat3.addin(m1,m2);
    return mat3;
    }
    else{
      Matrix mat0=new Matrix(m1,m2);
    for(int i=0;i<mat0.r;i++){
      for(int j=0;j<mat0.c;j++){
        mat0.mat[i][j]=0;
      }
    }
    return mat0;
    }
  }
  public void subratin(Matrix m1,Matrix m2){
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        mat[i][j]=m1.mat[i][j]-m2.mat[i][j];
      }
    }
  }
  public static Matrix sub(Matrix m1,Matrix m2){
    if((m1.r==m2.r)&&(m1.c==m2.c)){
    Matrix mat3=new Matrix(m1,m2);
    mat3.subratin(m1,m2);
    return mat3;
    }
    else{
      Matrix mat0=new Matrix(m1,m2);
    for(int i=0;i<mat0.r;i++){
      for(int j=0;j<mat0.c;j++){
        mat0.mat[i][j]=0;
      }
    }
    return mat0;
    }
  }
  public void multiply(Matrix m1,Matrix m2){
        for (int i = 0; i < m1.r; i++) {
            for (int j = 0; j < m2.c; j++) {
                mat[i][j] = 0;
                for (int k = 0; k < m2.r; k++)
                    mat[i][j] += m1.mat[i][k]
                                 * m2.mat[k][j];
            }
        }
    }
  public static Matrix mul(Matrix m1,Matrix m2){
    if(m1.c==m2.r){
    Matrix mat3=new Matrix(m1,m2);
    mat3.multiply(m1,m2);
    return mat3;
    }
    else{
      Matrix mat0=new Matrix(m1,m2);
    for(int i=0;i<mat0.r;i++){
      for(int j=0;j<mat0.c;j++){
        mat0.mat[i][j]=0;
      }
    }
    return mat0;
    }
  }
}