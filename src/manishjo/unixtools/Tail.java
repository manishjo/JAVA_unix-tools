package manishjo.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

class showTail {
    public String printTail(String data, int times){
        String resultData = "";
        String result[] = data.split("\n");
        for(int i = result.length-times; i < result.length ;i++){
            resultData = resultData+"\n"+result[i];
        }

        return resultData;
    }
}
public class Tail {
    public static void main(String[] args) {
        String data = null;
        int times = 10;
        String sCurrentLine;
        fileOperations fs = new fileOperations();
            if(args.length == 1)
                data = fs.readFile(args[0]);
            else{
                times = Integer.parseInt(args[0]);
                data = fs.readFile(args[1]);
            }
        showTail show_tail = new showTail();
        data = show_tail.printTail(data, times);
        System.out.println(data);
    }
}