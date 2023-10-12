package hw.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    static String note;
    public static String inputData() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        note = bufferedReader.readLine();
        return note;
    }
}
