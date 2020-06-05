package com.learn;

public class Activist {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void executeAction() {
        action.doAction();
    }
}
