package manishjo.unixtools;

import java.io.*;
import java.util.ArrayList;

class removeRedundantLines {
    public String removeCommonLines(String data){
            String result="";
            int index;
            ArrayList list = new ArrayList();
            String[] temp = data.split("\n");
            int length = temp.length;
            for (index = 1 ; index < length ; index++){
                if(!temp[index-1].equals(temp[index]))
                    list.add(temp[index-1]);
            }
            list.add(temp[index-1]);
            for ( int i = 0 ; i < list.size() ; i ++)
                result += list.get(i)+"\n";
            return result.substring(0,result.length()-1);
        }
 }

public class Uniq {
    public static void main(String[] args) {
        String data = null;
        int times = 10;
        String sCurrentLine;
        fileOperations fs = new fileOperations();
        if(args.length == 1)
            data = fs.readFile(args[0]);
        else{
            times = Integer.parseInt(args[0])+1;
            data = fs.readFile(args[1]);
        }
        removeRedundantLines results = new removeRedundantLines();
        data = results.removeCommonLines(data);
        writeFile fileWriter = new writeFile();
        fileWriter.write_in_File(args[0],data);
    }
}