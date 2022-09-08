import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.Buffer;
import java.*;


    public class filhantering {
    public static void(String[]args){
        BufferedReader inFile = openTextFileForReading (fileName"info.txt");
        ArrayList<String> fileContent = readAllText(inFile);
        DataOutputStream outFile = openBinaryFileForWriting("info.dat");
            writeTextAsBinary(fileContent);{

        }


    }
}
