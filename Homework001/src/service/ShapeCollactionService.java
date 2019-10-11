package service;

import java.util.Collection;
import java.util.Iterator;

import com.mainacad.abs.Shape;

public class ShapeCollactionService {
    public static Double getMinShapeArea(Collection<Shape> shapeList){
        if ((shapeList == null) || (shapeList.isEmpty())){
            return null;
        }

        Iterator<Shape> iter = shapeList.iterator();
        Double min = iter.next().getArea();
        while(iter.hasNext()){
            Double areaShape = iter.next().getArea();
            if(areaShape < min) {
                min = areaShape;
            }
        }
        return min;
    }

    public static Double getMaxShapeArea(Collection<Shape> shapeList){
        if ((shapeList == null) || (shapeList.isEmpty())){
            return null;
        }

        Iterator<Shape> iter = shapeList.iterator();
        Double max = iter.next().getArea();
        while(iter.hasNext()){
            Double areaShape = iter.next().getArea();
            if(areaShape > max) {
                max = areaShape;
            }
        }
        return max;
    }


}
