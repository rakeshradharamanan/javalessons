public class StringReversal {
    public static void main(String[] args) {
        String inputString = "I am a bad boy!!";
        String reversedString = reverse(inputString);
        System.out.println("Your input string : "+inputString);
        System.out.println("Your reversed string : "+reversedString);
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();

        //String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));

        }
        return sb.toString();
    }
}