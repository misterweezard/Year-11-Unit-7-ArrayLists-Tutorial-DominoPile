public class Domino {
    private int top;
    private int bottom;

    public Domino (int x, int y){
        top = x;
        bottom = y;
    }
    public Domino(){
        top = 0;
        bottom = 0;
    }

    public int getTop(){
        return(top);
    }
    public int getBottom(){
        return(bottom);
    }

    public void setTop(int x){
        top = x;
    }
    public void setBottom(int y){
        bottom = y;
    }
    public String toString(){
        return(top + "/" + bottom);
    }
    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle(){
        if (top > bottom) flip();
    }
    public int compareTo(Domino other){
        other.settle();
        settle();

        if (getBottom() == other.getBottom()) {
            return Integer.compare(getTop(), other.getTop());
        }
        return Integer.compare(getBottom(), other.getBottom());
    }
    public int compareToWeight(Domino other){
        int a = this.getBottom() + this.getTop();
        int b = other.getBottom() + other.getTop();

        return Integer.compare(a, b);
    }

    public boolean canConnect(Domino other){
        return (this.getTop() == other.getTop()) || (this.getTop() == other.getBottom()) || (this.getBottom() == other.getTop()) || (this.getBottom() == other.getBottom());
    }
}