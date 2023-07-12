public class rectangle{
     float length= 1.0f;
     float width= 1.0f;
    rectangle(){
        this.length= 1.0f;
        this.width= 1.0f;
    }
    rectangle(float length, float width){
        this.length= length;
        this.width= width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float Width) {
        this.width = Width;
    }

    public float getArea(){
        return length*width;
    }
    public float getperimeter(){
        return 2*(length+width);
    }
    public String toString(){
        return "rectangle[length="+length+",width="+width+"]";
    }

}