package manishjo.unixtools;

import java.io.*;

class removeSpace{
        public String remove_extra_space(String data){
            return data.replaceAll("\\ +"," ");
        }
    }

class writeFile{
    public void write_in_File(String fileName,String content){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            String[]  temp = content.split("\n");
            for(String line : temp)
                writer.println(line);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

public class reduceSpace {
        public static void main(String[] args) {
            String data = null;
                String sCurrentLine;
                fileOperations fs = new fileOperations();
                data = fs.readFile(args[0]);
                removeSpace removeSpace = new removeSpace();
                data = removeSpace.remove_extra_space(data);
                writeFile fileWriter = new writeFile();
                fileWriter.write_in_File(args[0],data);
        }
}
