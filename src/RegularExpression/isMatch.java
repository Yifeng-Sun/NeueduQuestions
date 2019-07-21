package RegularExpression;

import java.util.Scanner;

public class isMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String.");
        System.out.print('>');
        String str = new String(sc.nextLine());
        System.out.println("Input the rule.");
        System.out.print('>');
        String rule = new String(sc.nextLine());
        if(rule.matches("^([a-z]*\\**\\.*)*(\\**[a-z]*\\.*)*(\\.*\\**[a-z]*)$") && str.matches("[a-z]*")){
            String standard = "";
            char ruleChar[] = rule.toCharArray();
            for(char c : ruleChar){
                if(c != '.'){
                    standard = standard + c;
                }if(c == '.'){
                    standard = standard + "[a-z]";
                }
            }
            if(str.matches(standard)){
                System.out.print("Match！");
            }else System.out.print("Nay!");
        }else System.out.print("Invalid input.");


    }
}
