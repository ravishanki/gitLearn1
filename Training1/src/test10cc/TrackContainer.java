package test10cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrackContainer extends Thread
 {
	private List<String> input;
	private int threadNumber;
	private String log;
    
    public TrackContainer(List<String> input,int threadNumber) {
        this.threadNumber = threadNumber;
        this.input = input;
    }
    
    public void run() {
    	/*NotificationManager nm;
    	NotificationManager.sendMessage()*/
    }

    
    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
    

    
}

