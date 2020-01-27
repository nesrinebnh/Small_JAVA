public class ErrorType {
    private int resultType, errorType;

    public ErrorType(int res, int err){
        this.resultType = res;
        this.errorType = err;
    }

    public int getResultType(){
        return this.resultType;
    }

    public int getErrorType() {
        return errorType;
    }
}
