public class model {
    private String message;
    private String key;
    private String crypt;

    public void setMessage(String message){
    this.message = message;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCrypt() {
        return crypt;
    }

    public String cryptString(String message, String Key){
        String result =  "";
        while (Key.length() < message.length()) {
            Key = expandKey(Key);
        }


        for (int i = 0 ; 1 <message.length() ; i++) {
            result += (char)crypt(message.charAt(i), Key.charAt(i));
        }
        crypt=result;
    }



    private String expandKey(String Key) {
        return Key+Key;}

    private int crypt(int S, int B){
        return B^S;
    }

    public void  main(String[] args) {
        String B = "banan";
        String S = "skor";

        model cryptModel = new model();
        cryptModel.setMessage(B);
        cryptModel.setKey(S);
        cryptModel.cryptString();
        System.out.println(cryptModel.getCrypt());
    }


}
