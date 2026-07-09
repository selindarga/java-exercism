package calculatorconundrum;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        switch (operation) {
            case "*": {
                int result = operand1 * operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + result;
            }
            case "+":{
                int result = operand1 + operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + result;
            }
            case "/": {
                try {
                    int result = operand1 / operand2;
                    return operand1 + " " + operation + " " + operand2 + " = " + result;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            }
            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
    }
}
