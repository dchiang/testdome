import java.util.regex.Pattern;

public class UserInput {

    public static class TextInput {
      private String value = "";

      public void add(char c){
        this.value += c;
      }

      public String getValue(){
        return this.value;
      }
    }

    public static class NumericInput extends TextInput {
      public void add(char c){
        if(Pattern.matches("\\d", ""+c)){
          super.add(c);
        }
      }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}