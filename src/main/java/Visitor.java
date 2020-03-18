import sun.util.calendar.BaseCalendar;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.io.File;
import java.util.Scanner;

public class Visitor {


    private String firstName;
    private String lastName;
    private String fullName = firstName+"_"+lastName;
    private static Date date;
    private static Date time;
    private String comments;
    private String assistedBy;

    public Visitor (String firstName, String lastName, Date date,
                    Date time,
                    String comments, String assistedBy){
        String fullName = firstName+"_"+lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.date = new Date();
        this.time = time;
        this.comments = comments;
        this.assistedBy = assistedBy;

    }
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        File myObj = new File("VisitorLog.txt");
        Visitor Carlo = new Visitor("Carlo","Maranino",date,time,"Okay","Bibi");
        Carlo.save();
        Carlo.load("Carlo Maranino");
    }

    public String save(){

        try {
            FileWriter myWriter = new FileWriter("visitor_"+this.fullName.toLowerCase()+".txt");
            myWriter.write("First Name: "+this.firstName+" Last Name: " + this.lastName+" Date: "+date+" time: "+time +" Comments: "+this.comments+ " Assisted By: "+this.assistedBy);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "done";
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
        return "fullName";
    }
}
