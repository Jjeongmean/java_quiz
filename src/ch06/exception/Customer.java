package ch06.exception;

public class Customer {
     private String customerName; //고객이름
     private String tel; //핸드폰 번호
     private String address; //집주소
     private int point; //포인트

    public Customer(String customerName, String tel, String address, int point) {
        this.customerName = customerName;
        this.tel = tel;
        this.address = address;
        this.point = point;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

