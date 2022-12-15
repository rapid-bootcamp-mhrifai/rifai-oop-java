package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        int deret[] = new int[this.logic.n];
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (j <= 2) deret[j] = 1;
                else deret[j] = deret[j - 1] + deret[j - 2] + deret[j - 3];

                if (j >= i && j >= this.logic.n - i - 1
                        || j <= i && j <= this.logic.n - i - 1) {
                    this.logic.array[i][j] = String.valueOf(deret[j]);
                }
            }
        }
    }

    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
