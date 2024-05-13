import java.util.HashMap;

public class TubeLines_10 {
    /**
     * Write a programme that tells you which line passes through particular stations.
     * Just use Zone 1 stations name
     */
// Declare HashMap to store station and line mapping
    HashMap<String,String> stationLines;
    // Constructor to initialise the HashMap
    public TubeLines_10(){
        stationLines = new HashMap<>();
        initializeStationLines();

        }
        // method to initialize the station and line mappings
    void initializeStationLines(){
        //Add station and line mappings for Zone 1 stations
        stationLines.put("King's Cross St pancrease","Victoria Line");
        stationLines.put("Waterloo","Bakerloo Line");
        stationLines.put("London Bridge" , "Jubeeli Line");
        stationLines.put("Leicester square", " Northern Line");
        stationLines.put("Paddington" , "District Line");
        stationLines.put("Euston" , "Northern Line");
    }
    //Method to find the lines passing through a particular station
    String findLineForStation(String station){
        return stationLines.getOrDefault(station,"station not found or Not in zone 1");
    }
    //Main Method
    public static void main(String[] args) {
        //Creat an instance of TubeLines
        TubeLines_10 tubeLines_10 = new TubeLines_10();
        // Stations for testing
        String[] stationsToCheck = {"King's Cross St Pancras", "Waterloo", "Oxford Circus", "Paddington"};
        // check which line passes through each station
        for (String station : stationsToCheck){
            String line = tubeLines_10.findLineForStation(station);
            System.out.println("The line passing through " + station+ " is :" + line);
        }
    }
    }


