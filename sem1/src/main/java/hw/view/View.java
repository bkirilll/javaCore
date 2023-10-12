package hw.view;

import hw.service.Input;
import hw.service.Output;

import java.io.IOException;

public class View {

    public static void fileWriterPrint() throws IOException {
        System.out.println("Enter the note: ");
        String note = Input.inputData();
        Output.outputData(note);
    }
}
