package homeWork;

/**
 * Created by Влад on 09.10.2015.
 */
public class RectangleTask {

  private  double perimetr;
  private  double area;


    public RectangleTask(double perimetr,double area){
        this.perimetr = perimetr;
        this.area = area;




    }
    public boolean hasSolution(){
       return  ((perimetr/2) * (4*area))>0;

    }


    public Rectangle getRectangle(){

        if (hasSolution() == true) {


            double d = ((Math.pow(perimetr / 2, 2)) - (4 * area));
            double height = ((perimetr / 2) - Math.sqrt(d)) / 2;
            double width = ((perimetr / 2) + Math.sqrt(d)) / 2;



            Rectangle rectangle = new Rectangle(height, width);

            return rectangle;

        }
            return null;

    }
}





