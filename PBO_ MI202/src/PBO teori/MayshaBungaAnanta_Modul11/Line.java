/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MayshaBungaAnanta_Modul11;

/**
 *
 * @author satri
 */
public class Line implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line(){

    }

    public Line(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength(){ 
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 
        return length; 
    }

    public boolean isGreater(Object a, Object b){
        double line1 = ((Line) a).getLength();
        double line2 = ((Line) b).getLength();

        return line1 > line2;
    }

    public boolean isLess(Object a, Object b){
        double line1 = ((Line) a).getLength();
        double line2 = ((Line) b).getLength();

        return line1 < line2;
    }
    public boolean isEqual(Object a, Object b){
        double line1 = ((Line) a).getLength();
        double line2 = ((Line) b).getLength();

        return line1 == line2;
    }


}
