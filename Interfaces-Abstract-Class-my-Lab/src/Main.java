import java.util.ArrayList;
import java.util.List;

/**
 * Created by owlslubic on 6/28/16.
 */
public class Main {

    public static void main(String[] args){

        List<Remote> remotes = new ArrayList<>();
        remotes.add(new Panasonic());
        remotes.add(new Samsung());
        remotes.add(new LG());

        for (Remote remote : remotes){

            System.out.println("\nThank you for using this " + remote.getRemoteBrand() + " brand remote.");

            remote.numberButtonPressed(1); // change this int to be changeable?
            remote.volumeUp();
            remote.volumeDown();
            remote.channelUp();
            remote.channelDown();
            System.out.println("This " + remote.getRemoteBrand() + " brand remote supports USB: " + remote.getSupportsUsb());
            System.out.println("This " + remote.getRemoteBrand() + " brand remote is rechargeable: " + remote.isRechargeable());
            System.out.println("This " + remote.getRemoteBrand() + " brand remote is waterproof: " + remote.isWaterProof());

        }


    }
}
