import java.util.LinkedList;

public class QuadMethods {
    /** this class is used to store all the quads and manipulate them
     * we will have a program and we need to generate quad for each instruction
     * for that we need a list which saves all our quads
     */
    LinkedList<QuadStructure> quad = new LinkedList<>();

    /**add the generated quad to the list
     * the method will return an int so we can know if the quad is insered correctly or not*/
    public int addQuad(String op,String label,String param1,String param2){
        return addQuad(new QuadStructure(op,label,param1,param2));
    }



    /**add the generated quad like it is and return the new size of quad
     *
     */
    public int addQuad(QuadStructure q){
        quad.add(q);
        return quad.size();
    }

    public QuadStructure getQuad(int i){
        return quad.get(i);
    }
    /** methode to return the size of the quad*/
    public int size(){
        return quad.size();
    }
}

