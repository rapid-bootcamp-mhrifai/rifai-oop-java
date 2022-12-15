package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal05 extends BasicLogic {
    public Logic02Soal05(int n) {
        super(n);
    }

    public void isiArray() {
        int deret[] = new int[this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (j <= 2) deret[j] = 1;
                else deret[j] = deret[j - 1] + deret[j - 2] + deret[j - 3];

                if (j >= i && j >= this.n - i - 1
                        || j <= i && j <= this.n - i - 1) {
                    this.array[i][j] = String.valueOf(deret[j]);
                }
            }
        }
    }

    public void cetakArray() {
        this.isiArray();
        this.print();
    }
}
