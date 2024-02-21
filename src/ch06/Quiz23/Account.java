package ch06.Quiz23;

public class Account {
    private String ano; // 계좌번호
    private String owner; // 계좌주
    private int balance; // 잔고

    public Account(String ano, String owner, int balance) { //초기값 this를 이용한다
       this.ano = ano;
       this.owner = owner;
       this.balance = balance;
    }


    // get 메소드
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
