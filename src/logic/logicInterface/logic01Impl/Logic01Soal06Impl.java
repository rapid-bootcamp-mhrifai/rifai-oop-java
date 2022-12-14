package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal06Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal06Impl(BasicLogic logic) {
        this.logic = logic;
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
                if(a <= this.logic.n){
                    System.out.print(i+"\t\t");
                }
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
    }
}
