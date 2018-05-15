package main;

import main.lexerParser.Type;
import main.lexerParser.Variable;

import java.util.Random;

public class TTFunctions {

    public void openTimetableData(Variable variable)
    {
        if(variable.getValue()!=null)
            System.out.println("Opening timetableData file with name: "+variable.getValue());
        else
            System.out.println("Was not able to open timetableData with this name");
    }

    public String generateTimetable(String ttDataName, int arraySize)
    {
        System.out.println("Generating timetable with name: "+ttDataName+arraySize);
        return ttDataName+arraySize;
    }

    public int getFitness()
    {
        System.out.println("Fitnes value is: 5");
        return 5;
    }

    public int getClassroomCount(String name)
    {
        System.out.println("Getting classroom count for timetableData with name: "+name);
        System.out.println("Classroom count is equal to: 10");
        return 10;
    }

    public void print(String toPrint)
    {
        System.out.println("Printing on screen: "+toPrint);
    }

    public void printTT(String timetableName)
    {
        System.out.println("Printing TT statistics on screen for timetable with name: "+ timetableName);
    }

    public void printTTData(String timetableDataName)
    {
        System.out.println("Printing TTData statistics on screen for timetableData with name: "+ timetableDataName);
    }

    public void generatePDF(Variable variable)
    {
        System.out.println("Generating pdf for timetable with name: "+variable.getValue());
    }

    public void listTT()
    {
        System.out.println("In for loop listing all timetables connected to timetableData");
    }
}
