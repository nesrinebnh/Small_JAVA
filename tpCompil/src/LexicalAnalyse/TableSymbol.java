package LexicalAnalyse;
import LexicalAnalyse.TokenClass;
import java.util.ArrayList;

/** after checking the semantics of the code
 * we will generate the symbol's table
 */
public class TableSymbol {
    /** it will be use to store tokens
     * tree nodes are the token
     * the format of table is
     * name type declared
     */
    ArrayList<TokenClass> tokens = new ArrayList<>();

    /**get the token
     * if token return null it means it doesn't exist
     * else it already in the table
     * which means double declaration*/
    public TokenClass getToken(String name){
        for(int i = 0; i<tokens.size();i++){
            if(tokens.get(i).getName().compareTo(name) == 0)
                return tokens.get(i);
        }
        return null;
    }

    /** check if the elements exists
     * we already have method getToken but
     * because we will use a lot it's better to
     * have a dirrect method which check for us
     * either it's true or not
     * if it return true it means it exists
     * or it's not the case
     */
     public boolean containsToken(String name){
         return getToken(name) != null;
     }

     /** create a method to add tokens to symbol's table*/
     public void addToken(TokenClass token){
        tokens.add(token);
     }

    /** remove a token from symbol's table with name parameter
     * we have to check first if it exist or not
     * we can't delete unexistant token
     */
    public void deleteToken(String name){
        for(int i = 0; i<tokens.size();i++){
            TokenClass temp = tokens.get(i);
            if(temp.getName().compareTo(name)==0){
                tokens.remove(temp);
            }
        }
    }

    /** remove a token from symbol's table with token as a parameter*/
    public void deleteToken(TokenClass token){
        tokens.remove(token);
    }

    public TokenClass getToken(int i){
        return tokens.get(i);
    }

    public int getSize(){
        return this.tokens.size();
    }





}
