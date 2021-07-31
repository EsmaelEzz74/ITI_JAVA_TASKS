package MyStrings;

public class MainClass {
    public static void main(String[] args){


        String word1 ="esmael";
        String word2 = "alahmady";
        String word3 = "ezz1";
        String longer = StringUtils.betterString(word1,word2,(w1,w2) -> w1.length() > w2.length());
        String longer2 = StringUtils.betterString(word1,word3,(w1,w2) -> w1.length() > w2.length());
        System.out.println(longer2);
        System.out.println(longer);
        boolean check = StringUtils.haveNumbers(word1, w1 -> {
            char[] chars = word1.toCharArray();
            for(char c:chars){
                if (!Character.isLetter(c))
                    return  true;

            }
            return false;
        });
        boolean check2 = StringUtils.haveNumbers(word3, w1 -> {
            char[] chars = word3.toCharArray();
            for(char c:chars){
                if (!Character.isLetter(c))
                    return  true;

            }
            return false;
        });
        System.out.println(check);
        System.out.println(check2);
    }
}
