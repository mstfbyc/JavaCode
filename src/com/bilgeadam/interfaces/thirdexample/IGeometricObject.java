package com.bilgeadam.interfaces.thirdexample;

import java.util.Date;

public interface IGeometricObject {
    void setColor(String color);
    String getColor();
    void setfilled(boolean filled);
    boolean getfilled();
    Date getDateCreated();
    double getArea();
    double getPerimeter();
}
