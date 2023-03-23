abstract class Square implements Shape {

    private double length;

    private Square (double length){
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

}
