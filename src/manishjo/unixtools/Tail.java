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

                times = Integer.parseInt(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(args[1]));
                while ((sCurrentLine = br.readLine()) != null)
                    data = data+"\n"+sCurrentLine;

            }
            showTail show_tail = new showTail();
            data = show_tail.printTail(data, times);
            System.out.println(data);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}