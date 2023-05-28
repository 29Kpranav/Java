
class Area{
    int length,width;

    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
void showArea(){
    System.out.println("Length="+length);
    System.out.println("Width="+width);
}
}
class Volume extends Area{
    int height;
    public void setHeight(int height){
        this.height = height;
    }
    void showVolume(){
        System.out.println("Area="+length*width);
        System.out.println("Height="+height);
        System.out.println("Volume="+length*height*width);
    }
}
public class inheritance3 {
    public static void main(String[] args){
        Volume V = new Volume();
        V.setLength(10);;
        V.setWidth(20);
        V.setHeight(30);
        V.showArea();
        V.showVolume();
    }
}

