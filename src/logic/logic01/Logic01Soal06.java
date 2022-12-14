package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal06 extends BasicLogic {
    public Logic01Soal06(int n) {
        super(n);
    }

    public void isiArray() {
        int a = 0;

        for (int i=0; i<= 99; i++){
            int bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                a+=1;
                if(a <= this.n){
                    System.out.print(i+"\t\t");
                }
            }
        }

    }

    public void cetakArray(){
        this.isiArray();
    }
}
