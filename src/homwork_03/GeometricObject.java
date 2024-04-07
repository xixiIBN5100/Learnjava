package homwork_03;
import java.util.Date;
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dataCreated;

    protected GeometricObject(){
        color = "黄色";
        filled = false;
    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public boolean isFilled() {
        return !filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
