public class QuadStructure {
    /** this class is declared to structure the quad
     * we need all our quad to have this structure
     * operation label param1 param2
     */
    private String quadString[];
    public QuadStructure(String[] quadString){
        this.quadString = quadString;
    }
    public QuadStructure(String op,String label,String param1,String param2){
        quadString = new String[4];
        quadString[0] = op;
        quadString[1] = label;
        quadString[2] = param1;
        quadString[3] = param2;
    }

    public String get(int i){
        return quadString[i];
    }

    public void set(int i, String s){
        quadString[i] = s;
    }

    /**
     * quad(op,label,param1,param2);
     * @return
     */
    public String toString(){

        return "quad(" + quadString[0]+","+quadString[1]+","+quadString[2]+","+quadString[3]+");";
    }

}
