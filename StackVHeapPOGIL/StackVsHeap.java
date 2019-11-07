public class StackVsHeap {
  public static void main(String[] args) {
    World w;
    int distance;
    Turtle t1, t2, t3;
    w = new World();
    t1 = new Turtle(w);
    t2 = new Turtle(w);
    distance = 50;
    t1.forward(distance);   
    t3 = t2; 
    t3.setHeading(600);
    t3.forward(distance*2); 
  }
}
