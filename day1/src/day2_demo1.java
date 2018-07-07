public class day2_demo1 {
    public static void main(String args[]){
        int[] a=new int[20];
        a[0]=1;
        for(int i=0;i<a.length-2;i++){
            a[i+2]=a[i+1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }


}
