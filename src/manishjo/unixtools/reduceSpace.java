package manishjo.unixtools;

import java.io.*;

class removeSpace{
        public String remove_extra_space(String data){
            return data.replaceAll("\\ +"," ");
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
                fileOperations fileWriter = new fileOperations();
                fileWriter.writeFile(args[0],data);
        }
}
