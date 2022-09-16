public class kryptering2 {
    public static void main(String[]args){

        Kryptering test = new Kryptering();
    test.setKey("(((");
    test.setMessage("Holla");
    test.setkryptering();

        int a = test.cipher[0];
        int b = test.cipher[1];
        int c = test.cipher[2];


        System.out.println(""+(char)a+(char)b+(char)c);
       }

    public void setKey(){

        String e = "H";


    }
}
