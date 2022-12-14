package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int N = 1;
        int N1 = 1;
        int N2 = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(N);
            int sum = N + N1 + N2;
            N = N1;
            N1 = N2;
            N2 = sum;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.logic.printSingle();
    }
}
