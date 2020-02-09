package com.company;

//value의 변화를 잘 표현하는 이벤트 클래스
public class ValueChangeEvent {
    private final Value source;

    public ValueChangeEvent(Value source) {
        this.source = source;
    }
    public Value getSource(){
        return  source;
    }
}
