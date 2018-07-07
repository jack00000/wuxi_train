public class DaoShanJiao {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }

        System.out.println();

       for(int i=1;i<10;i++){
           for(int k=1;k<i;k++){
               System.out.print("\t");
           }
           for(int j=i;j<10;j++){
               System.out.print(i+"*"+j+"="+i*j+"\t");
           }
           System.out.println();
       }


    }
}
