public class MegaByteConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int reminder = kiloBytes % 1024;
        if(kiloBytes >= 0)
             System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + reminder + " KB");
        else
            System.out.println("Invalid Value");

    }
}
