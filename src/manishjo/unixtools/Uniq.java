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
            for ( int i = 0 ; i < list.size() ; i ++){
                result += list.get(i)+"\n";
            }
            return result.substring(0,result.length()-1);
        }
 }

public class Uniq {
    public static void main(String[] args) {
        String data = "";
        int times = 10;
        try {
            String sCurrentLine;
            if(args.length == 1){
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                while ((sCurrentLine = br.readLine()) != null)
                    data = data+"\n"+sCurrentLine;
            }
            else{
                times = Integer.parseInt(args[0])+1;
                BufferedReader br = new BufferedReader(new FileReader(args[1]));
                while ((sCurrentLine = br.readLine()) != null)
                    data = data+"\n"+sCurrentLine;
            }
            removeRedundantLines results = new removeRedundantLines();
            data = results.removeCommonLines(data);
            writeFile fileWriter = new writeFile();
            fileWriter.write_in_File(args[0],data);
        }
        catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
