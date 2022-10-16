import java.util.Scanner;
class Main {
   public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int b=sc.nextInt();
      int a[]=new int[b];
      for(int j=0;j<n;j++){
         int count=0,count1=0;
      for(int i=0;i<b;i++){
         a[i]=sc.nextInt();
         if(a[i]%2==0){
            count++;
         }
         else if(a[i]%2!=0){
            count1++;
         }
      }
      if(count>=count1){
      System.out.print(count-count1);
      }
      else
      System.out.print(count1-count);
   }
  }
}