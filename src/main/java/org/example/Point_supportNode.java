package org.example;

import java.util.List;
import java.util.UUID;

public class Point_supportNode extends ClassPoint {
    public Point_supportNode() {
        this.NodeName =  UUID.randomUUID();
    }

    public Point_supportNode(double x, double y, double z) {
       this.x =x;
       this.y =y;
       this.z = z;
        this.NodeName =  UUID.randomUUID();

    }

    @Override
    public String toString() {
        return "Point_supportNode{" +
                "NodeName= " + NodeName +
                 ", Node coordinates; XYZ=; " + x + " "+ y +" " + z +" " +
                '}';
    }

    private UUID NodeName ;
private List<Integer> LoadsKn;
    private List<Integer> LoadsKg;



}
