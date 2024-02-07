/**
 * The Calculator class is used for performing mathematical calculations.
 */

class Calculator extends Extendedclass{
  /**
   * The function "addition" takes two float operands and returns their sum.
   * 
   * @param operand_1 The first operand for addition. It is a float data type.
   * @param operand_2 The operand_2 parameter is a float data type, which means it can store decimal
   * numbers.
   * @return The sum of operand_1 and operand_2 is being returned.
   */
    float addition(float operand_1,float operand_2){
        return(operand_1 + operand_2);
    }
   /**
    * The function "subtraction" takes two float operands and returns their difference.
    * 
    * @param operand_1 The first operand for subtraction. It is a float data type.C
    * @param operand_2 The second operand in the subtraction operation.
    * @return the result of subtracting operand_2 from operand_1.
    */
    float subtraction(float operand_1,float operand_2){
        return(operand_1 - operand_2);
    }
   /**
    * The function "multiplication" takes two float operands and returns their product.
    * 
    * @param operand_1 The first operand of the multiplication operation. It is a floating-point
    * number.
    * @param operand_2 The second operand in the multiplication operation.
    * @return the product of the two operands, which is the result of multiplying operand_1 and
    * operand_2.
    */
    float multiplication(float operand_1,float operand_2){
    return(operand_1 * operand_2);
}
/**
 * The division function takes two float operands and returns their quotient.
 * 
 * @param operand_1 The first operand of the division operation. It is a float data type.
 * @param operand_2 The second operand in the division operation.
 * @return The division of operand_1 by operand_2 is being returned.
 */

    float division(float operand_1,float operand_2){
    return(operand_1 / operand_2);
    }


 // The `public static void main(String[] args)` method is the entry point of the Java program. It is
 // the method that is executed when the program starts running. It is a special method that allows the
 // program to be executed as a standalone application. The `args` parameter is an array of strings
 // that can be used to pass command-line arguments to the program.
 public static void main(String[] args) {
    // The code `Calculator calc=new Calculator(); Calculator Exp=new Calculator();` is creating two
    // instances of the Calculator class. The first instance is assigned to the variable `calc`, and
    // the second instance is assigned to the variable `Exp`. These instances can be used to call the
    // methods of the Calculator class and perform mathematical calculations.
    Calculator calc=new Calculator();
    Calculator Exp=new Calculator();

    float operand_1=10;
    float operand_2=5;
    float add_result=calc.addition(operand_1,operand_2);
    System.out.println("result of addition"+add_result);
    float sub_result=calc.subtraction(operand_1,operand_2);
    System.out.println("result of subtraction"+sub_result);
    float mult_result=calc.multiplication(operand_1,operand_2);
    System.out.println("result of multiplication"+mult_result);
    float div_result=calc.division(operand_1,operand_2);
    System.out.println("result of division"+div_result);

    float squ_result=Exp.square(operand_1);
    System.out.println("result of square"+squ_result);
    float cub_result=Exp.cube(operand_1);
    System.out.println("result of cube"+cub_result);
    float mod_result=Exp.mod(operand_1,operand_2);
    System.out.println("result of modulus"+mod_result);

}
}