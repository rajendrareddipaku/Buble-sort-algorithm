import java.util.*;
public class Main{
    public void Boblesort(){
        Scanner sc=new Scanner(System.in);
        int values=sc.nextInt();
        int arr[]=new int[values];
        for(int k=0;k<values;k++){
            arr[k]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Main obj=new Main();
        obj.Boblesort();
    }
}