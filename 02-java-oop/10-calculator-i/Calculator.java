public class Calculator implements java.io.Serializable{
    //attributes
    private double operandOne;
    private double operandTwo;
    private char operation;
    private double results;

    //constructor
    public Calculator(){
    }

    //setters getters
    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }
    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }
    public void setOperation(char operation){
        this.operation = operation;
    }
    public void setResults(double res){
        this.results = res;
    }
    public double getOperandOne(){
        return this.operandOne;
    }
    public double getOperandTwo(){
        return this.operandTwo;
    }
    public char getOperation(){
        return this.operation;
    }
    public double getResults(){
        return this.results;
    }

    //class methods
    public void performOperation(){
        if(this.operation == '+'){
            setResults(this.operandOne + this.operandTwo);
        }
        else if(this.operation == '-'){
            setResults(this.operandOne - this.operandTwo);
        }
    }
}