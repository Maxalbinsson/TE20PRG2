public class model {

    public model() {
    }

    public static void main(String[] args) {
        String B = "banan";
        String S = "skor";

        model cryptModel = new model();
        System.out.println(cryptModel.cryptString(S,B));
    }
    private String message;
    private String key;
    private String crypt;

    public void setMessage(String message){

    }

    public String cryptString(String message, String Key){
        String result = "";
        while (Key.length() < message.length()) {
            Key = expandKey(Key);
        }
        for (int i = 0 ; 1 <message.length() ; i++) {
            result += (char)crypt(message.charAt(i), Key.charAt(i));
        }
        return result;
    }



    private String expandKey(String Key) {return Key+Key;}

    private int crypt(int S, int B){
        return B^S;
    }

    public static void  (String[] args) {
        model cryptModel = new model();
    }


}
