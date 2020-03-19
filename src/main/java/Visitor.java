import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.util.calendar.BaseCalendar;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.io.File;
import java.util.Scanner;

public class Visitor {
    private static final Logger logger = LogManager.getLogger(Visitor.class.getName());


    private String firstName;
    private String lastName;
    private String fullName = firstName+"_"+lastName;
    private LocalDate date;
    private LocalTime time;
    private String comments;
    private String assistedBy;

    public Visitor (String firstName, String lastName, LocalDate date,
                    LocalTime time,
                    String comments, String assistedBy){
        String fullName = firstName+"_"+lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.date =  LocalDate.now();
        this.time = LocalTime.now();
        this.comments = comments;
        this.assistedBy = assistedBy;

    }
    public static void main(String[] args) throws FileNotFoundException {
        Visitor Carlo = new Visitor("Carlo","Maranino",LocalDate.now(),LocalTime.now(),"Okay","Bibi");
        Carlo.save();
        Carlo.load("Carlo Maranino");
    }

    public String save(){
            String FileName = "visitor_"+this.fullName.toLowerCase()+".txt";
        try {
            FileWriter myWriter = new FileWriter(FileName);
            myWriter.write("First Name: "+firstName+"\nLast Name: " + this.lastName+"\nDate: "+date+"\nTime: "+time +"\nComments: "+this.comments+ "\nAssisted By: "+this.assistedBy);
            myWriter.close();
            logger.debug("Successfully wrote to the file.");
        } catch (IOException e) {
            logger.error("An error occurred when attempting to write to file.");
            e.printStackTrace();
        }
        return FileName;
    }
    public String load(String Name) throws FileNotFoundException {
        Name ="visitor_"+this.fullName.toLowerCase()+".txt";

        File myObj = new File(Name);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        System.out.println(myObj.getAbsolutePath());
        return "fullName";
    }
}
