package com.example.junit;

public class GetCode {
    String name;
    String area;

    // コンストラクタその1
    public GetCode() {
    }

    // コンストラクタその2
    public GetCode(String name, String area) {
        this.name = name;
        this.area = area;
    }

    // nameのgetter
    public String getName() {
        return name;
    }

    // areaのgetter
    public String getArea() {
        return area;
    }

    // nameのsetter
    public void setName(String name) {
        this.name = name;
    }

    // areaのsetter
    public void setArea(String area) {
        this.area = area;
    }
}
