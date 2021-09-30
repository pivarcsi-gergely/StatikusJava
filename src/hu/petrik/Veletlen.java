package hu.petrik;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public final class Veletlen {

    private static Random random = new Random();
    //private static List<String> egyesuletek = feltolt("egyesulet.txt");
    //private static List<String> esemenyTipusok = feltolt("esemenytipus.txt");
    private static List<String> ferfiKerNevek = feltolt("ferfikernev.txt");
    private static List<String> noiKerNevek = feltolt("noikernev.txt");
    //private static List<String> sportagok = feltolt("sportag.txt");
    private static List<String> VezNevek = feltolt("veznev.txt");

    private Veletlen(){}

    private static List<String> feltolt(String fajlNev){
        List<String> fajlSorai = new ArrayList<>();
        try{
            fajlSorai = Files.readAllLines(Paths.get(fajlNev));
        }
        catch (IOException e){
            e.getMessage();
        }
        return fajlSorai;
    }

    public static int velEgesz(int max, int min){
        return random.nextInt(max-min+1)+min;
    }

    public static char velKarakter(char max, char min){
        return (char)velEgesz(min, max);
    }

    public static String velVezeteknev(){
        return VezNevek.get(random.nextInt(VezNevek.size()));
        //return VezNevek.get(velEgesz(0, VezNevek.size()-1));
    }

    public static String velKeresztnev(boolean nem){
        String keresztNev = "";
        if (nem){
            keresztNev = ferfiKerNevek.get(random.nextInt(ferfiKerNevek.size()));
        }
        else{
            keresztNev = noiKerNevek.get(random.nextInt(noiKerNevek.size()));
        }
        return keresztNev;
    }

    public static String velKeresztnev(){
        return velKeresztnev(random.nextBoolean());
    }


    public static String velTeljesnev(boolean nem){
        return String.format("%s %s", velVezeteknev(), velKeresztnev(nem));
    }
}
