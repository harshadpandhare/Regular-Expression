import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Reggie {
  public static void main(String[] args) {
    Console console = System.console();
    // Your amazing code below
    String zipCode = "90210";
    if(zipCode.matches("^\\d{5}(-\\d{4})?$")){
      System.out.printf("%s is valid zipcode%n", zipCode);
    }
    else {
      System.out.printf("%s is NOT valid zipcode%n", zipCode);
    }
    String skills = "JavaScript,HTML, CSS, and Java";
    for (String skill : skills.split("\\W+(and\\W+)?")){
    
      System.out.printf("Skill: %s %n", skill);
    }
    String script = "Surely capturing sushes shall show how beneficial Regular Expressions acually are";
  Pattern pattern = Pattern.compile("(\\w*(sh|ti|su)\\w*)",Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(script);  
    while (matcher.find()) {
      System.out.printf("%s is sushi word because of %s.  %n", matcher.group(1),matcher.group(2));
    }
  
  
  }
}