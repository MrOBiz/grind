package obj2;

import java.util.Scanner;

public class Tokens {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String sentence;
        System.out.println("Entrez une chaine :");
        sentence = scanner.nextLine();
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

    private boolean nextToken(){
        return false;
    }

    public void tokenize(){}
}
