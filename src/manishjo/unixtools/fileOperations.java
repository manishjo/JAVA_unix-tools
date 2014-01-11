package manishjo.unixtools;

import java.io.*;

/**
 * Created by manishjo on 1/11/14.
 */

public class fileOperations {
    public String readFile(String fileName){
        String current_line = null,data="";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((current_line = reader.readLine()) != null) {
                data += current_line+"\n";
            }
        }
        catch(Exception e){
            System.out.println("file not found");
        }
        return data.substring(0,data.length()-1);
    }

    public void writeFile(String fileName,String data){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            String[]  temp = data.split("\n");
            for(String line : temp)
                writer.println(line);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (UnsupportedEncodingException e) {
            System.out.println("file not found");
        }
    }
}