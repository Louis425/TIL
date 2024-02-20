package org.example;

class Friend {
    String name;
    Company com;

    public Friend(String name, Company com) {
        this.name = name;
        this.com = com;
    }

    public String getName() {
        return name;
    }

    public Company getCom() {
        return com;
    }
}
class Company {
    String cName;
    ContInfo contInfo;

    public Company(String cName, ContInfo contInfo) {
        this.cName = cName;
        this.contInfo = contInfo;
    }

    public String getcName() {
        return cName;
    }

    public ContInfo getContInfo() {
        return contInfo;
    }
}
class ContInfo {
    String addr;
    String phone;

    public ContInfo(String addr, String phone) {
        this.addr = addr;
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }
}
public class Main5 {
    public static void main(String[] args) {
        //Friend friend = new Friend("홍길동",new Company("AA",new ContInfo("","")));
        Friend friend = new Friend("홍길동",new Company("AA",null));
        Company com = friend.getCom();
        String d = com.getContInfo().getAddr();  // company 의 주소가 null 값 이라서 NullPointerException 에러 뜸
        System.out.println(d);
    }
}
