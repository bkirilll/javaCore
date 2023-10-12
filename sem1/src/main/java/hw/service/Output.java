package hw.service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Output {

    static Date dateTime;
    public static void outputData(String text) throws IOException {
        FileWriter fileWriter = new FileWriter("notes.txt", true);
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        fileWriter.write(timeStamp + " -> " + text + "\n");
        fileWriter.flush();

    }
}
