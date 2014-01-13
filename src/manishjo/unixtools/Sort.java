package manishjo.unixtools;
import manishjo.unixtools.fileOprations.fs;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by manishjo on 1/11/14.
 */

class SortData {
    public String showSortedData(String data, int option){
        String lines[] = data.split("\n");
        String sortedData ="";
        if(option == 1)
            Arrays.sort(lines, Collections.reverseOrder());
        else
            Arrays.sort(lines);
        for(int i=0;i<lines.length;i++)
            sortedData += "\n"+lines[i];
        return sortedData;
    }
}

public class Sort {
    public static void main(String[] args) {
        String data;
        int options;
        fs fs = new fs();
        if(args.length == 2)
            options = 1;
        else
            options = 0;
        data = fs.readFile(args[0]);
        SortData show_head = new SortData();
        data = show_head.showSortedData(data,options);
        System.out.println(data);
    }
}




