package LexicalAnalyse;

public class TokenClass {
    private String name;
    private int declared; // 0=>undeclared 1=>declared
    /** we have three different types in spite of manipulate them as strings
     * it will be easier to assign them an integer value
     * for float_SJ type : 0
     * for int_SJ type : 1
     * for string_SJ type : 2
     */
    private int type;
    private String value;
    private int initialized;/** 1 initialized 0 not*/
    public TokenClass(String name, int declared, int type){
        this.name = name;
        this.declared = declared;
        this.type = type;

    }
    public void setInitialized(int init){
        this.initialized = init;
    }
    public int getInitialized(){
        return this.initialized;
    }
    public void setValue(String val){
        this.value = val;
    }

    public String getValue(){return this.value;}
    @Override
    public String toString(){
        String declaredText = (declared == 0 ) ? "undeclared" : "declared";
        String typeText ;
        if(type == 1) {
            typeText = "float_SJ";
        }else if(type == 0){
            typeText = "int_SJ";
        }else{
            typeText = "string_SJ";
        }
        return name + " "+typeText+" "+declaredText+" "+this.value;
    }

    public String getName(){
        return this.name;
    }

    /**
     * it'll be used to know if the tokens is declared or not
     * @return
     */
    public int getDeclared(){
        return this.declared;
    }
    public int getType(){
        return this.type;
    }
}
