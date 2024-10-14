public class Q2{
static void CountingSort(int [] a){
  //Step-1 Finding the maximum element
  int max= a[0];
  for(int i=1; i<a.length;i++){
    if(a[i]>max) max=a[i];
  }
  //Step-2 Creating an auxilary array and filling it frequency wise
  int [] count= new int[max+1];
  //Step-3 Modifying the original Array
  int index=0;
  for(int i=0; i<a.length; i++){
    while(count[i]>0]{
      a[index]=i;
      index++;
      count[i]--;
    }
  }
  
  
}
public static void main(String [] args){
  int [] a= { 4, 2, 2, 8, 3, 3, 1, 7, 6};
  CountingSort(a);
  for(int i=0; i<a.length; i++){
    System.out.print(a[i]+" ");// 1 2 2 3 3 4 6 7 8
  }
}



  
}
