public abstract class Square {
    private String name;
    private int position;

    public Square (String name, int position){
        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        position = position;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}