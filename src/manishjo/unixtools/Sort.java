package manishjo.unixtools;

import java.util.Arrays;

/**
 * Created by manishjo on 1/11/14.
 */

public class Sort {
    public String showSortedData(String data){
        String lines[] = data.split("\n");
        String sortedData = null;
        Arrays.sort(lines);
        for(int i=0;i<lines.length;i++)
            sortedData += lines[i];
        return sortedData;
    }
}


