package com.company;

public class NuLLabel extends Label {
    public NuLLabel(){
        super("(none)");
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void display() {
        super.display();
    }
}
