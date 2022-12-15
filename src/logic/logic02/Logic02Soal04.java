package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal04 extends BasicLogic {
    public Logic02Soal04(int n) {
        super(n);
    }
    public void isiArray() {
        int deret[] = new int[this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (j <= 1) deret[j] = 1;
                else deret[j] = deret[j - 1] + deret[j - 2];

                if (j == 0 || i == 0
                        || j == this.n - 1 || i == this.n - 1
                        || j == this.n / 2 || i == this.n / 2) {
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
