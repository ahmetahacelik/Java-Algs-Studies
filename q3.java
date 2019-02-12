
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// The class and the main method is provided
// DO NOT EDIT THE MAIN METHOD

public class q3 {
    
    private static char left_p='(';
    private static char right_p=')';
    private static char plus='+';
    private static char mult='*';
    
 public static void main(String[] args) {
  
  try {
   File file = new File(args[0]);
   FileReader fileReader = new FileReader(file);

   // A buffered reader is created to read through the file
   BufferedReader bufferedReader = new BufferedReader(fileReader);

   // line is where each line will be saved
   String line;

   // Each line is read until the end of the file a.k.a EOF
   while ((line = bufferedReader.readLine()) != null) {

    // Your function is called here with the current line
       checkExpressions(line);
   }

   // Closing the file reader since we are done working on it
   fileReader.close();

  // This part catches errors instead of crashing your program
  } catch (IOException e) {
   e.printStackTrace();
  }
 }

public static void checkExpressions(String expression) {
  
  // Write your code here
   int left=0;
   int right=0;
   int operand=0;
   int operator=0;
     
   Pattern p = Pattern.compile("-?\\d+");
   Matcher m = p.matcher(expression);
   while (m.find()) {m.group();operator++;}
   
     for (int i=0;i<expression.length();i++){
             
       if (expression.charAt(i)==left_p){
           left++;}
       else if ((expression.charAt(i)==right_p)){
           right++;}
       else if ((expression.charAt(i)==plus))
       {operand++;}
       else if ((expression.charAt(i)==mult))
       {operand++;}}
                                   
       if (checker(expression)==1){
       
            if (left==right){
               if (operator-operand==1){
              System.out.println(1);}}
            else{
                System.out.println("0");
            }}
       else
           System.out.println("0");         
 }
public static int checker(String expression) {
    
       for (int i=0;i<expression.length();i++)
       if ((expression.charAt(i)==plus || expression.charAt(i)==mult)){
           int y=expression.indexOf(plus);
           int z=expression.indexOf(mult);
                      
                      if (y-z==1||z-y==1){
                           return 0;
                       
}}      
       return 1;
}}
       
  