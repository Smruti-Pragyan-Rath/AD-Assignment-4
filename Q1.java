public class Q1{
  static void BubbleSprt(int []a){
    int n=a.length;
    for(int i=0; i<n-1;i++{
      for(int j=0; j<n-i-1;j++{
        if(a[j]>a[j+1]{
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
  }
  public static void main(String [] args){
    int [] a= { 25, 7, 19, 81, 44, 61};
    BubbleSprt(a);
    for(int i=0; i<a.lengthl i++){
      System.out.print(a[i]+" "); //7 19 25 44 61 81
    }
  }
}
