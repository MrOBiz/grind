package obj2;

import java.util.Scanner;

public class Tokens {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String sentence;
        System.out.println("Write a sentence :");
        sentence = input.nextLine();
        TokenizableString toToken = new TokenizableString(sentence);
        toToken.tokenize();
    }
}

class TokenizableString{
    private String content;
    private int from, len;

    public TokenizableString(String content){
        this.content = content;
    }

    private boolean nextToken(String content){
        int i = 0;
        while(content.charAt(i) == ' ' && i < content.length()){
          i++;
        }

        from = i;
        while(content.charAt(i+1) != ' ' && i+1 < content.length()){
            i++;
        }
        len = i;

        return from != len;
    }

    public void tokenize(){
        if(nextToken(content)) {
            System.out.print("'");
            for(int j = from; j <= len; j++) {
                System.out.print(content.charAt(j));
            }
            System.out.print("'\n");
            content = content.substring(len+1);
            tokenize();
        }
    }
}
