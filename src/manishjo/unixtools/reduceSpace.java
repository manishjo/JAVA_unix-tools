package manishjo.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class reduceSpace {
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
                showHead show_head = new showHead();
                data = show_head.printHead(data,times);
                System.out.println(data);
            }
            catch (Exception e) {
                System.out.println("file not found");
            }
        }
}
