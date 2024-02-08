package ch03;

public class Quiz8 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket > 0? 1:0 ); //바구니의 개수
        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }
    // 사과의 개수(numOfApples) / 바구니의 크기(sizeOfBucket)를 해주면 바구니의 수(numOfBucket)를 구할수있다
    //계산하면 정수간의 나눗셈이기 때문에 12가 나온다. 그리고 사과의 개수(numOfApples)를 바구니의 크기(sizeOfBucket)로 나눴을때 나머지가 있으면 하나의 바구니 더 필요하다
    // %를 이용하여 나머지가 발생하는지 확인하고, 나머지가 발생하면 바구니의 개수(numOfBucket)에 1을 더해줘야 한다.
    // 그래서, 나머지 1이 발생하기 때문에 1을 12에 더해줘서 필요한 바구니의 수는 13이 된다.


    }

