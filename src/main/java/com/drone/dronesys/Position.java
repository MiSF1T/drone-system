package com.drone.dronesys;

import java.util.StringJoiner;

public class Position {
    private float x,y;                      //2D co-ordinates for item/drone
    public Position(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return new StringJoiner(
                "|",
                Position.class.getSimpleName() + "[ ",
                "]"
        )
                .add("X=" + x)
                .add("Y=" + y)
                .toString();
    }
}
