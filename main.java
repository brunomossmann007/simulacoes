import java.util.Scanner;

public class main {

    static void congruenteLinear(int Xo, int m, int a, int c, int[] randomNums, int noOfRandomNums){

    randomNums[0] = Xo;
    for(int i = 1; i < noOfRandomNums; i++){

    randomNums[i] = ((randomNums[i - 1] * a) + c) % m;
}
}


public static void main(String[] args){

int Xo = 0;
int a = 18;
int c = 1;
int m = 5;


int noOfRandomNums = 1000;


int[] randomNums = new int[noOfRandomNums];


congruenteLinear(Xo, m, a, c,
randomNums,
noOfRandomNums);


for(int i = 0; i < noOfRandomNums; i++)
{
System.out.print(randomNums[i] + " ");
}
}
}

