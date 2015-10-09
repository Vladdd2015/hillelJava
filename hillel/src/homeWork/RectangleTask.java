package homeWork;

/**
 * Created by Влад on 09.10.2015.
 */
public class RectangleTask {

    int perimetr;
    int area;

    public RectangleTask(int perimetr,int area){
        this.perimetr = perimetr;
        this.area = area;

    }
    double d = (perimetr/2) * (4*area);
    double height = ((perimetr/2) - Math.sqrt(d))/2;
    double width = ((perimetr/2) + Math.sqrt(d))/2;
}
