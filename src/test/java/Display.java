public class Display {
    private int uplimit;
    private int value=0;

    public Display(int uplimit) {
        this.uplimit = uplimit;
    }
    public void tick(){
        value=value+1;
        if (value==uplimit){
            value=0;
        }
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args){
        Display d = new Display(24);
        while(true){
            d.tick();
            System.out.println(d.getValue());
        }
    }
}
