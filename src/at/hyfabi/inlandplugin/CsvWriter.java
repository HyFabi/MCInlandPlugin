package at.hyfabi.inlandplugin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvWriter {
	List<String[]> dataLines = new ArrayList<>();
	public void test() {
		dataLines.add(new String[] 
		  { "John", "Doe", "38", "Comment Data\nAnother line of comment data" });
		dataLines.add(new String[] 
		  { "Jane", "Doe, Jr.", "19", "She said \"I'm being quoted\"" });

	}

	public void givenDataArray_whenConvertToCSV_thenOutputCreated() throws IOException {
	    File csvOutputFile = new File("test.csv");
	    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
	        dataLines.stream()
	          .map(this::convertToCSV)
	          .forEach(pw::println);
	    }
	    
	}
	
	public String convertToCSV(String[] data) {
	    return Stream.of(data)
	      .collect(Collectors.joining(","));
	}
}
