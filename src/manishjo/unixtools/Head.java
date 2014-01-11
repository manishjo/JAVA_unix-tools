package manishjo.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

class showHead{
    public String printHead(String data, int times){
        String resultData = "";
        String result[] = data.split("\n");
        for(int i = 1;i<times;i++){
            resultData = resultData+"\n"+result[i];
        }
        return resultData;
    }
}
public class Head {
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
                showHead show_head = new showHead();
                data = show_head.printHead(data,times);
                System.out.println(data);
          }
}