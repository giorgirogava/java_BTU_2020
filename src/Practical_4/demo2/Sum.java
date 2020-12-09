package Practical_4.demo2;

interface sumable {
    int sum(int x, int y);
}

public class Sum {

    public static void main(String[] args) {

        sumable sumable = (par1, par2) -> par1 + par2;

        System.out.println(sumable.sum(16, 7));

    }
}
