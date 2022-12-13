package logic;

public class Logic01Soal06 extends BasicLogic{
    public Logic01Soal06(int n) {
        super(n);
    }

    public void isiArray(){
        int[] deret = new int[this.n];
        int a = 0;

        for (int i=0; i<= 99; i++){
            int bil=0;
            for (int j=1;j<=i;j++) {
                if (i % j == 0) {
                    bil = bil + 1;
                }
            }
            if (bil==2){
                a+=1;
                if(a <= deret.length){
                    System.out.print(i+"\t");
                }
            }
        }System.out.println("\n");
    }
        /*for (int i=0; i < this.n; i++) {
            int angka=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                    angka = angka+1;
            }
            if(angka==2)
                this.array[0][i]= String.valueOf(i);
        }

         */

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
